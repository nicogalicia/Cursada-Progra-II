package Metodos;

import apis.ColaPrioridadTDA;
import impl.ColaPrioridadAO;

import java.util.concurrent.LinkedBlockingDeque;

public class EjerColasPrioridades {
    public static void copiarColarPrioridad(ColaPrioridadTDA cp1, ColaPrioridadTDA cp2) {
        ColaPrioridadTDA colaAux = new ColaPrioridadAO();
        colaAux.inicializarCola();

        while (!cp1.colaVacia()) {
            colaAux.acolarPrioridad(cp1.primero(), cp1.prioridad());
            cp1.desacolar();
        }


        while (!colaAux.colaVacia()) {
            cp1.acolarPrioridad(colaAux.primero(), colaAux.prioridad());
            cp2.acolarPrioridad(colaAux.primero(), colaAux.prioridad());
            colaAux.desacolar();
        }
    }

    public static void imprimirColaPrioridad(ColaPrioridadTDA cp1) {
        ColaPrioridadTDA auxCola = new ColaPrioridadAO();
        auxCola.inicializarCola();
        copiarColarPrioridad(cp1, auxCola);

        while (!auxCola.colaVacia()) {
            System.out.println(auxCola.primero());
            auxCola.desacolar();
        }

        if (cp1.colaVacia()) {
            System.out.println("La cola está vacía");
        }
    }

    public static void combinarColasPrioridades (ColaPrioridadTDA cp1, ColaPrioridadTDA cp2, ColaPrioridadTDA cp3) { //A igual prioridad, los de CP1 van primero
        ColaPrioridadTDA auxCola1 = new ColaPrioridadAO();
        ColaPrioridadTDA auxCola2 = new ColaPrioridadAO();
        auxCola1.inicializarCola();
        auxCola2.inicializarCola();

        copiarColarPrioridad(cp1, auxCola1);
        copiarColarPrioridad(cp2, auxCola2);

        while (!auxCola1.colaVacia()) {
            cp3.acolarPrioridad(auxCola1.primero(), auxCola1.prioridad());
            auxCola1.desacolar();
        }

        while (!auxCola2.colaVacia()) {
            cp3.acolarPrioridad(auxCola2.primero(), auxCola2.prioridad());
            auxCola2.desacolar();
        }
    }

    public static int contarElementosColasPrioridades (ColaPrioridadTDA cp1) {
        int cantidad;
        ColaPrioridadTDA colaAux = new ColaPrioridadAO();
        colaAux.inicializarCola();

        copiarColarPrioridad(cp1, colaAux);

        cantidad=0;
        while (!colaAux.colaVacia()) {
            cantidad++;
            colaAux.desacolar();
        }

        return cantidad;
    }

    public static boolean determinarColaPrioridadIdenticas (ColaPrioridadTDA cp1, ColaPrioridadTDA cp2) {
        boolean identicas = true;
        ColaPrioridadTDA auxCola1 = new ColaPrioridadAO();
        ColaPrioridadTDA auxCola2 = new ColaPrioridadAO();
        auxCola1.inicializarCola();
        auxCola2.inicializarCola();

        copiarColarPrioridad(cp1, auxCola1);
        copiarColarPrioridad(cp2, auxCola2);

        if (contarElementosColasPrioridades(auxCola1) != contarElementosColasPrioridades(auxCola2)) {
            identicas = false;
        }
        else {
            while (!auxCola1.colaVacia()) {
                if (auxCola1.primero() != auxCola2.primero() || auxCola1.prioridad() != auxCola2.prioridad()) {
                    identicas = false;
                }
                auxCola1.desacolar();
                auxCola2.desacolar();
            }
        }

        return identicas;
    }
}
