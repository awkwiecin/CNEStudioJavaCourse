package studio.cne.java.course.JJDev.lesson3;

public class Methods {

   public static double calculateIncomeAfterTaxing(double income) {

       return income - income * Constants.PL_VAT;

   }

}
