package Simulacros;

import apis.ConjuntoTDA;
import apis.PilaTDA;
import impl.ConjuntoLD;
import impl.PilaTF;
import impl.PilaTI;

public class Simulacro1 {

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

    public static void eliminarRepetidos(PilaTDA p1) {
        PilaTDA pilaAux = new PilaTF();
        ConjuntoTDA conjuntoAux = new ConjuntoLD();
        pilaAux.inicializarPila();
        conjuntoAux.inicializarConjunto();

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

    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        p1.inicializarPila();

        p1.apilar(7);
        p1.apilar(1);
        p1.apilar(1);
        p1.apilar(7);
        p1.apilar(3);
        p1.apilar(2);
        p1.apilar(3);


        System.out.println("Pila original");
        imprimirPila(p1);

        eliminarRepetidos(p1);

        System.out.println("Pila modificada");
        imprimirPila(p1);

    }
}
