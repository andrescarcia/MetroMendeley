/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppClasses;

import MainClasses.HashTable;
import MainClasses.PapersPositionsList;

/**
 * Descipción: Clase App
 *
 * @author Erika Hernández & Angel Granado
 */
public class App {

    private HashTable hashTable;
    private static App app;
    private PapersPositionsList listPositions;
  

    public App() {
        this.hashTable = new HashTable(30, 300);
        this.listPositions = new PapersPositionsList();
    }

    /**
     * Devuelve una instancia única de la aplicación.
     *
     * @return La instancia única de la aplicación.
     */
    public static synchronized App getInstance() {
        if (app == null) {
            app = new App();
        }
        return app;
    }

    /**
     * @return the hashTable
     */
    public HashTable getHashTable() {
        return hashTable;
    }

    /**
     * @param hashTable the hashTable to set
     */
    public void setHashTable(HashTable hashTable) {
        this.hashTable = hashTable;
    }

    /**
     * @return the listPositions
     */
    public PapersPositionsList getListPositions() {
        return listPositions;
    }

    /**
     * @param listPositions the listPositions to set
     */
    public void setListPositions(PapersPositionsList listPositions) {
        this.listPositions = listPositions;
    }


    
    
}
