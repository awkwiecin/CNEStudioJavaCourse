package studio.cne.java.course.JSDev.lesson1;

public class Lesson1Test {

    public static void test() {

        System.out.println("-- LESSON 1 START --");

        Bull alfredo = new Bull("black", 20, 60);
        alfredo.moo();
        Bull mariano = new Bull("ginger", 20, 30);
        mariano.paintBull("blue");
        System.out.println(mariano.getColor());
        Mosquito filip = new Mosquito("green",30,"marcin");
        filip.sayName();
        filip.setName("Zachary");
        filip.sayName();
        filip.color = "black";

        System.out.println("-- LESSON 1 END --");


    }
}
