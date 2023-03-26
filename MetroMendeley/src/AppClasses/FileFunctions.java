/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import MainClasses.Summary;

/**
 *
 * @author Angel Granado && Erika Hernández
 */
public class FileFunctions {

    private App app = App.getInstance();

    /**
     * Lee y actualiza el fichero por defecto que contiene la información de los
     * artículos.
     */
    public void readDefaultFile() {
        String path = "test\\DefaultFile.txt";
        String line;
        String txt = "";

        //// LEER EL TXT de DefaultFile  Y ALMACENARLO EN UNA VARIABLE 
        File file = new File(path);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                txt += line + "\n";
            }
            br.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logró cargar el archivo. Intente nuevamente.");
        }
        String[] arrayAux1 = txt.split("%");
        String[] arrayAux2, arrayAux3, arrayAux4, arrayAux5, arrayAux6;

        for (String arrayAux11 : arrayAux1) {
            arrayAux2 = arrayAux11.split("Autores\n");
            // Con arrayAux2[0] se accede al titulo del paper. 
            arrayAux3 = arrayAux2[1].split("Resumen");
            // Con arrayAux4 se tiene un arreglo que contiene todos los autores de ese paper. 
            arrayAux4 = arrayAux3[0].split("\n");

            //quitamos los espacios
            for (int i = 0; i < arrayAux4.length; i++) {
                arrayAux4[i] = arrayAux4[i].strip();
            }

            // Con arrayAux5[0] se accede al resumen del paper. 
            arrayAux5 = arrayAux3[1].split("Palabras claves:");
            // Con arrayAux6 Se tiene un arreglo que contiene todas las palabras claves de ese paper. 
            arrayAux6 = arrayAux5[1].split(",");

            for (int j = 0; j < arrayAux6.length; j++) {
                arrayAux6[j] = arrayAux6[j].replace("\n", "").replace(".", "").strip();
                //arrayAux6[j] = arrayAux6[j].substring(0, 1).toUpperCase() + arrayAux6[j].substring(1);
            }
            // Se crea el objeto SUMARY que contendrá todo lo anteriormente mencionado como atributo. 
            Summary summary = new Summary(arrayAux2[0].strip(), arrayAux4, arrayAux5[0], arrayAux6);
            // Se agrega el paper al hashTable 
            int position = app.getHashTable().addSumary(summary);
            // Se agrega los keywords al hashtable secundario (util para el requerimiento 3). 
            app.getHashTable().addKeyword(summary.getKeywords(), position);
             // Se agrega los keywords al hashtable secundario (util para el requerimiento 3). 
            app.getHashTable().addAutor(summary.getAutor(), position);
        }
    }

    /**
     *
     * Este método se encarga de leer un archivo de texto con un formato
     * específico y a partir de ello, crear un objeto Summary y agregarlo
     * temporalmente al hashTable.
     *
     * @param path La ruta del archivo de texto a leer.
     */
    public void uploadHashTableInfo(String path) {
        String line;
        String txt = "";

        File file = new File(path);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                txt += line + "\n";
            }
            br.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logró cargar el archivo. Intente nuevamente.");
        }

        try {
            //Primero verificamos que el txt tiene el formato indicado
            if (this.isValidFormat(txt)) {
                String[] arrayAux2 = txt.split("Autores");
                String[] arrayAux3, arrayAux4, arrayAux5, arrayAux6;
                // Con arrayAux2[0] se accede al titulo del paper. 
                if (!this.existsPaper(arrayAux2[0].strip())) {
                    arrayAux3 = arrayAux2[1].split("Resumen");
                    // Con arrayAux4 se tiene un arreglo que contiene todos los autores de ese paper. 
                    arrayAux4 = arrayAux3[0].split("\n");

                    String[] autores = new String[arrayAux4.length - 1];

                    //quitamos los espacios
                    for (int i = 1; i < arrayAux4.length; i++) {
                        autores[i - 1] = arrayAux4[i].replace(",", "").strip();
                    }

                    // Con arrayAux5[0] se accede al resumen del paper.
                    if (arrayAux3[1].contains("Palabras claves:")) {
                        arrayAux5 = arrayAux3[1].split("Palabras claves:");
                    } else if (arrayAux3[1].contains("Palabras Claves:")) {
                        arrayAux5 = arrayAux3[1].split("Palabras Claves:");
                    } else {
                        arrayAux5 = arrayAux3[1].split("palabras claves:");
                    }

                    // Con arrayAux6 Se tiene un arreglo que contiene todas las palabras claves de ese paper. 
                    arrayAux6 = arrayAux5[1].split(",");
                    for (int j = 0; j < arrayAux6.length; j++) {
                        arrayAux6[j] = arrayAux6[j].replace("\n", "").replace(".", "").strip();
                    }

                    // Se crea el objeto SUMMARY que contendrá todo lo anteriormente mencionado como atributo. 
                    Summary summary = new Summary(arrayAux2[0], autores, arrayAux5[0], arrayAux6);
                    int position = app.getHashTable().addSumary(summary);
                    app.getHashTable().addKeyword(summary.getKeywords(), position);
                    JOptionPane.showMessageDialog(null, "Carga exitosa!");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya existe un articulo registrado con el titulo:\n"
                            + arrayAux2[0] + "\nIngrese un archivo con una articulo distinto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo no tiene el formato indicado!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logró cargar el archivo. No cumple con el formato adecuado.");
        }
    }

    public void saveHashTable() {

    }

    /**
     * @return the app
     */
    public App getApp() {
        return app;
    }

    /**
     * @param app the app to set
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * Verifica si el texto tiene el formato requerido para ser procesado. El
     * texto debe contener las palabras "autores", "resumen" y "palabras
     * claves:", cada palabra debe aparecer una única vez en el texto.
     *
     * @param txt el texto que se desea verificar.
     * @return true si el texto tiene el formato requerido, false si no lo
     * tiene.
     */
    public boolean isValidFormat(String txt) {
        boolean b = true;

        if (!txt.toLowerCase().contains("autores") || !txt.toLowerCase().contains("resumen") || !txt.toLowerCase().contains("palabras claves:")) {
            b = false;
        }

        if (this.countOccurrences(txt, "autores") != 1 || this.countOccurrences(txt, "resumen") != 1 || this.countOccurrences(txt, "palabras claves:") != 1) {
            b = false;
        }
        return b;
    }

    /**
     * Cuenta el número de veces que una palabra dada aparece en un texto.
     *
     * @param text el texto en el que se busca la palabra
     * @param word la palabra que se busca en el texto
     * @return el número de veces que la palabra aparece en el texto
     */
    public int countOccurrences(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }
        return count;
    }

    /**
     * Verifica si un paper con el título especificado existe en la tabla hash
     *
     * @param title el título del paper que se desea buscar.
     * @return true si el paper existe en la tabla hash, false de lo contrario.
     */
    public boolean existsPaper(String title) {
        Summary summary = app.getHashTable().searchSummary(title);
        return summary != null;
    }

}
