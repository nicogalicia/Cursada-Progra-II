package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import Metodos.EjerColasPrioridades;
import apis.ColaPrioridadTDA;
import apis.ColaTDA;
import impl.ColaPrioridadAO;

import java.security.cert.CollectionCertStoreParameters;

public class punto6EjerA {
    public static void main(String[] args) {
        ColaPrioridadTDA cp1 = new ColaPrioridadAO();
        ColaPrioridadTDA cp2 = new ColaPrioridadAO();
        ColaPrioridadTDA cp3 = new ColaPrioridadAO();

        cp1.inicializarCola();
        cp2.inicializarCola();
        cp3.inicializarCola();

        Auxiliares.rellenaColaPrioridad(cp1);

        for (int i = 0; i<=10; i++) {
            cp2.acolarPrioridad(i+10, i);
        }

        System.out.println("Cola 1");
        EjerColasPrioridades.imprimirColaPrioridad(cp1);

        System.out.println("\nCola 2");
        EjerColasPrioridades.imprimirColaPrioridad(cp2);

        EjerColasPrioridades.combinarColasPrioridades(cp1, cp2, cp3);

        System.out.println("\nCola combinada");
        EjerColasPrioridades.imprimirColaPrioridad(cp3);
    }
}
