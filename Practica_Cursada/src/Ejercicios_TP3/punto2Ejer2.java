package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import apis.ColaTDA;
import impl.ColaPI;

public class punto2Ejer2 {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaPI();
        ColaTDA m1 = new ColaPI();
        ColaTDA m2 = new ColaPI();

        c1.inicializarCola();
        m1.inicializarCola();
        m2.inicializarCola();

        Auxiliares.rellenarCola(c1);
        c1.acolar(11);

        System.out.println("La cola original");
        EjerColas.imprimirCola(c1);

        EjerColas.dividirCola(c1, m1, m2);

        System.out.println("La primer mitad");
        EjerColas.imprimirCola(m1);

        System.out.println("La segunda mitad");
        EjerColas.imprimirCola(m2);

    }
}
