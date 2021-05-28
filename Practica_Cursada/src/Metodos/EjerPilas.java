package Metodos;

import apis.PilaTDA;
import impl.PilaTF;
import impl.PilaTI;

public class EjerPilas {
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

    public static void invertirContenidoPila(PilaTDA p1) {
        PilaTDA p2 = new PilaTF();
        p2.inicializarPila();

        pasarPila(p1, p2);
        copiarPila(p2, p1);
    }

    public static int contarElementosPila(PilaTDA p1) {
        PilaTDA pilaAux = new PilaTF();
        int contador = 0;

        pilaAux.inicializarPila();
        copiarPila(p1, pilaAux);

        while (!pilaAux.pilaVacia()) {
            pilaAux.desapilar();
            contador++;
        }
        return contador;
    }

    public static double sumarElementosPila(PilaTDA p1) {
        PilaTDA pilaAux = new PilaTF();
        double sumatoria = 0;

        pilaAux.inicializarPila();
        copiarPila(p1, pilaAux);

        while (!pilaAux.pilaVacia()) {
            sumatoria += pilaAux.tope();
            pilaAux.desapilar();
        }
        return sumatoria;
    }

    public static double calcularPromedioPila(PilaTDA p1) {
        PilaTDA pilaAux = new PilaTF();
        pilaAux.inicializarPila();
        copiarPila(p1, pilaAux);

        return sumarElementosPila(pilaAux) / contarElementosPila(pilaAux);
    }
}