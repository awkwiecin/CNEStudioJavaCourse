package studio.cne.java.course.JJDev.commonConstantsAndMethods;

public class CommonMethods {

   public static double calculateVAT(double income) {

       return income - income * CommonConstants.PL_VAT;

   }

    public static double calculateZUS (double income, double yearsPassed){
       if (yearsPassed<= CommonConstants.threshold1)
           return income - 320;
       else if (yearsPassed<= CommonConstants.threshold2 && yearsPassed> CommonConstants.threshold1)
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

    public static double gradeMeanCounter (int physicsGrade, int mathGrade, int englishGrade, int polishGrade, int peGrade){
       return (physicsGrade + mathGrade + englishGrade + polishGrade + peGrade)/5;
    }

}
