import Metodos.EjerColas;
import Metodos.EjerConjuntos;
import apis.ColaTDA;
import apis.ConjuntoTDA;
import impl.ColaLD;
import impl.ColaPI;
import impl.ConjuntoLD;

public class Test {
    public static void main(String[] args) {
        ColaTDA c1 = new ColaPI();
        ColaTDA c2 = new ColaPI();

        c1.inicializarCola();
        c2.inicializarCola();

        for (int i = 0; i<=10; i++) {
            c1.acolar(i);
        }

        System.out.println("Pila normal");
        EjerColas.imprimirCola(c1);
        System.out.println("Pila invertida");
        EjerColas.invertirColaSinAux(c1);
        EjerColas.imprimirCola(c1);

    }
}