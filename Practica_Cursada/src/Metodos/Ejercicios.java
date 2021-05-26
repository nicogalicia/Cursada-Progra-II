package Metodos;

import apis.PilaTDA;
import impl.PilaTI;

public class Ejercicios {
    public static void pasarPila(PilaTDA p1, PilaTDA p2) { //Pasa a otra pila, dejandola en orden inverso
        while (!p1.pilaVacia()) {
            p2.apilar(p1.tope());
            p1.desapilar();
        }
    }

    public static void copiarPila(PilaTDA p1, PilaTDA p2) { //Copia la pila a otra manteniendo el orden
        PilaTDA pilaAux = new PilaTI();
        pilaAux.inicializarPila();

        while (!p1.pilaVacia()) { //Pasar Pila 1 a auxiliar
            pilaAux.apilar(p1.tope());
            p1.desapilar();
        }

        while (!pilaAux.pilaVacia()) { //Pasar auxiliar a Pila 1 y 2
            p1.apilar(pilaAux.tope());
            p2.apilar(pilaAux.tope());
            pilaAux.desapilar();
        }


    }
    public static void imprimirPila(PilaTDA p1) {
        PilaTDA pilaAux = new PilaTI();
        pilaAux.inicializarPila();

        while (!p1.pilaVacia()) {
            System.out.println(p1.tope());
            pilaAux.apilar(p1.tope());
            p1.desapilar();
        }

        while (!pilaAux.pilaVacia()) {
            p1.apilar(pilaAux.tope());
            pilaAux.desapilar();
        }
    }

}

