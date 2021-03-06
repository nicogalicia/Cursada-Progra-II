package Ejercicios_TP1;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import apis.ColaTDA;
import impl.ColaPI;

public class punto4EjerF {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaPI();
        ColaTDA c2 = new ColaPI();

        c1.inicializarCola();
        c2.inicializarCola();

        Auxiliares.rellenarCola(c1);
        Auxiliares.rellenarCola(c2);

        EjerColas.invertirColaConPila(c2);


        System.out.println("Cola 1");
        EjerColas.imprimirCola(c1);

        System.out.println("\nCola 2");
        EjerColas.imprimirCola(c2);

        String inverso = (EjerColas.determinarColaInversa(c1, c2)) ? "Las colas son inversas" : "Las colas no son inversas";
        System.out.println("\n" + inverso);
    }
}
