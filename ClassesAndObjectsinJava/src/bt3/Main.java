package bt3;

public class Main {
    public static void main(String[] args) {
        Fan f1 = new Fan(true, 10, "Yellow", Fan.FAST);
        Fan f2 = new Fan();
        f2.setSpeed(Fan.MEDIUM);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
