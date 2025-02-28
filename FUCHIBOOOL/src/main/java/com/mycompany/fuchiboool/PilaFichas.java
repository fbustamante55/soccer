/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fuchiboool;

/**
 *
 * @author Fabia
 */
public class PilaFichas extends Pila<Participante> {

    /**
     * Retorna la cantidad de fichas en la pila.
     * @return Cantidad de fichas en la pila.
     */
    public int cuentaFichas() {
        return getTamano();
    }
}
