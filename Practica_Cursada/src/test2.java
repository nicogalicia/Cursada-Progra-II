import apis.ColaPrioridadTDA;
import impl.ColaPrioridadAO;

public class test2 {
    public static void main(String[] args) {
        ColaPrioridadTDA colaPrioridad = new ColaPrioridadAO();
        colaPrioridad.inicializarCola();

        for (int i = 0; i<=10; i++) {
            colaPrioridad.acolarPrioridad(i,1);
        }

        while (!colaPrioridad.colaVacia()) {
            System.out.println(colaPrioridad.primero());
            colaPrioridad.desacolar();
        }
    }
}
