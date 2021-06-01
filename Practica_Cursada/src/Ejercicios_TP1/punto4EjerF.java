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

        System.out.println("Cola 2");
        EjerColas.imprimirCola(c2);

        if (EjerColas.determinarColaInversa(c1, c2)) {
            System.out.println("Las colas son inversas");
        }
        else {
            System.out.println("Las colas no son inversas");
        }
    }
}
