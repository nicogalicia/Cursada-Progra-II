package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import apis.ColaPrioridadTDA;
import apis.ColaTDA;
import impl.ColaPI;

public class punto4EjerA {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaPI();
        ColaTDA c2 = new ColaPI();

        c1.inicializarCola();
        c2.inicializarCola();

        Auxiliares.rellenarCola(c1);

        System.out.println("Cola Original");
        EjerColas.imprimirCola(c1);

        EjerColas.pasarCola(c1, c2);

        System.out.println("Nueva Cola");
        EjerColas.imprimirCola(c2);
    }
}
