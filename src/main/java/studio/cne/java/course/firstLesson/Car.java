package studio.cne.java.course.firstLesson;

public class Car {

    private int fuel;
    private String color;
    private String brand;

    public Car(int fuel, String color, String brand) {
        System.out.println("-- CREATING NEW CAR --");
        this.fuel = fuel;
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void powerUp() {
        System.out.println("Brummm brummmm!");
    }

    public void tank() {
        System.out.println("Tanking gasoline");
    }

    public void repaint (String newColor) {
        this.color = newColor;
        System.out.println("Color changed to: " + this.getColor());
    }

    public void drive() {
        System.out.println("Driving car!");
    }


}
