package bt3;

public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;


    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(boolean on, double radius, String color, int speed) {
        this.on = on;
        this.radius = radius;
        this.color = color;
        this.speed = speed;
    }

    public Fan() {
        this.on = false;
        this.radius = 5d;
        this.color = "Blue";
        this.speed = SLOW;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
