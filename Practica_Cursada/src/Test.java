import Metodos.EjerColas;
import Metodos.EjerColasPrioridades;
import Metodos.EjerConjuntos;
import apis.ColaPrioridadTDA;
import apis.ColaTDA;
import apis.ConjuntoTDA;
import impl.ColaLD;
import impl.ColaPI;
import impl.ColaPrioridadAO;
import impl.ConjuntoLD;

public class Test {
    public static void main(String[] args) {
        ColaPrioridadTDA cp1 = new ColaPrioridadAO();
        ColaPrioridadTDA cp2 = new ColaPrioridadAO();

        cp1.inicializarCola();
        cp2.inicializarCola();

        int aux = 0;
        for (int i = 0; i<=10; i++) {
            cp1.acolarPrioridad(i, aux);
            aux++;
        }

        aux =0;
        for (int i = 11; i<20; i++) {
            cp2.acolarPrioridad(i, aux);
            aux++;
        }

    }
}