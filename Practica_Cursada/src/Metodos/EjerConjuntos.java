package Metodos;

import apis.ConjuntoTDA;
import impl.ConjuntoLD;

public class EjerConjuntos {

    public static void imprimirConjunto(ConjuntoTDA co1) {
        int aux;

        while (!co1.conjuntoVacio()) {
            aux = co1.elegir();
            System.out.println(aux);
            co1.sacar(aux);
        }
    }
}