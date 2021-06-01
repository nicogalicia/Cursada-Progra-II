package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaTF;

public class punto2EjerA {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        PilaTDA p2 = new PilaTF();

        p1.inicializarPila();
        p2.inicializarPila();

        Auxiliares.rellenarPila(p1);

        System.out.println("Pila 1");
        EjerPilas.imprimirPila(p1);

        EjerPilas.pasarPila(p1, p2);

        System.out.println("Nuevamente Pila 1");
        EjerPilas.imprimirPila(p1);

        System.out.println("Pila 2");
        EjerPilas.imprimirPila(p2);

        System.out.println("Test");
    }
}
