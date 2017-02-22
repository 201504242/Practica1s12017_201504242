/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author p_ab1
 */
public class NodoCola {
    private NodoCola siguiente;
    private NodoCola anterior;
    private String dato;

    public NodoCola(String dato) {
        this.dato = dato;
    }

    public NodoCola getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCola getAnterior() {
        return this.anterior;
    }

    public void setAnterior(NodoCola anterior) {
        this.anterior = anterior;
    }

    public String getDato() {
        return this.dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}
