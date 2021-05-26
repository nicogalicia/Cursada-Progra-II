import apis.ColaTDA;
import impl.ColaLD;

public class Test {
    public static void main(String[] args) {

        ColaTDA c1 = new ColaLD();
        c1.inicializarCola();

        for (int i = 0; i<=10; i++) {
            c1.acolar(i);
        }

        while (!c1.colaVacia()) {
            System.out.println(c1.primero());
            c1.desacolar();
        }
    }
}
