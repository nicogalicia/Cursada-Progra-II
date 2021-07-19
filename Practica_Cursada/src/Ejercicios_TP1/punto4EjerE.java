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

        String capicua = (EjerColas.determinarColaCapicua(c1)) ? "La cola es capicua" : "La cola no es capicua";
        System.out.println("\n" + capicua);
    }
}
