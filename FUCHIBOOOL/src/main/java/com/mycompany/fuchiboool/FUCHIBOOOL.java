/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fuchiboool;

/**
 *
 * @author Fabia
 */
public class FUCHIBOOOL {

    public static void main(String[] args) {
        ColaParticipantes cola = new ColaParticipantes();
        PilaFichas sub7 = new PilaFichas();
        PilaFichas sub9 = new PilaFichas();
        PilaFichas sub11 = new PilaFichas();

        // Registro de participantes
        cola.encolar(new Participante("Mario Chaves", 7, "Portero", 33));
        cola.encolar(new Participante("Samuel Rodríguez", 9, "Delantero", 10));
        cola.encolar(new Participante("Juan Castro", 11, "Defensa", 4));
        cola.encolar(new Participante("Luis Pérez", 6, "Defensa", 7));
        cola.encolar(new Participante("Matías Contreras", 10, "Delantero", 15));
        cola.encolar(new Participante("Isabella Domínguez", 8, "Portera", 9));
        cola.encolar(new Participante("Tomas Ramírez", 8, "Defensa", 5));
        cola.encolar(new Participante("Rosa Muñoz", 7, "Delantera", 12));
        cola.encolar(new Participante("Pablo Porras", 7, "Delantero", 18));

        System.out.println("Se han registrado " + cola.cuentaParticipantes() + " participantes al torneo.\n");
        cola.imprimirCola();

        // Clasificación de participantes
        while (!cola.estaVacia()) {
            Participante p = cola.desencolar();
            if (p.getEdad() <= 7) {
                sub7.apilar(p);
            } else if (p.getEdad() <= 9) {
                sub9.apilar(p);
            } else {
                sub11.apilar(p);
            }
        }

        System.out.println("\nEn la pila de niños de 7 años o menos hay " + sub7.cuentaFichas() + " fichas.");
        System.out.println("En la pila de niños de 8 y 9 años hay " + sub9.cuentaFichas() + " fichas.");
        System.out.println("En la pila de niños de 10 y 11 años hay " + sub11.cuentaFichas() + " fichas.");
    }
}
