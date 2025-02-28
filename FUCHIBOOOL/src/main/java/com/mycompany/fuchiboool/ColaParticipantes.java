/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fuchiboool;

/**
 *
 * @author Fabia
 */

public class ColaParticipantes extends Cola<Participante> {
    
    /**
     * Retorna la cantidad de participantes en la cola.
     * @return Cantidad de participantes en la cola.
     */
    public int cuentaParticipantes() {
        return getTamano();
    }
}

