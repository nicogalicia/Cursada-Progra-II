import Metodos.EjerDiccionarios;
import apis.ABBTDA;
import apis.ConjuntoTDA;
import apis.DiccionarioMultipleTDA;
import impl.ABB;
import impl.ConjuntoLD;
import impl.DicMultipleL;

public class test {
    public static void main(String[] args) {
        ABBTDA arbol = new ABB(); arbol.inicializarArbol();
        arbol.agregarElem(100);
        arbol.agregarElem(200);
        arbol.agregarElem(50);
        System.out.println("raiz: " + arbol.raiz() +", Hijo izquierdo: " + arbol.hijoIzq().raiz() + ", Hijo derecho: " + arbol.hijoDer().raiz());
        System.out.println("\nImprimir ordenados de menor a mayor");
        preorder(arbol);
    }

    public static void preorder(ABBTDA a) {
        if (!a.arbolVacio()) {
            preorder((a.hijoIzq()));
            System.out.println(a.raiz());
            preorder((a.hijoDer()));
        }
    }
}