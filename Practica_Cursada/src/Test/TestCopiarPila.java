package Test;

import Metodos.Ejercicios;
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

        Ejercicios.copiarPila(p1, p2);

    }
}
