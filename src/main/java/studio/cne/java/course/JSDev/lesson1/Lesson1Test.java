package studio.cne.java.course.JSDev.lesson1;

public class Lesson1Test {

    public static void test() {

        System.out.println("hello world!");

        System.out.println("------------------------------");
        Cat mruczek = new Cat("Mruczek", "grey", "green", 20, 12, 1);

        mruczek.purr();
        mruczek.scratch();
        System.out.println("Age: " + mruczek.getAge());
        mruczek.changeAge(20);
        System.out.println("Age: " + mruczek.getAge());

        System.out.println("------------------------------");

        Cat maciek = new Cat("Maciek", "black", "blue", 15, 9, 3);

        maciek.scratch();;
        System.out.println("Age: " + maciek.getAge());
        maciek.changeAge(12);
        System.out.println("Age: " + maciek.getAge());
        maciek.purr();
        maciek.growUp();
        System.out.println("Age: " + maciek.getAge());

        System.out.print(maciek.getName()+" says: " );
        maciek.purr();
        System.out.println(maciek.getName() + " says: " + maciek.meaow());
        System.out.println(maciek.sleep(5));


    }


}
