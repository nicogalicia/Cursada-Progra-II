package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import apis.ColaTDA;
import impl.ColaPI;

public class punto4EjerC {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaPI();
        c1.inicializarCola();

        Auxiliares.rellenarCola(c1);

        System.out.println("Cola Original");
        EjerColas.imprimirCola(c1);

        EjerColas.invertirColaSinAux(c1);

        System.out.println("Cola Invertida");
        EjerColas.imprimirCola(c1);

    }
}
