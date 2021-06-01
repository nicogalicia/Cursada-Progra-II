package Ejercicios_TP1;

import Metodos.EjerPilas;
import apis.PilaTDA;
import impl.PilaTF;

public class test {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        p1.inicializarPila();

        for (int i = 0; i<=10; i++) {
            p1.apilar(i);
        }

        EjerPilas.imprimirPila(p1);
    }
}
