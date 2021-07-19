package Simulacros;

import apis.ConjuntoTDA;
import apis.PilaTDA;
import impl.ConjuntoLD;
import impl.ConjuntoTA;
import impl.PilaTF;
import impl.PilaTI;

public class Simulacro1Parcial {

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

    public static void eliminarRepetidosOpcion1(PilaTDA p1) {
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

    public static void eliminarRepetidosOpcion2(PilaTDA p1) {
        ConjuntoTDA conjuntoAux = new ConjuntoTA();
        conjuntoAux.inicializarConjunto();
        PilaTDA pilaAux = new PilaTF();
        pilaAux.inicializarPila();

        while (!p1.pilaVacia()){
            pilaAux.apilar(p1.tope());
            p1.desapilar();
        }
        while (!pilaAux.pilaVacia()) {
            if (!conjuntoAux.pertenece(pilaAux.tope())) {
                p1.apilar(pilaAux.tope());
                conjuntoAux.agregar(pilaAux.tope());
            }
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

        eliminarRepetidosOpcion1(p1);

        System.out.println("Pila modificada");
        imprimirPila(p1);

    }
}
