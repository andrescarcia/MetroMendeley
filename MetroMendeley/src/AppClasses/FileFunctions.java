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

    /**
     * Lee y actualiza el fichero por defecto que contiene la información de los
     * artículos.
     */
    public static void updateDefaultFile() {
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
            // Con arrayAux5[0] se accede al resumen del paper. 
            arrayAux5 = arrayAux3[1].split("Palabras claves:");
            // Con arrayAux6 Se tiene un arreglo que contiene todas las palabras claves de ese paper. 
            arrayAux6 = arrayAux5[1].split(",");
            for (int j = 0; j < arrayAux6.length; j++) {
                arrayAux6[j] = arrayAux6[j].replace("\n", "").replace(".", "");
                //arrayAux6[j] = arrayAux6[j].substring(0, 1).toUpperCase() + arrayAux6[j].substring(1);
            }
            // Se crea el objeto SUMARY que contendrá todo lo anteriormente mencionado como atributo. 
            Summary sumary = new Summary(arrayAux2[0], arrayAux4, arrayAux5[0], arrayAux6);
            // Se agrega el paper al hashTable 
            int position = App.getInstance().getHashTable().addSumary(sumary);
            // Se agrega los keywords al hashtable secundario (util para el requerimiento 3). 
            App.getInstance().getHashTable().addKeyword(arrayAux6, position);
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
    public static void uploadSumary(String path) {
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

        try {
            //Primero verificamos que el txt tiene el formato indicado
            if (!txt.contains("Autores") || !txt.contains("Resumen") || !txt.contains("Palabras claves:")) {
                throw new Exception("El Txt no tiene el formato indicado!");
            }

            String[] arrayAux2 = txt.split("Autores");
            String[] arrayAux3, arrayAux4, arrayAux5, arrayAux6;
            // Con arrayAux2[0] se accede al titulo del paper. 
            arrayAux3 = arrayAux2[1].split("Resumen");
            // Con arrayAux4 se tiene un arreglo que contiene todos los autores de ese paper. 
            arrayAux4 = arrayAux3[0].split("\n");
            // Con arrayAux5[0] se accede al resumen del paper.
            if (arrayAux3[1].contains("Palabras claves:")) {
                arrayAux5 = arrayAux3[1].split("Palabras claves:");
            } else {
                arrayAux5 = arrayAux3[1].split("Palabras Claves:");
            }
            // Con arrayAux6 Se tiene un arreglo que contiene todas las palabras claves de ese paper. 
            arrayAux6 = arrayAux5[1].split(",");
            // Se crea el objeto SUMARY que contendrá todo lo anteriormente mencionado como atributo. 
            Summary sumary = new Summary(arrayAux2[0], arrayAux4, arrayAux5[0], arrayAux6);
            // Se agrega temporalmente al hashTable el paper (OJO, es temporalmente porque todavía falta el método DoubleHashing que evite las posible colisiones derivadas de DBJ2
            App.getInstance().getHashTable().addSumary(sumary);
            JOptionPane.showMessageDialog(null, "Su archivo se logró cargar efectivamente.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logró cargar el archivo. No cumple con el formato adecuado.");
        }
    }

}
