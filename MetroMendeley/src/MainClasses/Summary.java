/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;

/**
 *
 * @author Erika Hernández && Angel Granado
 */
public class Summary {

    private String title;
    private String[] authors;
    private String body;
    private String[] keywords;

    public Summary(String title, String[] authors, String body, String[] keywords) {
        this.title = title;
        this.authors = authors;
        this.body = body;
        this.keywords = keywords;
    }

    /**
     *
     * Devuelve un String con la información del resumen en un formato legible
     * para el usuario. Incluye el título, autores y palabras clave con su
     * frecuencia de aparición en el resumen.
     *
     * @return String con la información del resumen.
     */
    public String showAttr() {
        String authorsString = "";
        for (String author : this.authors) {
            authorsString += author + ", ";
        }
        String keywordsString = "";
        for (String keyword : this.keywords) {
            int counter = 0;
            int position = this.body.toLowerCase().indexOf(keyword.toLowerCase().replace("\n", "").replace(".", ""));
            while (position != -1) {
                counter++;
                position = this.body.toLowerCase().indexOf(keyword.toLowerCase().replace("\n", "").replace(".", ""), position + 1);
            }
            keywordsString += "- " + keyword.replace("\n", "") + ": Frecuencia con la cual aparece en el resumen: " + counter + " veces.\n";
        }
        return "TÍTULO: " + this.title + "\n" + "AUTORES: " + authorsString
                + "\n " + "\n RESUMEN: " + body 
                + "\n" + "\n" + "PALABRAS CLAVES: \n" + keywordsString;
    }

    // Getters & Setters
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the authors
     */
    public String[] getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return the keywords
     */
    public String[] getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
    String authorsString = String.join(", ", this.authors) + ".";
    String keywordsString = String.join(", ", this.keywords) + ".";

    String[] words = this.body.split("\\s+");
    StringBuilder bodyBuilder = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
        bodyBuilder.append(words[i]).append(" ");
        if ((i+1) % 9 == 0) {
            bodyBuilder.append("\n");
        }
    }
    
    return "TÍTULO: " + this.title + "\nAUTORES: " + authorsString
            + "\n\nRESUMEN\n" + bodyBuilder.toString() + "\n\nPALABRAS CLAVES: \n" + keywordsString;
}

}
