package AppClasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import GUI.Classes.Inicio;

/**
 *
 * @author andre && angel granado
 */
public class MetroMendeley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileFunctions f = new FileFunctions();
        f.readDefaultFile();
        Inicio main = new Inicio();
        main.setVisible(true);
    }
    
}
