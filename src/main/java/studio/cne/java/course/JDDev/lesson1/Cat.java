package studio.cne.java.course.JDDev.lesson1;

public class Cat {

    private String name;
    private String furColor;
    private String eyesColor;
    private int height;
    private int lengthOfTail;
    private int age;

    public Cat(String name, String furColor, String eyesColor, int height, int lengthOfTail, int age) {
        this.name = name;
        this.furColor = furColor;
        this.eyesColor = eyesColor;
        this.height = height;
        this.lengthOfTail = lengthOfTail;
        this.age = age;
    }

    public void scratch() {
        System.out.println("ouch!");
    }

    public void purr() {
        System.out.println("mrrr!");
    }

    public void changeAge(int newAge) {
        this.age = newAge;
    }

    public String meaow () {
        return "meaow!";
    }

    public void growUp() {
        this.age++;
    }

    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public int getHeight() {
        return height;
    }

    public int getLengthOfTail() {
        return lengthOfTail;
    }

    public int getAge() {
        return age;
    }

    public String sleep(int hoursSlept) {
        return "cat slept for: " + hoursSlept + " hours.";
    }
}
