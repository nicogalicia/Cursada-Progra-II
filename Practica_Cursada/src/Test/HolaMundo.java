package Test;


public class HolaMundo {
    public static void main(String[] args) {
        Lista Letras = new Lista();
        Lista Numeros = new Lista();

        Letras.x = "Nicolas";
        Letras.soy();

        Numeros.setJ(10);
        System.out.println(Numeros.getJ());
        Numeros.printJ();

    }
}
