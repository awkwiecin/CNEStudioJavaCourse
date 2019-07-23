package studio.cne.java.course.JSDev.lesson1;

public class Mosquito {

    private String color;
    private int lengthOfSting;
    private String name;

    public Mosquito(String color, int lengthOfSting, String name) {
        System.out.println("Creating new mosquito...");
        this.color = color;
        this.lengthOfSting = lengthOfSting;
        this.name = name;
    }

    public void sayName(){
        System.out.println("My name is " + this.name);
    }
    public void makeSounds(){
        System.out.println("Bzzzzzz!");
    }
    public void bite(){
        System.out.println("Amnamnam!");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLengthOfSting(int lengthOfSting) {
        this.lengthOfSting = lengthOfSting;
    }

    public void setName(String name) {
        this.name = name;
    }
}

