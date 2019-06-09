package studio.cne.java.course.JJDev.homeTasks.homeTask1;

import studio.cne.java.course.JJDev.commonConstantsAndMethods.CommonMethods;
import studio.cne.java.course.JJDev.lesson4.Company;
import studio.cne.java.course.JJDev.lesson4.PITCalculator;

public class Hometask1Test {

    public static void test() {

        System.out.println("--HomeTask 1 TEST BEGIN --");

        Student student1 = new Student(5, 4, 5, 3, 2);
        double student1Mean = CommonMethods.gradeMeanCounter(student1.getPhysicsGrade(), student1.getMathgrade(), student1.getEnglishGrade(), student1.getPolishGrade(), student1.getPeGrade());
        System.out.println("The student1's mean is " + student1Mean);

        System.out.println("--HomeTask 1 TEST END --");

    }

}
