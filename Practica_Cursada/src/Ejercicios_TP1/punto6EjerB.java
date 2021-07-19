package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerColasPrioridades;
import apis.ColaPrioridadTDA;
import impl.ColaPrioridadAO;

public class punto6EjerB {
    public static void main(String[] args) {
        ColaPrioridadTDA cp1 = new ColaPrioridadAO();
        ColaPrioridadTDA cp2 = new ColaPrioridadAO();

        cp1.inicializarCola();
        cp2.inicializarCola();

        Auxiliares.rellenaColaPrioridad(cp1);
        Auxiliares.rellenaColaPrioridad(cp2);

        System.out.println("Cola 1");
        EjerColasPrioridades.imprimirColaPrioridad(cp1);

        System.out.println("\nCola 2");
        EjerColasPrioridades.imprimirColaPrioridad(cp2);

        if (EjerColasPrioridades.determinarColaPrioridadIdenticas(cp1, cp2)) {
            System.out.println("\nLas colas son identicas");
        }
        else {
            System.out.println("\nLas colas son diferentes");
        }
    }
}
