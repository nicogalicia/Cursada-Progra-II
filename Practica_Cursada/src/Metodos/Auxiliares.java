package Metodos;

import apis.ColaPrioridadTDA;
import apis.ColaTDA;
import apis.ConjuntoTDA;
import apis.PilaTDA;

public class Auxiliares {
    public static void rellenarPila(PilaTDA p1) {
        for (int i = 0; i<=10; i++) {
            p1.apilar(i);
        }
    }

    public static void rellenarPilaRepetidos(PilaTDA p1) {
        rellenarPila(p1);
        p1.apilar(0);
        p1.apilar(5);
        p1.apilar(10);
    }

    public static void rellenarCola(ColaTDA c1) {
        for (int i = 0; i<=10; i++) {
            c1.acolar(i);
        }
    }

    public static void rellenarColaRepetidos(ColaTDA c1) {
        rellenarCola(c1);
        c1.acolar(0);
        c1.acolar(5);
        c1.acolar(10);
    }

    public static void rellenaColaPrioridad(ColaPrioridadTDA c1) {
        for (int i = 0; i<= 10; i++) {
            c1.acolarPrioridad(i, i);
        }
    }

    public static void rellenarColaPrioridadRepetidos(ColaPrioridadTDA c1) {
        rellenaColaPrioridad(c1);
        c1.acolarPrioridad(0, 0);
        c1.acolarPrioridad(5,5);
        c1.acolarPrioridad(10,10);
    }

    public static void rellenarConjunto(ConjuntoTDA c1) {
        for (int i = 0; i<=10; i++) {
            c1.agregar(i);
        }
    }
}
