package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaTF;

public class punto2EjerD {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        p1.inicializarPila();

        Auxiliares.rellenarPila(p1);

        System.out.println("Pila Original");
        EjerPilas.imprimirPila(p1);

        System.out.println("\nLa cantidad de elementos es: " + EjerPilas.contarElementosPila(p1));
    }
}
