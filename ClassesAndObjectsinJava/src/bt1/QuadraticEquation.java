package bt1;

public class QuadraticEquation {
    private int a, b, c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return -b + Math.sqrt(getDiscriminant()) / (2 * a);
    }

    public double getRoot2() {
        return -b - Math.sqrt(getDiscriminant()) / (2 * a);
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(2, 6, 4);

        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("2N");
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("1N");
            System.out.println(quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
