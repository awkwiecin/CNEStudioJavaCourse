package studio.cne.java.course.lesson3;

public class ThirdLessonTest {

    public static void test() {
        System.out.println("-- LESSON 3 TEST BEGIN --");

        AfterVatIncomeCalculation afterVatIncomeCalculation = new AfterVatIncomeCalculation();
        afterVatIncomeCalculation.calculateTaxedIncome();

        System.out.println("-- LESSON 3 TEST END --");
    }
}
