/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;

import AppClasses.App;

/**
 *
 * @author Angel Granado
 */
public class PapersPositionsList extends LinkedList<Integer> {

    public PapersPositionsList() {
        super();
    }

    /**
     * Inserta un nuevo nodo con un número entero antes del nodo dado como
     * parámetro.
     *
     * @param num El número entero a insertar.
     * @param pNode El nodo anterior al nodo donde se insertará el nuevo nodo.
     */
    public void insertBefore(Integer num, Node<Integer> pNode) {

        if (pNode.getTInfo().equals(this.getpFirst().getTInfo())) {
            this.addFirst(num);
        } else {
            Node<Integer> pAux = this.getpFirst();
            Node<Integer> pNew = new Node<>(num);
            while (pAux != null) {
                if (pAux.getpNextNode().getTInfo().equals(pNode.gettInfo())) {
                    pNew.setNextNode(pNode);
                    pAux.setNextNode(pNew);
                    this.setiSize(this.getiSize() + 1);
                    break;
                }
                pAux = pAux.getpNextNode();
            }
        }
    }

    /**
     * Inserta un nuevo nodo con un índice en orden alfabético dentro de la
     * lista.
     *
     * @param index El índice a insertar en la lista.
     */
    public void insertOrdered(int index) {
        boolean aux = true;
        if (this.isEmpty()) {
            this.addEnd(index);
        } else {
            String newTitle = App.getInstance().getHashTable().getSummaries()[index].getTitle();
            for (Node<Integer> pAux = this.getpFirst(); pAux != null; pAux = this.next(pAux)) {
                
                String currentTitle = App.getInstance().getHashTable().getSummaries()[pAux.getTInfo()].getTitle();
                if (newTitle.compareToIgnoreCase(currentTitle) < 0) {
                    this.insertBefore(index, pAux);
                    aux = false;
                    break;
                }
            }
            if (aux){
                this.addEnd(index);
            }
        }
    }

}
