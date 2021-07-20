package Metodos;

import apis.ConjuntoTDA;
import apis.DiccionarioMultipleTDA;
import impl.ConjuntoLD;

public class EjerDiccionarios {
    public static void imprimirClavesValores(ConjuntoTDA co1) {
        //imprime claves o valores de un diccionario
       int aux;

        while (!co1.conjuntoVacio()) {
            aux = co1.elegir();
            co1.sacar(aux);
            System.out.println(aux);
        }
    }

    public static void mostrarDiccionarioMultiple(DiccionarioMultipleTDA DM) {
        ConjuntoTDA claves = new ConjuntoLD(); claves.inicializarConjunto();
        ConjuntoTDA valores = new ConjuntoLD(); valores.inicializarConjunto();

        claves = DM.claves();
        while (!claves.conjuntoVacio()) {
            int claveUnitaria = claves.elegir();
            claves.sacar(claveUnitaria);
            valores = DM.recuperar(claveUnitaria);
            System.out.println("Clave: " + claveUnitaria);
            while (!valores.conjuntoVacio()) {
                int valorUnitario = valores.elegir();
                System.out.print(valorUnitario + ",");
                valores.sacar(valorUnitario);
            }
            System.out.println();
        }
    }

    public static void combinarDiccionarioMultiple(DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2, DiccionarioMultipleTDA DCompilado) {
        //combina dos diccionarios enteros. si comparten claves, se agregan todos los valores. TP3.51
        int claveUnitaria, valorUnitario;
        ConjuntoTDA claves = new ConjuntoLD(); claves.inicializarConjunto();
        ConjuntoTDA valores = new ConjuntoLD(); valores.inicializarConjunto();

        claves = D1.claves();
        while (!claves.conjuntoVacio()) {
            claveUnitaria = claves.elegir();
            claves.sacar(claveUnitaria);
            valores = D1.recuperar(claveUnitaria);
            while (!valores.conjuntoVacio()) {
                valorUnitario = valores.elegir();
                DCompilado.agregar(claveUnitaria, valorUnitario);
                valores.sacar(valorUnitario);
            }
        }

        claves = D2.claves();
        while (!claves.conjuntoVacio()) {
            claveUnitaria = claves.elegir();
            claves.sacar(claveUnitaria);
            valores = D2.recuperar(claveUnitaria);
            while (!valores.conjuntoVacio()) {
                valorUnitario = valores.elegir();
                DCompilado.agregar(claveUnitaria, valorUnitario);
                valores.sacar(valorUnitario);
            }
        }
    }

    public static void generarDiccionarioCoincidente(DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2, DiccionarioMultipleTDA DCompilado) {
        //combina dos diccionarios, SOLO las claves compartidas y con los valores compartidos de esas claves. TP3.54
        ConjuntoTDA claves1 = new ConjuntoLD(); claves1.inicializarConjunto();
        ConjuntoTDA claves2 = new ConjuntoLD(); claves2.inicializarConjunto();

        claves1 = D1.claves();
        claves2 = D2.claves();
        int clave;
        while (!claves1.conjuntoVacio()) {
            clave = claves1.elegir();
            claves1.sacar(clave);
            if (claves2.pertenece(clave)) {
                int valor;
                ConjuntoTDA valores1 = D1.recuperar(clave);
                ConjuntoTDA valores2 = D2.recuperar(clave);
                while (!valores1.conjuntoVacio()) {
                    valor = valores1.elegir();
                    valores1.sacar(valor);
                    if (valores2.pertenece(valor)) {
                        DCompilado.agregar(clave, valor);
                    }
                }
            }
        }
    }

    public static void generarDiccionarioClavesCoincidentes(DiccionarioMultipleTDA D1, DiccionarioMultipleTDA D2, DiccionarioMultipleTDA DCompilado) {
        //Combina solo las claves coincidentes en dos diccionarios, con todos sus valores asociados. TP3.53
        ConjuntoTDA claves1 = new ConjuntoLD(); claves1.inicializarConjunto();
        ConjuntoTDA claves2 = new ConjuntoLD(); claves2.inicializarConjunto();
        claves1 = D1.claves();
        claves2 = D2.claves();
        int clave, valor;
        while (!claves1.conjuntoVacio()) {
            clave = claves1.elegir();
            claves1.sacar(clave);
            if (claves2.pertenece(clave)) {
                ConjuntoTDA valores1 = D1.recuperar(clave);
                ConjuntoTDA valores2 = D2.recuperar(clave);
                while (!valores1.conjuntoVacio()) {
                    valor = valores1.elegir();
                    valores1.sacar(valor);
                    DCompilado.agregar(clave, valor);
                }
                while (!valores2.conjuntoVacio()) {
                    valor = valores2.elegir();
                    valores2.sacar(valor);
                    DCompilado.agregar(clave, valor);
                }

            }
        }
    }
}
