package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import Metodos.EjerConjuntos;
import Metodos.EjerPilas;
import apis.ColaTDA;
import apis.PilaTDA;
import impl.ColaPI;
import impl.PilaTF;

public class punto3Ejer5 {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        ColaTDA c1 = new ColaPI();

        p1.inicializarPila();
        c1.inicializarCola();

        Auxiliares.rellenarCola(c1);
        Auxiliares.rellenarPila(p1);

        System.out.println("La pila es: ");
        EjerPilas.imprimirPila(p1);

        System.out.println("\nLa cola es:");
        EjerColas.imprimirCola(c1);

        String resultado = (EjerConjuntos.igualdadElementosPilaCola(p1, c1)) ? "Poseen los mismos elementos" : "No poseen los mismos elementos";
        System.out.println("\n" + resultado);
    }
}
