/*TESTEOS VARIOS SOBRE PILAS TDA*/

package Test;

import Metodos.Pilas;
import apis.PilaTDA;
import impl.PilaTF;
import impl.PilaTI;

public class TestPila {
    public static void main(String[] args) {
        PilaTDA p1 = new PilaTF();
        PilaTDA p2 = new PilaTI();

        p1.inicializarPila(); //iniciar pila
        p2.inicializarPila();

        p1.apilar(1); //Agregar valor pila
        p2.apilar(5);

        p1.apilar(10);

        if (p1.pilaVacia() && p2.pilaVacia()) {  //Comprobar si la pila está vacía
            System.out.println("Las pilas están vacías.");
        }
        else {  //imprimir tope de pila
            System.out.println("Pila 1 = " + p1.tope());
            System.out.println("Pila 2 = " + p2.tope());
        }

        System.out.println("\nApilando e imprimiendo pilas");
        for (int i=0; i<=10; i++) {    //Agregar valores a pila
            p1.apilar(i);
            p2.apilar(i+10);
            System.out.println("Pila 1= " +p1.tope());
            System.out.println("Pila 2= " + p2.tope());
        }

        System.out.println("\nDesapilando e imprimiendo pila 1");
        while (!p1.pilaVacia()) { //Mientras la pila no esté vacía
            System.out.println("Pila 1= " + p1.tope());
            p1.desapilar();
        }

        System.out.println("\nDesapilando e imprimiendo pila 2");
        while (!p2.pilaVacia()) {
            System.out.println("Pila 2 desapilando= " + p2.tope());
            p2.desapilar();
        }

        for (int i=0; i<=10; i++) {    //Agregar valores nuevamente a pilas
            p1.apilar(i);
            p2.apilar(i+10);
        }

        Pilas.pasarPila(p1, p2);

        System.out.println("\n****Probando ejercicios****");

        System.out.println("\nDesapilando e imprimiendo pila 1");
        while (!p1.pilaVacia()) { //Mientras la pila no esté vacía
            System.out.println("Pila 1 desapilando= " + p1.tope());
            p1.desapilar();
        }

        System.out.println("\nDesapilando e imprimiendo pila 2");
        while (!p2.pilaVacia()) { //Mientras la pila no esté vacía
            System.out.println("Pila 2 desapilando= " + p2.tope());
            p2.desapilar();
        }

    }
}