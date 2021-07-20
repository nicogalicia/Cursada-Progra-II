package Ejercicios_TP3;

import Metodos.EjerDiccionarios;
import apis.ConjuntoTDA;
import apis.DiccionarioMultipleTDA;
import impl.ConjuntoLD;
import impl.DicMultipleL;

public class punto5Ejer3 {
    public static void main(String[] args) {
        DiccionarioMultipleTDA dicMA = new DicMultipleL(); dicMA.inicializarDiccionario();
        DiccionarioMultipleTDA dicMB = new DicMultipleL(); dicMB.inicializarDiccionario();
        DiccionarioMultipleTDA dicCompilado = new DicMultipleL(); dicCompilado.inicializarDiccionario();
        ConjuntoTDA coAux = new ConjuntoLD(); coAux.inicializarConjunto();

        dicMA.agregar(1,10);
        dicMA.agregar(2,20);
        dicMA.agregar(3,30);
        dicMA.agregar(3, 300);
        dicMA.agregar(5, 50);

        dicMB.agregar(4,40);
        dicMB.agregar(5,500);
        dicMB.agregar(6,60);
        dicMB.agregar(1, 10);
        dicMB.agregar(1, 1000);




        EjerDiccionarios.generarDiccionarioClavesCoincidentes(dicMA, dicMB, dicCompilado);

        EjerDiccionarios.mostrarDiccionarioMultiple(dicCompilado);
    }
}
