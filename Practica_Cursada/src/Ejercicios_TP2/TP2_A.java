package Ejercicios_TP2;

import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaLD;

public class TP2_A {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaLD();
        PilaTDA p2 = new PilaLD();
        p1.inicializarPila();
        p2.inicializarPila();


        for (int i = 0; i<=10; i++) {
            p1.apilar(i);
        }

        System.out.println("Pila Original");
        EjerPilas.imprimirPila(p1);

        EjerPilas.pasarPila(p1, p2);
        System.out.println("Pila modifica");
        EjerPilas.imprimirPila(p2);
    }
}
