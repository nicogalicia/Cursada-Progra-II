package Metodos;

import apis.ConjuntoTDA;
import impl.ConjuntoLD;
import impl.ConjuntoTA;

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

    public static void pasarConjunto (ConjuntoTDA co1, ConjuntoTDA co2) {
        while (!co1.conjuntoVacio()) {
            int aux = co1.elegir();
            co1.sacar(aux);
            co2.agregar(aux);
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
    public static ConjuntoTDA diferenciaConjuntos(ConjuntoTDA a, ConjuntoTDA b) { //revisar
        ConjuntoTDA aux1= new ConjuntoLD();
        aux1.inicializarConjunto();
        copiarConjunto(a,aux1);
        ConjuntoTDA aux2= new ConjuntoLD();
        aux2.inicializarConjunto();
        copiarConjunto(a,aux2);

        while(!aux1.conjuntoVacio()) {
            int e=aux1.elegir();
            if (b.pertenece(e))
                aux2.sacar(e);

            aux1.sacar(e);
        }
        return aux2;
    }

    public static ConjuntoTDA unionConjuntos(ConjuntoTDA a, ConjuntoTDA b) { //revisar
        ConjuntoTDA aux= new ConjuntoLD();
        aux.inicializarConjunto();
        copiarConjunto(a,aux);
        copiarConjunto(b,aux);
        return aux;

    }

    public static ConjuntoTDA interseccionConjunto(ConjuntoTDA a, ConjuntoTDA b) { //revisar
        ConjuntoTDA aux1= new ConjuntoLD();
        aux1.inicializarConjunto();
        ConjuntoTDA aux2= new ConjuntoLD();
        aux2.inicializarConjunto();
        while (!a.conjuntoVacio()) {
            int e=a.elegir();
            if (b.pertenece(e)) {
                aux1.agregar(e);
            }
            aux2.agregar(e);
            a.sacar(e);
        }
        pasarConjunto(aux2,a);
        return aux1;
    }

    public static ConjuntoTDA diferenciaSimetricaSinOperacionesConjunto(ConjuntoTDA a, ConjuntoTDA b) {
        ConjuntoTA aux1= new ConjuntoTA();
        aux1.inicializarConjunto();
        ConjuntoTA aux2= new ConjuntoTA();
        aux2.inicializarConjunto();
        ConjuntoTA aux3= new ConjuntoTA();
        aux3.inicializarConjunto();
        copiarConjunto(a,aux1);
        copiarConjunto(b,aux3);
        while(!aux1.conjuntoVacio()) {
            int e=aux1.elegir();
            if (b.pertenece(e))
                aux3.sacar(e);
            else
                aux2.agregar(e);
            aux1.sacar(e);
        }
        return unionConjuntos(aux2,aux3);
    }

    public static ConjuntoTDA diferenciaSimetricaUnionDiferencia(ConjuntoTDA a, ConjuntoTDA b) {
        return unionConjuntos(diferenciaConjuntos(a,b), diferenciaConjuntos(b,a));
    }

    public static ConjuntoTDA diferenciaSimetricaUnionInterseccionDiferencia(ConjuntoTDA a, ConjuntoTDA b) {
        return diferenciaConjuntos(unionConjuntos(a,b), interseccionConjunto(a,b));
    }
}