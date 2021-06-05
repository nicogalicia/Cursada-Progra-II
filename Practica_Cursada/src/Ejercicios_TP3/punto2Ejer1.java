package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import apis.ColaTDA;
import impl.ColaPI;

public class punto2Ejer1 {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaPI();
        c1.inicializarCola();

        c1.acolar(7);
        c1.acolar(1);
        c1.acolar(1);
        c1.acolar(7);
        c1.acolar(3);
        c1.acolar(2);
        c1.acolar(3);


        System.out.println("Cola original");
        EjerColas.imprimirCola(c1);

        EjerColas.eliminarRepetidos(c1);

        System.out.println("Cola modificada");
        EjerColas.imprimirCola(c1);
    }
}
