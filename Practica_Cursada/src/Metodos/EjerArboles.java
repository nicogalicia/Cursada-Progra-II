package Metodos;

import apis.ABBTDA;

public class EjerArboles {
    public static boolean existeElementoEnABB(ABBTDA a, int x) {
        boolean retorno=false;
        if (!a.arbolVacio()) {
            if(a.raiz()==x)
                retorno=true;
            else
            if (a.raiz() > x)
                retorno=existeElementoEnABB(a.hijoIzq(),x);
            else
                retorno=existeElementoEnABB(a.hijoDer(),x);
        }
        return retorno;

    }

    public static boolean esHojaEnABB(ABBTDA arbol, int valorBuscado) {
        if (arbol.arbolVacio()) {
            return false; // no existen datos en el arbol
        } else {
            if (arbol.raiz() == valorBuscado) {
                if (arbol.hijoIzq().arbolVacio() && arbol.hijoDer().arbolVacio())
                    return true; // si el valor no posee valores hijos (no es raiz) retorna verdadero
                else
                    return false;
            } else {
                if (valorBuscado > arbol.raiz())
                    return esHojaEnABB(arbol.hijoDer(), valorBuscado);
                else
                    return esHojaEnABB(arbol.hijoIzq(), valorBuscado);
            }
        }
    }
    public static int calcularProfundidad(ABBTDA a, int x){
        int retorno=-1;
        if (existeElementoEnABB( a,  x))
        {
            if (a.raiz() == x)
                retorno= 0;
            else
            if (a.raiz() > x)
                retorno= 1+calcularProfundidad(a.hijoIzq(), x);
            else
                retorno= 1+calcularProfundidad(a.hijoDer(), x);
        }
        return retorno;
    }

    public static int cantidadElementos(ABBTDA a){
        int retorno=0;
        if (!a.arbolVacio())
            retorno= 1+ cantidadElementos(a.hijoIzq())+ cantidadElementos(a.hijoDer()) ; // c=c+1
        return retorno;
    }

    public static int sumar(ABBTDA arbol) {
        if (arbol.arbolVacio())
            return 0;
        else {
            return arbol.raiz() + sumar(arbol.hijoDer()) + sumar(arbol.hijoIzq());
        }
    }

    public static int contarHojas(ABBTDA arbol) {
        if (arbol.arbolVacio())
            return 0;
        else {
            if (arbol.hijoDer().arbolVacio() && arbol.hijoIzq().arbolVacio())
                return 1;
            else
                return contarHojas(arbol.hijoDer()) + contarHojas(arbol.hijoIzq());
        }
    }


    public static void preorder(ABBTDA a) {
        //Imprime raiz, después arboles menores y después mayores
        if (!a.arbolVacio()) {
            System.out.println(" " +a.raiz());
            preorder(a.hijoIzq());
            preorder(a.hijoDer());
        }

    }
    public static void postorder(ABBTDA a) {
        //imrpime arboles menores y después mayores, empezando por las hojas hasta llegar a raiz
        if (!a.arbolVacio()) {
            postorder(a.hijoIzq());
            postorder(a.hijoDer());
            System.out.println(" " +a.raiz());
        }

    }

    public static void inorder(ABBTDA a) {
        //imprime los elementos ordenados de menor a mayor
        if (!a.arbolVacio()) {
            inorder(a.hijoIzq());
            System.out.println(" " + a.raiz());
            inorder(a.hijoDer());
        }
    }
}
