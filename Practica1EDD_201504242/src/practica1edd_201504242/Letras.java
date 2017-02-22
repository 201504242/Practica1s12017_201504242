/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd_201504242;

/**
 *
 * @author p_ab1
 */
public class Letras {

    public String getLetra() {
        return letra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public String letra;
    public int cantidad;
    public int puntos;

    public Letras(String letra, int cantidad, int puntos) {
        this.letra = letra;
        this.cantidad = cantidad;
        this.puntos = puntos;
    }
}
