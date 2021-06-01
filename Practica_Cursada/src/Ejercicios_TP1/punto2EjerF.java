package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaTF;

public class punto2EjerF {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        p1.inicializarPila();

        Auxiliares.rellenarPila(p1);

        System.out.println("Pila Original");
        EjerPilas.imprimirPila(p1);

        System.out.println("El promedio de los elementos es: " + EjerPilas.calcularPromedioPila(p1));
    }
}
