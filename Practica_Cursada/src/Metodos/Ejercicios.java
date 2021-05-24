package Metodos;

import apis.PilaTDA;

public class Ejercicios {
    public static void pasarPila(PilaTDA p1, PilaTDA p2) {
        while (!p1.pilaVacia()) {
            p2.apilar(p1.tope());
            p1.desapilar();
        }
    }
}
