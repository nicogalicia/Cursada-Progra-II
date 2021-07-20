package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerConjuntos;
import apis.ConjuntoTDA;
import impl.ConjuntoTA;

public class punto3Ejer2 {
    public static void main(String[] args) {
        ConjuntoTDA co1 = new ConjuntoTA();
        ConjuntoTDA co2 = new ConjuntoTA();
        co1.inicializarConjunto();
        co2.inicializarConjunto();

        Auxiliares.rellenarConjunto(co1);
        Auxiliares.rellenarConjunto(co2);

        System.out.println("Conjunto principal");
        EjerConjuntos.imprimirConjunto(co1);

        System.out.println("\nConjunto secundario");
        EjerConjuntos.imprimirConjunto(co2);

        String igualdad = EjerConjuntos.determinarIgualdad(co1, co2) ? "Las conjuntos son iguales" : "Los conjuntos son diferentes";
        System.out.println(igualdad);
    }
}
