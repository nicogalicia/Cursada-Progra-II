package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import Metodos.EjerConjuntos;
import apis.ColaTDA;
import apis.ConjuntoTDA;
import impl.ColaPI;
import impl.ConjuntoLD;

public class punto2Ejer3 {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaPI();
        ConjuntoTDA repetidos = new ConjuntoLD();
        c1.inicializarCola();
        repetidos.inicializarConjunto();

        Auxiliares.rellenarColaRepetidos(c1);

        System.out.println("Cola Original");
        EjerColas.imprimirCola(c1);

        EjerColas.elementosRepetidos(c1, repetidos);

        System.out.println("\nLos elementos repetidos son: ");
        EjerConjuntos.imprimirConjunto(repetidos);
    }
}
