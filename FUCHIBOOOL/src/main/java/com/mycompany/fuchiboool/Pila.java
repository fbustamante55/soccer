/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fuchiboool;

/**
 *
 * @author Fabia
 */

public class Pila<T> {
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo<T> cima;
    private int tamano;

    public Pila() {
        this.cima = null;
        this.tamano = 0;
    }

    public void apilar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamano++;
    }

    public T desapilar() {
        if (cima == null) {
            return null;
        }
        T dato = cima.dato;
        cima = cima.siguiente;
        tamano--;
        return dato;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public int getTamano() {
        return tamano;
    }
}
