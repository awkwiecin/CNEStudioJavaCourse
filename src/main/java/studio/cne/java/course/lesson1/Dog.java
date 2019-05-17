package studio.cne.java.course.lesson1;

public class Dog {

    private String color;
    private String breed;
    private int size;
    private String sizeOfFur;
    private String name;

    public Dog(String color, String breed, int size, String sizeOfFur, String name) {
        System.out.println("-- CREATING NEW DOG --");
        this.color = color;
        this.breed = breed;
        this.size = size;
        this.sizeOfFur = sizeOfFur;
        this.name = name;
    }

    public String getSizeOfFur() {
        return sizeOfFur;
    }

    public void bark(){
        System.out.println("woof woof");
    }

    public void changeSizeOfFur(String fur2){
        this.sizeOfFur=fur2;
        System.out.println("size of fur: " + this.getSizeOfFur());
    }

    public void howl(){
        System.out.println("woof");
    }

    public void giveBall(){
        System.out.println("ball");
    }

    public void feed(){
        System.out.println("bowl");
    }



}
