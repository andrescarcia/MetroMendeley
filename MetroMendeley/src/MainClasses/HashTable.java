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

    private LinkedList<Integer>[] Authors;

    public HashTable(int i, int j, int k) {
        this.summaries = new Summary[i];
        this.keywords = new LinkedList[j];
        this.Authors = new LinkedList[k];
        this.fillHT(this.keywords);
        this.fillHT(this.Authors);

    }

    /**
     * Calcula la función de hash DBJ2 para un título dado y lo retorna como un
     * entero.
     *
     * @param title el título a utilizar para calcular el hash
     * @return el valor del hash calculado como un entero
     */
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

    /**
     * Método que implementa la función Double Hashing para manejar colisiones
     * en una tabla hash.
     *
     * @param title el título del artículo a agregar a la tabla hash.
     * @return el número generado por la función Double Hashing.
     */
    public int doubleHash(String title) {
        //Se selecciona un número primo para evitar patrones en la secuencia de saltos que se generan en caso de colisiones. 
        int prime = 31;
        int hash2 = prime - (DBJ2(title) % prime);
        return hash2;
    }

    /**
     * Agrega un resumen de paper al hashTable.
     *
     * @param summary el resumen de paper a agregar al hashTable.
     * @return el index del array en el que se agrego el summary, o -1 si no se
     * pudo agregar.
     */
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
     * Agrega la posición de un paper en una hashtable auxiliar. Es
     * procedimiento es para agregar elementos en la hashtable de keyword y la
     * de autores.
     *
     * @param HT La tabla Hash que se está utilizando.
     * @param arrayAux El arreglo de String con los keywords a agregar o con los
     * autores.
     * @param position La posición del paper que se está agregando.
     */
    public void addInAuxHT(LinkedList<Integer>[] HT, String[] arrayAux, int position) {

        for (String currentInfo : arrayAux) {
            // Se llama al Hash function pripcipal DBJ2  
            int hash1 = DBJ2(currentInfo);
            // Se llama al DoubleHash para el manejo de colisiones.
            int hash2 = doubleHash(currentInfo);

            // Se asigna como index inicial al hash1
            int index = hash1;

            // Se valida si esta vacío el slot. 
            if (HT[index].isEmpty()) {
                HT[index].addEnd(position);
                HT[index].getpFirst().setKey(currentInfo.strip());

                // Si no esta vacio se valida si se esta intentado meter el mismo int (index del title) ya cargado.
            } else {
                // si el keyword coincide con el key del primer nodo de la lista, entonces se agrega al final de la lista
                if (currentInfo.strip().equalsIgnoreCase(HT[index].getpFirst().getKey().strip())) {
                    HT[index].addEnd(position);
                    //si no, entonces el se maneja la colision
                } else {
                    int n = 0;
                    while (!HT[index].isEmpty()) {
                        n++;
                        // Se asigna index nuevo usando metodo double hashing., 
                        index = (hash1 + n * hash2) % this.getKeywords().length;
                    }
                    HT[index].addEnd(position);
                    HT[index].getpFirst().setKey(currentInfo.strip());
                }
            }
        }
    }
    
    /**
     * Rellena la tabla de hash de palabras clave, inicializando cada lista
     * enlazada en cada índice de la tabla.
     *
     * @param array la hashtable a inicializar
     */
    public void fillHT(LinkedList<Integer>[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new LinkedList<>();
        }
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
     /**
     * @return the Autor
     */
    public LinkedList<Integer>[] getAutor() {
        return this.Authors;
    }
    
    /**
     * @param autor the keywords to set
     */
    
    public void setAutor(LinkedList<Integer>[] autor) {
        this.keywords = autor;
    }
    
    

    /**
     * Busca un resumen por título utilizando la técnica de hashing doble.
     *
     * @param title el título del resumen a buscar.
     * @return el objeto Summary correspondiente al título buscado, o null si no
     * se encuentra.
     */
    public Summary searchSummary(String title) {
        int hash1 = this.DBJ2(title);
        int hash2 = this.doubleHash(title);
        int index = hash1;
        Summary result = this.getSummaries()[index];

        if (result != null) {
            if (result.getTitle().equalsIgnoreCase(title)) {
                return result;
            } else {
                int i = 0;
                while (!this.getSummaries()[index].getTitle().equalsIgnoreCase(title) && i < this.getSummaries().length) {
                    i++;
                    index = (hash1 + i * hash2) % this.getSummaries().length;
                }
                return this.getSummaries()[index];
            }
        }
        return result;
    }

    /**
     * @return the authors
     */
    public LinkedList<Integer>[] getAuthors() {
        return Authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(LinkedList<Integer>[] authors) {
        this.Authors = authors;
    }
}
