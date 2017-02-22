/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

/**
 *
 * @author p_ab1
 */
public class Nodo {
    public Object valor;
    public Nodo siguiente;
    
    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Object getValor() {
        return valor;
    }    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public Nodo() {
        this.valor ="";
        this.siguiente = null;
    }
    
    
    
}
