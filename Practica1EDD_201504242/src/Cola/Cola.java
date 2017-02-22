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
public class Cola {
    private NodoCola primero;
    public int tama;
    
    public int getSize(){
        return tama;
    }
    public void agregar(String numero) {
        NodoCola nuevo = new NodoCola(numero);
        if (this.primero == null) {
            this.primero = nuevo;
        } else {
            NodoCola actual = this.primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tama++;
    }
     public void eliminar() {
        this.primero = this.primero.getSiguiente() != null ? this.primero.getSiguiente() : null;
        tama--;
    }
}
