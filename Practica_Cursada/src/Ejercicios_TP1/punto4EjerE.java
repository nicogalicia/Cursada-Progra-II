package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import apis.ColaTDA;
import impl.ColaPI;

public class punto4EjerE {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaPI();
        c1.inicializarCola();

        Auxiliares.rellenarCola(c1);

        for (int i = 10; i>=0; i--) {
            c1.acolar(i);
        }

        System.out.println("Cola Original");
        EjerColas.imprimirCola(c1);

        if (EjerColas.determinarColaCapicua(c1)) {
            System.out.println("La cola es capicúa");
        }

        else {
            System.out.println("La cola no es capicúa");
        }
    }
}
