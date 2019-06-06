package studio.cne.java.course.JJDev.lesson4;

public class FourthLessonTest {

    public static void test() {
        System.out.println("-- LESSON 4 TEST BEGIN --");

        Company company = new Company(1000000,20,20000);

        double taxedIncome = PITCalculator.calculatePIT(company.getIncome(), company.getYearsPassed(), company.getCosts());

        System.out.println("Calculated income: " + taxedIncome + " pln.");

        System.out.printf("-- LESSON 4 TEST END --");
    }

}
