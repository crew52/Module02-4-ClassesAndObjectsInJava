package th1;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width * height;
    }
    public int getPerimeter(){
        return 2 * (width + height);
    }

    public void display(){
        System.out.println("The area of the rectangle is: " + getArea());
        System.out.println("The perimeter of the rectangle is: " + getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.display();
    }
}
