/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClasses;

/**
 *
 * @author Angel Granado
 */
public class Node<T> {
    private T tInfo;
    private Node<T> pNextNode;
    private  String key;

    public Node(T tInfo){
        this.tInfo = tInfo;
        this.pNextNode = null;
    }

    public Node(){
        this.tInfo = null;
        this.pNextNode = null;
    }

    public T getTInfo(){
        return this.gettInfo();
    }

    public void setTInfo(T tInfo){
        this.settInfo(tInfo);
    }

    public Node<T> getNextNode(){
        return this.getpNextNode();
    }

    public void setNextNode(Node<T> pNextNode){
        this.setpNextNode(pNextNode);
    }
    
    @Override
    public String toString(){
        return this.gettInfo().toString();
    }

    /**
     * @return the tInfo
     */
    public T gettInfo() {
        return tInfo;
    }

    /**
     * @param tInfo the tInfo to set
     */
    public void settInfo(T tInfo) {
        this.tInfo = tInfo;
    }

    /**
     * @return the pNextNode
     */
    public Node<T> getpNextNode() {
        return pNextNode;
    }

    /**
     * @param pNextNode the pNextNode to set
     */
    public void setpNextNode(Node<T> pNextNode) {
        this.pNextNode = pNextNode;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }
}