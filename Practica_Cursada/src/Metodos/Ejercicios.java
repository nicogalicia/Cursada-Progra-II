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
        PilaTDA p3 = new PilaTI();
        p3.inicializarPila();

        while (!p1.pilaVacia()) { //Pasar Pila 1 a auxiliar
            p3.apilar(p1.tope());
            p1.desapilar();
        }

        while (!p3.pilaVacia()) { //Pasar auxiliar a Pila 1 y 2
            p1.apilar(p3.tope());
            p2.apilar(p3.tope());
            p3.desapilar();
        }

        System.out.println("\n****Pila 2****"); //Imprimir Pila 2
        while (!p2.pilaVacia()) {
            System.out.println(p2.tope());
            p2.desapilar();
        }

        System.out.println("\n****Pila 1****"); //Imprimir Pila 1
        while (!p1.pilaVacia()) {
            System.out.println(p1.tope());
            p1.desapilar();
        }
    }
}
