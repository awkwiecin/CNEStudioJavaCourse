package studio.cne.java.course.JJDev.lesson3;

public class Methods {

   public static double calculateVAT(double income) {

       return income - income * Constants.PL_VAT;

   }

    public static double calculateZUS (double income, double yearsPassed){
       if (yearsPassed<= Constants.threshold1)
           return income - 320;
       else if (yearsPassed<= Constants.threshold2 && yearsPassed> Constants.threshold1)
           return income - 550;
       else
           return income - 1300;


    }
    public static double calculateTAX (double income){
       if (income<200000)
           return income - 0.18*income;
       else
           return income - 0.32*income;
    }

    public static double calculateCosts (double income, double costs){
       return income - costs;
    }

}
