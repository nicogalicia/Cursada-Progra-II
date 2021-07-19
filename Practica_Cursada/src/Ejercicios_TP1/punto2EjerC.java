package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaTF;

public class punto2EjerC {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        p1.inicializarPila();

        Auxiliares.rellenarPila(p1);

        System.out.println("Pila Original");
        EjerPilas.imprimirPila(p1);

        EjerPilas.invertirContenidoPila(p1);

        System.out.println("\nPila Invertida");
        EjerPilas.imprimirPila(p1);
    }
}
