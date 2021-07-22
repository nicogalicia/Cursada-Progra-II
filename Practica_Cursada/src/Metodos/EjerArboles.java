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

    public static boolean esHojaEnABB(ABBTDA a, int x) {
        boolean retorno=false;
        if (!a.arbolVacio()) {
            if(a.raiz()==x && a.hijoIzq().arbolVacio() && a.hijoDer().arbolVacio())
                retorno=true;
            else
            if (a.raiz() > x)
                retorno=existeElementoEnABB(a.hijoIzq(),x);
            else
                retorno=existeElementoEnABB(a.hijoDer(),x);
        }
        return retorno;
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

    public static int sumar(ABBTDA a){
        int retorno=0;
        if (!a.arbolVacio())
            retorno= a.raiz()+ cantidadElementos(a.hijoIzq())+ cantidadElementos(a.hijoDer()) ; // s=s+a
        return retorno;
    }

    public static int contarHojas(ABBTDA a){
        int retorno=0;
        if (!a.arbolVacio())
            retorno= (a.hijoDer().arbolVacio() && a.hijoIzq().arbolVacio())? 1:0+ cantidadElementos(a.hijoIzq())+ cantidadElementos(a.hijoDer()) ;
        retorno--;
        return retorno;
    }


    public static int contarHojas1(ABBTDA a){
        int retorno=0;
        if (!a.arbolVacio())
            if(a.hijoDer().arbolVacio() && a.hijoIzq().arbolVacio())
                retorno=1;
            else
                retorno= 0+ cantidadElementos(a.hijoIzq())+ cantidadElementos(a.hijoDer()) ;
        retorno--;
        return retorno;
    }

    public static void preorder(ABBTDA a) {
        if (!a.arbolVacio()) {
            System.out.println(" " +a.raiz());
            preorder(a.hijoIzq());
            preorder(a.hijoDer());
        }

    }
    public static void postorder(ABBTDA a) {
        if (!a.arbolVacio()) {
            postorder(a.hijoIzq());
            postorder(a.hijoDer());
            System.out.println(" " +a.raiz());
        }

    }

    public static void inorder(ABBTDA a) {
        if (!a.arbolVacio()) {
            inorder(a.hijoIzq());
            System.out.println(" " + a.raiz());
            inorder(a.hijoDer());
        }
    }
}
