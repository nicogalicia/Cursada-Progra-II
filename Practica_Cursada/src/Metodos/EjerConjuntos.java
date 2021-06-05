package Metodos;

import apis.ConjuntoTDA;
import impl.ConjuntoLD;

public class EjerConjuntos {

    public static void copiarConjunto(ConjuntoTDA co1, ConjuntoTDA co2) {
        ConjuntoTDA conjuntoAux = new ConjuntoLD();
        conjuntoAux.inicializarConjunto();
        int aux;

        while (!co1.conjuntoVacio()) {
            aux = co1.elegir();
            conjuntoAux.agregar(aux);
            co1.sacar(aux);
        }

        while (!conjuntoAux.conjuntoVacio()) {
            aux = conjuntoAux.elegir();
            co1.agregar(aux);
            co2.agregar(aux);
            conjuntoAux.sacar(aux);
        }
    }

    public static void imprimirConjunto(ConjuntoTDA co1) {
        ConjuntoTDA conjuntoAux = new ConjuntoLD();
        conjuntoAux.inicializarConjunto();
        int aux;

        copiarConjunto(co1, conjuntoAux);

        while (!conjuntoAux.conjuntoVacio()) {
            aux = conjuntoAux.elegir();
            conjuntoAux.sacar(aux);
            System.out.println(aux);
        }
    }
}