/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Classes;

import AppClasses.App;
import MainClasses.LinkedList;
import MainClasses.Node;
import MainClasses.Summary;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * Funciones implementadas en las clases de GUI
 *
 * @author Angel Granado && Erika Hernandez
 */
public class Helpers {

    private final App app = App.getInstance();

    ////////////////////////// METODOS USADOS EN AnalizarResumen.java  ///////////////////////////
    /**
     *
     * Llena el JTextArea con la información de los papers de los resúmenes
     * almacenados en la aplicación. Además, llena un objeto JComboBox con los
     * mismos títulos. Todo en forma alfabetica
     *
     * @param showInfo el JTextArea en el que se mostrará la información de los
     * papers.
     * @param selectTitleOptions el JComboBox en el que se mostrarán los
     * títulos.
     */
    public void fillInfoTitles(JTextArea showInfo, JComboBox<String> selectTitleOptions) {
        String text = "";
        selectTitleOptions.removeAllItems();
        Node<Integer> pAux = app.getListPositions().getpFirst();
        while (pAux != null) {
            String title = app.getHashTable().getSummaries()[pAux.getTInfo()].getTitle();
            selectTitleOptions.addItem(title);
            text += "- " + title + "\n\n";
            pAux = app.getListPositions().next(pAux);
        }
        showInfo.setText(text);
    }

    /**
     * Busca un resumen de papel según el título seleccionado en un JComboBox y
     * muestra su información en un JTextArea.
     *
     * @param selectPaper JComboBox que contiene los títulos de los resúmenes de
     * papel.
     * @param showInfo JTextArea donde se mostrará la información del resumen de
     * papel seleccionado.
     */
    public void searchPaperByTitle(JComboBox<String> selectPaper, JTextArea showInfo) {
        try {
            String info = "";
            String title = (String) selectPaper.getSelectedItem();
            Summary summary = app.getHashTable().searchSummary(title);
            String[] keywords = summary.getKeywords();
            String autores = String.join(", ", summary.getAuthors());
            info += title + "\n\n" + "Autores: " + autores + "\n\nFrecuencias de las palabras claves:\n";

            for (String keyword : keywords) {
                int occurrency = summary.countOccurrences(keyword);
                info += "-" + keyword + ": " + occurrency + "\n";
            }

            showInfo.setText(info);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No seleccionó ningún título");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////// METODOS USADOS EN BuscarKeyword.java  /////////////////////////////
    /**
     * Rellena un TextArea y un jCombo con las palabras clave de los resúmenes
     * almacenados en la tabla hash.
     *
     * @param showInfo el TextArea donde se muestra la información
     * @param selectKeywordOptions el jCombo donde se muestran las opciones de
     * palabras clave
     */
    public void fillInfoKeyWord(JTextArea showInfo, JComboBox<String> selectKeywordOptions) {
        String text = "";
        for (Summary summary : app.getHashTable().getSummaries()) {
            if (summary != null) {
                for (String keyword : summary.getKeywords()) {
                    selectKeywordOptions.addItem(keyword.strip());
                    text += "-" + keyword.strip() + "\n";
                }
            }
        }
        showInfo.setText(text);
    }

    /**
     * Rellena el JComboBox selectPaper con los títulos de los resúmenes
     * relacionados a la palabra clave seleccionada en selectKeywordOptions.
     *
     * @param selectKeywordOptions JComboBox que contiene todas las palabras
     * claves disponibles para buscar resúmenes.
     * @param selectPaper JComboBox que se rellenará con los títulos de los
     * resúmenes relacionados a la palabra clave seleccionada.
     */
    public void fillSelectPaper(JComboBox<String> selectKeywordOptions, JComboBox<String> selectPaper) {

        String keyWordSelected = (String) selectKeywordOptions.getSelectedItem();
        int firstHash = app.getHashTable().DBJ2(keyWordSelected);
        int indexKeyWord = firstHash;
        LinkedList<Integer> papersPositions = app.getHashTable().getKeywords()[indexKeyWord];

        //Verificamos si la posicion corresponde
        if (keyWordSelected.strip().equalsIgnoreCase(papersPositions.getpFirst().getKey().strip())) {
            //Mostramos todos los papers relacionados con la palabra clave
            Node<Integer> pAux = papersPositions.getpFirst();
            for (int i = 0; i < papersPositions.getiSize(); i++) {
                String title = app.getHashTable().getSummaries()[pAux.getTInfo()].getTitle();
                selectPaper.addItem(title);
                pAux = papersPositions.next(pAux);
            }
        } else {
            //Hay una colision
            int hashAux = app.getHashTable().doubleHash(keyWordSelected);
            int n = 0;
            while (!app.getHashTable().getKeywords()[indexKeyWord].getpFirst().getKey().equalsIgnoreCase(keyWordSelected)) {
                n++;
                // Se asigna index nuevo usando metodo double hashing., 
                indexKeyWord = (firstHash + n * hashAux) % app.getHashTable().getKeywords().length;
            }
            //Mostramos todos los papers relacionados con la palabra clave
            papersPositions = app.getHashTable().getKeywords()[indexKeyWord];
            Node<Integer> pAux = papersPositions.getpFirst();
            for (int i = 0; i < papersPositions.getiSize(); i++) {
                String title = app.getHashTable().getSummaries()[pAux.getTInfo()].getTitle();
                selectPaper.addItem(title);
                pAux = papersPositions.next(pAux);
            }

        }
    }

    /**
     * Busca un paper en base al título seleccionado en el JComboBox y muestra
     * su información en el JTextArea correspondiente. En el mejor de los casos,
     * la busqueda es de O(1), en el peor (cuando hay una colision), es de O(n)
     * donde n es la cantidad de ariculos registrados.
     *
     * @param selectPaper JComboBox que contiene los títulos de los papers
     * relacionados con la palabra clave seleccionada.
     * @param showInfo JTextArea en el cual se muestra la información del paper
     * seleccionado.
     */
    public void searchPaperByKeyword(JComboBox<String> selectPaper, JTextArea showInfo) {
        String title = (String) selectPaper.getSelectedItem();
        int firstHash = app.getHashTable().DBJ2(title);
        int index = firstHash;
        Summary paperSelected = app.getHashTable().getSummaries()[index];

        //Si coinciden, mostramos la informacion del paper
        if (paperSelected.getTitle().strip().equalsIgnoreCase(title.strip())) {
            showInfo.setText(paperSelected.toString());
        } else {
            //Si no coinciden, hay una colision
            int hashAux = app.getHashTable().doubleHash(title);
            int n = 0;
            while (!title.strip().equalsIgnoreCase(app.getHashTable().getSummaries()[index].getTitle().strip())) {
                n++;
                // Se asigna index nuevo usando metodo double hashing., 
                index = (firstHash + n * hashAux) % app.getHashTable().getSummaries().length;
            }
            paperSelected = app.getHashTable().getSummaries()[index];
            showInfo.setText("Informacion del Articulo Seleccionado\n\n"
                    + paperSelected.toString());
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
}
