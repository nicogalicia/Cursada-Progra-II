import Metodos.Ejercicios;
import apis.PilaTDA;
import impl.PilaTF;

import java.util.concurrent.RejectedExecutionException;

public class Test {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();

        p1.inicializarPila();

        for (int i = 0; i<= 50; i++) {
            p1.apilar(i);
        }

        System.out.println("La cantidad de elementos es: " + Ejercicios.contarElementosPila(p1));
        System.out.println("La suma es: " + Ejercicios.sumarElementosPila(p1));
        System.out.println("El promedio es: " + Ejercicios.calcularPromedioPila(p1));
        Ejercicios.imprimirPila(p1);

    }
}
