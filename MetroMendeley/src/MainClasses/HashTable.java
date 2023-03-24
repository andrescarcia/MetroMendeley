/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;

/**
 * Descripción: Primitiva HashTable
 *
 * @author Erika Hernández && Angel Granado
 */
public class HashTable {

    private Summary[] summaries;
    private LinkedList<Integer>[] keywords;

    // Constructor vacío
    public HashTable(int i, int j) {
        this.summaries = new Summary[i];
        this.keywords = new LinkedList[j];

    }

    // Método: Hash Function DJB2 para obtener un index del artículo científico a partir de su title. 
    public int DBJ2(String title) {
        // Se designa al comienzo el numero primo 5381 descrito por Bernstein
        long hash = 5381;
        for (int i = 0; i < title.length(); i++) {
            // Se multiplica por 2^5 bits el resultado y se suma el valor ASCII del carácter actual al resultado obtenido en cada iteración.
            hash = ((hash * 32) + hash) + title.charAt(i);
        }
        // Si el valor del hash obtenido es negativo por overflow, se convierte a positivo.
        if (hash < 0) {
            hash = -hash;
        }
        // Se obtiene el residuo del modulo del hash % len del array del hashTable. 
        return Long.valueOf(hash % Long.valueOf(this.getSummaries().length)).intValue();
    }

    // Método: doubleHashing para el manejo de colisiones. 
    public int doubleHash(String title) {
        //Se selecciona un número primo para evitar patrones en la secuencia de saltos que se generan en caso de colisiones. 
        int prime = 31;
        int hash2 = prime - (DBJ2(title) % prime);
        return hash2;
    }

    // Añadir Resumen 
    public int addSumary(Summary summary) {
        // Se llama al Hash function pripcipal DBJ2  
        int hash1 = DBJ2(summary.getTitle());
        // Se llama al DoubleHash para el manejo de colisiones.
        int hash2 = doubleHash(summary.getTitle());
        // Se crea una variable de iteraciones para poder seguir generando index de ser requerida mas iteraciones.
        int i = 0;
        // Se asigna como index inicial al hash1
        int index = hash1;
        // Se valida si esta vacío el slot. 
        if (this.getSummaries()[index] == null) {
            this.getSummaries()[index] = summary;
            // Si no esta vacio se valida si se esta intentado meter el mismo paper ya cargado.
        } else if (this.getSummaries()[index].getTitle().equals(summary.getTitle())) {
            // Si ninguno de los casos anteriores es, entonces estamos frente a una colisión y se soluciona. 
        } else {
            // Se itera hasta que el index este libre en el array. 
            while (this.getSummaries()[index] != null) {
                i++;
                // Se asigna index nuevo usando metodo double hashing., 
                index = (hash1 + i * hash2) % this.getSummaries().length;
            }
            // Se agrega al array. 
            this.getSummaries()[index] = summary;
            return index;
        }
        return index;
    }

    /**
     *
     * Agrega una lista de palabras clave a la tabla hash de palabras clave de
     * los summaries. Si la palabra clave ya existe en la tabla, se agrega la
     * posición del resumen a la lista de posiciones de la palabra clave.
     *
     * @param keywordArray el arreglo de palabras clave a agregar a la tabla
     * hash
     * @param position la posición del resumen al que pertenecen las palabras
     * clave en el arreglo de resúmenes
     */
    public void addKeyword(String[] keywordArray, int position) {
        for (int i = 0; i < keywordArray.length; i++) {
            // Se llama al Hash function pripcipal DBJ2  
            int hash1 = DBJ2(keywordArray[i]);
            // Se llama al DoubleHash para el manejo de colisiones.
            int hash2 = doubleHash(keywordArray[i]);
            // Se crea una variable de iteraciones para poder seguir generando index de ser requerida mas iteraciones.
            int j = 0;
            // Se asigna como index inicial al hash1
            int index = hash1;
            // Se valida si esta vacío el slot. 
            if (this.getKeywords()[index].isEmpty()) {
                this.getKeywords()[index].addEnd(position);
                this.getKeywords()[index].getpFirst().setKey(keywordArray[i]);
                // Si no esta vacio se valida si se esta intentado meter el mismo int (index del title) ya cargado.
            } else {
                // si el keyword coincide con el key del primer nodo de la lista, entonces se agrega al final de la lista
                if (keywordArray[i].equalsIgnoreCase(this.getKeywords()[index].getpFirst().getKey())) {
                    this.getKeywords()[index].addEnd(position);

                    //si no, entonces el se maneja la colision
                } else {
                    while (!this.getKeywords()[index].isEmpty()) {
                        i++;
                        // Se asigna index nuevo usando metodo double hashing., 
                        index = (hash1 + i * hash2) % this.getSummaries().length;
                    }
                    this.getKeywords()[index].addEnd(position);
                    this.getKeywords()[index].getpFirst().setKey(keywordArray[i]);
                }
            }
        }
    }

    /**
     * Muestra los títulos de los artículos almacenados en el hash table en
     * orden alfabético.
     *
     * @return un String con los títulos de los artículos en orden alfabético
     */
    public String showArticlesAlphabetic() {
        String text = "";
        for (int i = 0; i < this.getSummaries().length; i++) {
            if (this.getSummaries()[i] != null) {
                text += i + ". " + this.getSummaries()[i].getTitle() + "\n";
            }
        }
        return text;
    }

    /**
     * Genera un String con todas las palabras claves de los resúmenes
     * almacenados en la colección, ordenadas alfabéticamente.
     *
     * @return un String con todas las palabras claves de los resúmenes
     * almacenados en la colección, ordenadas alfabéticamente.
     */
    public String showKeywordsAlphabetic() {
        String text = "";
        for (Summary summarie : this.getSummaries()) {
            if (summarie != null) {
                for (String keyword : summarie.getKeywords()) {
                    text += "-  " + keyword + "\n";
                }
            }
        }
        return text;
    }

    // Getters & Setters
    /**
     * @return the summaries
     */
    public Summary[] getSummaries() {
        return summaries;
    }

    /**
     * @param summaries the summaries to set
     */
    public void setSummaries(Summary[] summaries) {
        this.summaries = summaries;
    }

    /**
     * @return the keywords
     */
    public LinkedList<Integer>[] getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(LinkedList<Integer>[] keywords) {
        this.keywords = keywords;
    }

}
