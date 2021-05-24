package Test;

import apis.PilaTDA;
import impl.PilaTF;
import impl.PilaTI;

public class TestPila {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        PilaTDA p2 = new PilaTI();

        p1.inicializarPila();
        p2.inicializarPila();

        p1.apilar(1);
        p2.apilar(5);

        p1.apilar(10);

        if (p1.pilaVacia() && p2.pilaVacia()) {
            System.out.println("Las pilas están vacías.");
        }
        else {
            System.out.println("Pila 1 = " + p1.tope());
            System.out.println("Pila 2 = " + p2.tope());
        }

        for (int i=0; i<=10; i++) {
            p1.apilar(i);
            System.out.println(p1.tope());
        }
    }
}