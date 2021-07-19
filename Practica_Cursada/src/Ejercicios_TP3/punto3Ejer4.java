package Ejercicios_TP3;

import Metodos.Auxiliares;
import Metodos.EjerColas;
import Metodos.EjerConjuntos;
import Metodos.EjerPilas;
import apis.ColaTDA;
import apis.ConjuntoTDA;
import apis.PilaTDA;
import impl.ColaPI;
import impl.ConjuntoTA;
import impl.PilaLD;
import impl.PilaTF;

public class punto3Ejer4 {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaPI();
        PilaTDA p1 = new PilaTF();
        ConjuntoTDA co1 = new ConjuntoTA();

        c1.inicializarCola();
        p1.inicializarPila();
        co1.inicializarConjunto();

        Auxiliares.rellenarPila(p1);
        p1.apilar(15);
        c1.acolar(5);
        c1.acolar(8);
        c1.acolar(16);

        EjerConjuntos.elementosRepetidosPilaCOla(p1, c1, co1);

        System.out.println("La pila es: ");
        EjerPilas.imprimirPila(p1);

        System.out.println("\nLa cola es: ");
        EjerColas.imprimirCola(c1);

        System.out.println("\nEl conjunto de repetidos es: ");
        EjerConjuntos.imprimirConjunto(co1);
    }
}
