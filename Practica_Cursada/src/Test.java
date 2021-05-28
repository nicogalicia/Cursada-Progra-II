import Metodos.Conjuntos;
import apis.ColaTDA;
import apis.ConjuntoTDA;
import impl.ColaLD;
import impl.ColaPI;
import impl.ColaPrioridadAO;
import impl.ConjuntoLD;

public class Test {
    public static void main(String[] args) {

        ConjuntoTDA c = new ConjuntoLD();
        c.inicializarConjunto();

        for (int i = 0; i<=10; i++) {
            c.agregar(i);
        }

        Conjuntos.imprimirConjunto(c);
        }
    }