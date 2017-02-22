/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

import java.util.HashSet;
/**
 *
 * @author p_ab1
 */
public class ListaSimple {
    public Nodo inicio;
    public int tama;

    public ListaSimple() {
        this.inicio = null;
        this.tama = 0;
    }
    public boolean esVacia(){
        return inicio == null;
    }
    public int getTama(){
        return tama;
    }
    public void agregar(Object valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        
        if(esVacia()){
            inicio=nuevo;
        }else{
            Nodo aux = inicio;
            while(aux.getSiguiente() !=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tama++;
    }
    
    public Object getValor(int posicion){
        if(posicion>=0 && posicion<tama){
            if(posicion==0){
                return inicio.getValor();
            }else{
                Nodo aux = inicio;
                for(int i=0;i<posicion;i++){
                    aux = aux.getSiguiente();
                }
                return aux.getValor();
            }
        }else{
            return "No se encontro";
        }
    }  
    }
            

