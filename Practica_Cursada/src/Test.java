import Metodos.EjerciciosPilas;
import apis.PilaTDA;
import impl.PilaTF;


public class Test {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();

        p1.inicializarPila();

        for (int i = 0; i<= 5; i++) {
            p1.apilar(i);
        }

        System.out.println("La cantidad de elementos es: " + EjerciciosPilas.contarElementosPila(p1));
        System.out.println("La suma es: " + EjerciciosPilas.sumarElementosPila(p1));
        System.out.println("El promedio es: " + EjerciciosPilas.calcularPromedioPila(p1));
        EjerciciosPilas.imprimirPila(p1);

    }
}
