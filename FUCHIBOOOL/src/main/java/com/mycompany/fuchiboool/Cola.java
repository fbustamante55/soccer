/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fuchiboool;

/**
 *
 * @author Fabia
 */

public class Cola<T> {
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamano;

    public Cola() {
        this.frente = this.fin = null;
        this.tamano = 0;
    }

    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (fin != null) {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        if (frente == null) {
            frente = nuevo;
        }
        tamano++;
    }

    public T desencolar() {
        if (frente == null) {
            return null;
        }
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        tamano--;
        return dato;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public int getTamano() {
        return tamano;
    }

    public void imprimirCola() {
        Nodo<T> actual = frente;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
