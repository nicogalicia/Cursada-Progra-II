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
        while (!p1.pilaVacia()) {
            p3.apilar(p1.tope());
            p1.desapilar();
            p2.apilar(p3.tope());
            p3.desapilar();
        }
    }
}
