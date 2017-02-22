/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircular;

import ListaSimple.Nodo;

/**
 *
 * @author p_ab1
 */
public class ListaCircular {
   class Nodo {
        String valor;
        Nodo anterior,siguiente;
        Object listaLetras;
    }
    
    private Nodo raiz;
    
    public ListaCircular () {
        raiz=null;
    }
   
    public void insertarUltimo(String x,Object lista) {
        Nodo nuevo=new Nodo();
        nuevo.valor=x;
        nuevo.listaLetras=lista;
        
        if (raiz==null) {
            nuevo.siguiente=nuevo;
            nuevo.anterior=nuevo;            
            raiz=nuevo;
        } else {
            Nodo ultimo=raiz.anterior;
            nuevo.siguiente=raiz;
            nuevo.anterior=ultimo;
            raiz.anterior=nuevo;
            ultimo.siguiente=nuevo;
        }
    }    
    
    public boolean isEmpty ()
    {
        if (raiz == null)
            return true;
        else
            return false;
    }
    public void imprimir ()
    {
        if (!isEmpty()) {
            Nodo reco=raiz;
            do {
                System.out.print (reco.valor + "-");
                reco = reco.siguiente;                
            } while (reco!=raiz);
            System.out.println();
        }    
    }
    
    public int getSize ()
    {
        int cant = 0;
        if (!isEmpty()) {
            Nodo reco=raiz;
            do {
                cant++;
                reco = reco.siguiente;                
            } while (reco!=raiz);
        }    
        return cant;
    }
}
