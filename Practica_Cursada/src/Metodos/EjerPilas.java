package Metodos;

import apis.ConjuntoTDA;
import apis.PilaTDA;
import impl.ConjuntoLD;
import impl.PilaTF;
import impl.PilaTI;

public class EjerPilas {
    public static void pasarPila(PilaTDA p1, PilaTDA p2) { //Elimina original, deja en orden inverso
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

        if (p1.pilaVacia()) {
            System.out.println("La pila está vacía");
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

    public static int sumarElementosPila(PilaTDA p1) {
        PilaTDA pilaAux = new PilaTF();
        int sumatoria = 0;

        pilaAux.inicializarPila();
        copiarPila(p1, pilaAux);

        while (!pilaAux.pilaVacia()) {
            sumatoria += pilaAux.tope();
            pilaAux.desapilar();
        }
        return sumatoria;
    }

    public static int calcularPromedioPila(PilaTDA p1) {
        return sumarElementosPila(p1) / contarElementosPila(p1);
    }

    public static void eliminarRepetidos(PilaTDA p1) { //Mantiene orden de entrada, NO de salida
        PilaTDA pilaAux = new PilaTF();
        ConjuntoTDA conjuntoAux = new ConjuntoLD();
        pilaAux.inicializarPila();
        conjuntoAux.inicializarConjunto();
        invertirContenidoPila(p1);

        while (!p1.pilaVacia()) {
            if (!conjuntoAux.pertenece(p1.tope())) {
                conjuntoAux.agregar(p1.tope());
                pilaAux.apilar(p1.tope());
            }
            p1.desapilar();
        }

        while (!pilaAux.pilaVacia()) {
            p1.apilar(pilaAux.tope());
            pilaAux.desapilar();
        }
    }

    public static boolean determinarCapicua(PilaTDA p1) {
        PilaTDA pilaAux = new PilaTF();
        PilaTDA pilaAux1 = new PilaTF();

        pilaAux.inicializarPila();
        pilaAux1.inicializarPila();

        boolean flag = true;
        int aux;
        copiarPila(p1, pilaAux);
        copiarPila(p1, pilaAux1);
        invertirContenidoPila(pilaAux1);
        aux = contarElementosPila(p1) / 2;

        for (int i = 1; i<=aux; i++) {
            if (pilaAux.tope() != pilaAux1.tope()) {
                flag = false;
            }
            else {
                pilaAux.desapilar();
                pilaAux1.desapilar();
            }
        }
        return flag;
    }

    public static void elementosRepetidos (PilaTDA p1, ConjuntoTDA co1) {
        PilaTDA pilaAux = new PilaTF();
        ConjuntoTDA conjuntoAux = new ConjuntoLD();
        pilaAux.inicializarPila();
        conjuntoAux.inicializarConjunto();

        copiarPila(p1, pilaAux);

        while (!pilaAux.pilaVacia()) {
            if (!conjuntoAux.pertenece(pilaAux.tope())) {
                conjuntoAux.agregar(pilaAux.tope());
            }
            else {
                co1.agregar(pilaAux.tope());
            }
            pilaAux.desapilar();
        }
    }

    public static void dividirPila(PilaTDA p1, PilaTDA p2) {
        PilaTDA pilaAux = new PilaTF();
        pilaAux.inicializarPila();
        int contador = contarElementosPila(p1) / 2;

        pasarPila(p1, pilaAux);

        for (int i = 1; i<=contador; i++) {
            p2.apilar(pilaAux.tope());
            pilaAux.desapilar();
        }

        while (!pilaAux.pilaVacia()) {
            p1.apilar(pilaAux.tope());
            pilaAux.desapilar();
        }


    }
}