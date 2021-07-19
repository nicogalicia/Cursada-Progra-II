package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerConjuntos;
import Metodos.EjerPilas;
import apis.ConjuntoTDA;
import apis.PilaTDA;
import impl.ConjuntoLD;
import impl.PilaTF;

public class punto1Ejer4 {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        ConjuntoTDA co1 = new ConjuntoLD();

        p1.inicializarPila();
        co1.inicializarConjunto();

        Auxiliares.rellenarPilaRepetidos(p1);

        System.out.println("Pila original");
        EjerPilas.imprimirPila(p1);

        EjerPilas.elementosRepetidos(p1, co1);

        System.out.println("\nConjunto de elementos repetidos");
        EjerConjuntos.imprimirConjunto(co1);
    }
}
