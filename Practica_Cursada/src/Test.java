import Metodos.EjerColas;
import Metodos.EjerColasPrioridades;
import Metodos.EjerConjuntos;
import Metodos.EjerPilas;
import apis.ColaPrioridadTDA;
import apis.ColaTDA;
import apis.ConjuntoTDA;
import apis.PilaTDA;
import impl.*;

public class Test {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        p1.inicializarPila();

        for (int i = 0; i<=10; i++) {
            p1.apilar(i);
        }

        p1.apilar(10);
        p1.apilar(5);
        p1.apilar(0);

        System.out.println("Pila Original");
        EjerPilas.imprimirPila(p1);



        EjerPilas.eliminarRepetidos(p1);
        System.out.println("Pila modificada");
        EjerPilas.imprimirPila(p1);

    }
}