package Metodos;

import apis.ColaTDA;
import apis.PilaTDA;
import impl.ColaPI;
import impl.PilaTF;

public class EjerColas {
    public static void pasarCola(ColaTDA c1, ColaTDA c2) { //Elimina la original
        while (!c1.colaVacia()) {
            c2.acolar(c1.primero());
            c1.desacolar();
        }
    }
    public static void copiarCola(ColaTDA c1, ColaTDA c2) { //Mantiene la original
        ColaTDA colaAux = new ColaPI();
        colaAux.inicializarCola();

        while (!c1.colaVacia()) {
            colaAux.acolar(c1.primero());
            c1.desacolar();
        }

        while (!colaAux.colaVacia()) {
            c1.acolar(colaAux.primero());
            c2.acolar(colaAux.primero());
            colaAux.desacolar();
        }
    }

    public static void imprimirCola(ColaTDA c1) {
        ColaTDA colaAux = new ColaPI();
        colaAux.inicializarCola();

        copiarCola(c1, colaAux);

        while (!colaAux.colaVacia()) {
            System.out.println(colaAux.primero());
            colaAux.desacolar();
        }
    }

    public static void invertirCola(ColaTDA c1) {
        PilaTDA pilaAux = new PilaTF();
        pilaAux.inicializarPila();

        while (!c1.colaVacia()) {
            pilaAux.apilar(c1.primero());
            c1.desacolar();
        }

        while (!pilaAux.pilaVacia()) {
            c1.acolar(pilaAux.tope());
            pilaAux.desapilar();
        }
    }

    public static int contarElementosCola(ColaTDA c1) {
        int contador = 0;
        ColaTDA auxCola = new ColaPI();
        auxCola.inicializarCola();

        copiarCola(c1, auxCola);

        while (!auxCola.colaVacia()) {
            auxCola.desacolar();
            contador++;
        }
        return contador;
    }

    public static void invertirColaSinAux(ColaTDA c1) {


    }
}