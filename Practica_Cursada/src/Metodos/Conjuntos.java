package Metodos;

import apis.ConjuntoTDA;
import impl.ConjuntoLD;

public class Conjuntos {
    public static void imprimirConjunto(ConjuntoTDA c1) {
        ConjuntoTDA conjuntoAux = new ConjuntoLD();
        conjuntoAux.inicializarConjunto();

        int aux;
        while (!c1.conjuntoVacio()) {
            aux = c1.elegir();
            conjuntoAux.agregar(aux);
            System.out.println(aux);
            c1.sacar(aux);
        }

        while (!conjuntoAux.conjuntoVacio()) {
            aux = conjuntoAux.elegir();
            c1.agregar(aux);
            conjuntoAux.sacar(aux);
        }
    }
}
