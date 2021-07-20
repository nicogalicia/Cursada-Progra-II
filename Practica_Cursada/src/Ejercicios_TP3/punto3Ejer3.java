package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerConjuntos;
import apis.ConjuntoTDA;
import impl.ConjuntoTA;

public class punto3Ejer3 {
    public static void main(String[] args) {
        ConjuntoTDA co1 = new ConjuntoTA();
        co1.inicializarConjunto();

        Auxiliares.rellenarConjunto(co1);

        System.out.println("Conjunto");
        EjerConjuntos.imprimirConjunto(co1);

        System.out.println("\nLa cantidad de elementos es: " + EjerConjuntos.contarElementos(co1));
    }
}
