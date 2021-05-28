package Metodos;

import apis.ColaPrioridadTDA;
import impl.ColaPrioridadAO;

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

    }

    public static void combinarColasPrioridades (ColaPrioridadTDA cp1, ColaPrioridadTDA cp2, ColaPrioridadTDA cp3) { //A igual prioridad, los de CP1 van primero
        
    }
}
