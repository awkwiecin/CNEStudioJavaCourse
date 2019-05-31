package studio.cne.java.course.JJDev.lesson1;

public class FirstLessonTest {

    public static void test() {

        System.out.println("-- TESTING LESSON 1 CLASSES --");
        Car car1 = new Car(40, "red", "volvo");
        car1.powerUp();
        car1.drive();
        car1.repaint("blue");
        //---------------------------------//
        Dog saba = new Dog ("brown", "husky", 20, "short", "Saba") ;

        saba.bark();
        saba.changeSizeOfFur("fluffy");
        saba.howl();
        saba.giveBall();
        saba.feed();

        Dog skiper = new Dog ("white", "westie", 5, "medium", "Skiper");

        skiper.bark();

        Car car2 = new Car ( 40, "white", "ford");
        car2.powerUp();

        System.out.println("-- LESSON 1 TEST END --");

    }


}
