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
        this.title = title.strip();
        this.authors = authors;
        this.body = body.strip();
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        String authorsString = String.join(", ", this.getAuthors()) + ".";
        String keywordsString = String.join(", ", this.getKeywords()) + ".";

        String[] words = this.getBody().split("\\s+");
        StringBuilder bodyBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            bodyBuilder.append(words[i]).append(" ");
            if ((i + 1) % 9 == 0) {
                bodyBuilder.append("\n");
            }
        }

        return "TÍTULO: " + this.getTitle() + "\n\nAUTORES: " + authorsString
                + "\n\nRESUMEN\n" + bodyBuilder.toString() + "\n\nPALABRAS CLAVES: \n" + keywordsString + "\n";
    }

    /**
     * Cuenta el número de ocurrencias de una palabra en el resumen.
     *
     * @param word la palabra a buscar en el resumen
     * @return el número de ocurrencias de la palabra en el resumen
     */
    public int countOccurrences(String word) {
        int count = 0;
        int index = 0;
        while ((index = this.getBody().indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }
        return count;
    }

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

}
