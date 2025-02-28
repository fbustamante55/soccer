/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fuchiboool;

/**
 *
 * @author Fabia
 */
public class Participante {
    private String nombre;
    private int edad;
    private String posicion;
    private int numeroCamiseta;

    public Participante(String nombre, int edad, String posicion, int numeroCamiseta) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años) - " + posicion + " #" + numeroCamiseta;
    }
}
