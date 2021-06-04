package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaTF;

public class punto1Ejer3 {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        PilaTDA segundaMitad = new PilaTF();

        p1.inicializarPila();
        segundaMitad.inicializarPila();

        Auxiliares.rellenarPila(p1);
        p1.apilar(11);

        System.out.println("Pila Original");
        EjerPilas.imprimirPila(p1);

        EjerPilas.dividirPila(p1, segundaMitad);

        System.out.println("Primer mitad");
        EjerPilas.imprimirPila(p1);

        System.out.println("Segunda Mitad");
        EjerPilas.imprimirPila(segundaMitad);
    }
}
