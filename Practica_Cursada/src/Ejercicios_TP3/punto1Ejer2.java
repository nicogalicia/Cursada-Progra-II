package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaTF;

public class punto1Ejer2 {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        p1.inicializarPila();

        p1.apilar(7);
        p1.apilar(1);
        p1.apilar(1);
        p1.apilar(7);
        p1.apilar(3);
        p1.apilar(2);
        p1.apilar(3);


        System.out.println("Pila original");
        EjerPilas.imprimirPila(p1);

        EjerPilas.eliminarRepetidos(p1);

        System.out.println("Pila modificada");
        EjerPilas.imprimirPila(p1);
    }
}
