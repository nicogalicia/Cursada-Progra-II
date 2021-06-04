package Metodos;

import apis.ColaPrioridadTDA;
import apis.ColaTDA;
import apis.PilaTDA;
import impl.ColaPI;
import impl.ColaPrioridadAO;
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

        if (c1.colaVacia()) {
            System.out.println("La cola está vacía");
        }
    }

    public static void invertirColaConPila(ColaTDA c1) {
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
        ColaPrioridadTDA colaAuxPrioridad = new ColaPrioridadAO();
        colaAuxPrioridad.inicializarCola();
        int contador;
        int tamanio;

        contador = contarElementosCola(c1);

        while (!c1.colaVacia()) {
            colaAuxPrioridad.acolarPrioridad(c1.primero(), contador);
            c1.desacolar();
            contador++;
        }

        while (!colaAuxPrioridad.colaVacia()) {
            c1.acolar(colaAuxPrioridad.primero());
            colaAuxPrioridad.desacolar();
        }
    }

    public static boolean determinarColaCapicua(ColaTDA c1) {
        ColaTDA colaAux = new ColaPI();
        colaAux.inicializarCola();

        copiarCola(c1, colaAux);
        invertirColaSinAux(colaAux);

        boolean flag = true;

        while (!c1.colaVacia() && !colaAux.colaVacia()) {
            if (c1.primero() != colaAux.primero()) {
                flag = false;
            }
            c1.desacolar();
            colaAux.desacolar();
        }

        return flag;
    }

    public static boolean determinarColaInversa (ColaTDA c1, ColaTDA c2) { //si una cola es exactamente inversa a la otra
        ColaTDA colaAux1 = new ColaPI();
        ColaTDA colaAux2 = new ColaPI();
        colaAux1.inicializarCola();
        colaAux2.inicializarCola();

        copiarCola(c1, colaAux1);
        copiarCola(c2, colaAux2);

        while (!colaAux2.colaVacia()) {
            colaAux1.acolar(colaAux2.primero());
            colaAux2.desacolar();
        }

        return determinarColaCapicua(colaAux1);
    }
}
