package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaTF;

public class punto1Ejer1 {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();

        p1.inicializarPila();

        Auxiliares.rellenarPila(p1);
        for (int i = 10; i>=0; i--) {
            p1.apilar(i);
        }

        System.out.println("Pila Original");
        EjerPilas.imprimirPila(p1);

        if (EjerPilas.determinarCapicua(p1)) {
            System.out.println("La pila es capicúa");
        }
        else {
            System.out.println("La pila no es capicúa");
        }
    }
}
