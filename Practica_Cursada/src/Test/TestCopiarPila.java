package Test;

import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaTF;
import impl.PilaTI;

public class TestCopiarPila {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        PilaTDA p2 = new PilaTI();

        p1.inicializarPila();
        p2.inicializarPila();

        for (int i=0; i<=10; i++ ) {
            p1.apilar(i);
        }

        EjerPilas.copiarPila(p1, p2);

        System.out.println("\n**** Pila 1 ****");
        EjerPilas.imprimirPila(p1);

        System.out.println("\n**** Pila 2 ****");
        EjerPilas.imprimirPila(p2);


    }
}
