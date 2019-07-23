package studio.cne.java.course.JJDev.homeTasks.homeTask1;

import studio.cne.java.course.JJDev.commonConstantsAndMethods.CommonMethods;
import studio.cne.java.course.JJDev.lesson4.Company;
import studio.cne.java.course.JJDev.lesson4.PITCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hometask1Test {

    public static void test() {

        System.out.println("--HomeTask 1 TEST BEGIN --");

        Student student0 = new Student("Justyna", "Janczy");
        Student student1 = new Student("Monika", "Frydryszak");
        Student student2 = new Student("Skiper Morgan", "Vena");
        Student student3 = new Student("Andrzej", "Kwieciński");
        Student student4 = new Student("Marek", "Janczy");
        Student student5 = new Student("Jakub", "Dolecki");


        List<Student> record = new ArrayList<Student>();

        record.add(student0);
        record.add(student1);
        record.add(student2);
        record.add(student3);
        record.add(student4);
        record.add(student5);



        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
        MathTeacher mathTeacher = new MathTeacher();
        EnglishTeacher englishTeacher = new EnglishTeacher();
        PolishTeacher polishTeacher = new PolishTeacher();
        PeTeacher peTeacher = new PeTeacher();

        for(int i=0; i<record.size(); i++) {
            Random random = new Random();
            physicsTeacher.giveGrade(record.get(i), random.nextInt(5)+1);
            mathTeacher.giveGrade(record.get(i),random.nextInt(5)+1);
            englishTeacher.giveGrade(record.get(i),random.nextInt(5)+1);
            polishTeacher.giveGrade(record.get(i),random.nextInt(5)+1);
            peTeacher.giveGrade(record.get(i),random.nextInt(5)+1);
        }

        for(int i=0; i<record.size(); i++) {
            System.out.println("--------------");
            CommonMethods.printStudentsResults(record.get(i));
            System.out.println("--------------");
        }

        System.out.println("--HomeTask 1 TEST END --");

    }

}
