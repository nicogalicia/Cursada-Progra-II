package Metodos;

import apis.ColaTDA;
import apis.ConjuntoTDA;
import apis.PilaTDA;
import impl.ColaPI;
import impl.ConjuntoLD;
import impl.ConjuntoTA;
import impl.PilaTF;

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

    public static boolean determinarIgualdad(ConjuntoTDA co1, ConjuntoTDA co2) {
        boolean igualdad = true;
        ConjuntoTDA aux1 = new ConjuntoTA(); aux1.inicializarConjunto();
        ConjuntoTDA aux2 = new ConjuntoTA(); aux2.inicializarConjunto();

        copiarConjunto(co1, aux1);
        copiarConjunto(co2, aux2);

        int auxNum;
        while (!aux1.conjuntoVacio()) {
            auxNum = aux1.elegir();
            if (!aux2.pertenece(auxNum)) {
                igualdad = false;
            }
            aux1.sacar(auxNum);
            aux2.sacar(auxNum);
        }

        if (!aux1.conjuntoVacio() || !aux2.conjuntoVacio()) {
            igualdad = false;
        }

        return igualdad;
    }

    public static int contarElementos(ConjuntoTDA co1) {
        int cantidad = 0;
        int aux;

        while (!co1.conjuntoVacio()) {
            aux = co1.elegir();
            co1.sacar(aux);
            cantidad++;
        }

        return cantidad;
    }

    public static void elementosRepetidosPilaCOla(PilaTDA p1, ColaTDA c1, ConjuntoTDA co1) {
        PilaTDA pilaAux = new PilaTF(); pilaAux.inicializarPila();
        ColaTDA colaAux = new ColaPI(); colaAux.inicializarCola();
        ConjuntoTDA conjuntoAux = new ConjuntoTA(); conjuntoAux.inicializarConjunto();

        EjerPilas.copiarPila(p1, pilaAux);
        EjerColas.copiarCola(c1, colaAux);

        while (!pilaAux.pilaVacia()) {
            conjuntoAux.agregar(pilaAux.tope());
            pilaAux.desapilar();
        }

        while (!colaAux.colaVacia()) {
            if (conjuntoAux.pertenece(colaAux.primero())) {
                co1.agregar(colaAux.primero());
            }
            colaAux.desacolar();
        }
    }

    public static boolean igualdadElementosPilaCola (PilaTDA p1, ColaTDA c1) {
        PilaTDA pilaAux = new PilaTF(); pilaAux.inicializarPila();
        ColaTDA colaAux = new ColaPI(); colaAux.inicializarCola();
        ConjuntoTDA coAux1 = new ConjuntoTA(); coAux1.inicializarConjunto();
        ConjuntoTDA coAux2 = new ConjuntoTA(); coAux2.inicializarConjunto();

        EjerPilas.copiarPila(p1, pilaAux);
        EjerColas.copiarCola(c1, colaAux);

        while (!pilaAux.pilaVacia()) {
            coAux1.agregar(pilaAux.tope());
            pilaAux.desapilar();
        }

        while (!colaAux.colaVacia()) {
            coAux2.agregar(colaAux.primero());
            colaAux.desacolar();
        }

        return determinarIgualdad(coAux1, coAux2);
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