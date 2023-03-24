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
import javax.swing.JTextArea;

/**
 *
 * @author Angel Granado
 */
public class Helpers {

    private final App app = App.getInstance();

    /////////////////////////// METODOS USADOS EN BuscarKeyword.java  /////////////////////////////
    /**
     *
     * @param showInfo
     * @param selectKeywordOptions
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
     *
     * @param selectKeywordOptions
     * @param selectPaper
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
     *
     * @param selectPaper
     * @param showInfo
     */
    public void searchPaperByKeyword(JComboBox<String> selectPaper, JTextArea showInfo) {
        String title = (String) selectPaper.getSelectedItem();
        int firstHash = app.getHashTable().DBJ2(title);
        int index = firstHash;
        Summary paperSelected = app.getHashTable().getSummaries()[index];

        //Si coinciden, mostramos la informacion del paper
        if (paperSelected.getTitle().strip().equalsIgnoreCase(title.strip())) {
            showInfo.setText("Informacion del Articulo Seleccionado\n\n"
                    + paperSelected.toString());
            System.out.println(paperSelected.toString());
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
            System.out.println(paperSelected.toString());
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
}
