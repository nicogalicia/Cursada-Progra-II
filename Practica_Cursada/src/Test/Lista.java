package Test;

public class Lista {
    public String x;
    private int j;

    public void soy() {
        System.out.println("Soy " + x);
    }

    public void setJ(int y) {
        if (y>0) {
            j=y;
        }
    }

    public int getJ() {

        return j;
    }

    public void printJ() {

        System.out.println(j);
    }
}