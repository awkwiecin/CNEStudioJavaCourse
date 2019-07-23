package studio.cne.java.course.JSDev.lesson1;

public class Bull {

    private String color;
    private int lengthOfLegs;
    private int volume;

    public Bull(String color, int lengthOfLegs, int volume) {
        System.out.println("Creating new bull...");
        this.color = color;
        this.lengthOfLegs = lengthOfLegs;
        this.volume = volume;
    }

    public Bull() {

    }

    public void moo() {
        System.out.println("Mooooo!!!");
    }

    public void gore() {
        System.out.println("Kaboom!!!");
    }

    public void feed() {
        System.out.println("Omnomnom!");
    }

    public void paintBull(String newColor) {

        this.color = newColor;
    }

    public String getColor() {
        return color;
    }

    public int getLengthOfLegs() {
        return lengthOfLegs;
    }

    public int getVolume() {
        return volume;
    }
}
