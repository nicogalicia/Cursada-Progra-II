import Metodos.EjerArboles;
import apis.ABBTDA;
import impl.ABB;

public class test {
    public static void main(String[] args) {
        ABBTDA arbol = new ABB(); arbol.inicializarArbol();
        arbol.agregarElem(100);
        arbol.agregarElem(200);
        arbol.agregarElem(50);
        arbol.agregarElem(10);
        arbol.agregarElem(60);
        arbol.agregarElem(250);
        System.out.println("raiz: " + arbol.raiz() +", Hijo izquierdo: " + arbol.hijoIzq().raiz() + ", Hijo derecho: " + arbol.hijoDer().raiz());
        System.out.println("\nImprimir ordenados de menor a mayor");
        EjerArboles.preorder(arbol);

        System.out.println("La cantidad de elementos es: " + EjerArboles.cantidadElementos(arbol));
        System.out.println("La cantidad de hojas es: " + EjerArboles.contarHojas(arbol));
        System.out.println("La cantidad de hojas es: " + EjerArboles.contarHojas1(arbol));
    }
}