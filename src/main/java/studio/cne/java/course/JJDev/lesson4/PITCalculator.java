package studio.cne.java.course.JJDev.lesson4;

import studio.cne.java.course.JJDev.common.CommonMethods;

public class PITCalculator {


    public static double calculatePIT (double income, double yearsPassed, double costs){

        double incomeAfterVAT = CommonMethods.calculateVAT(income);
        double incomeAfterZUS = CommonMethods.calculateZUS(incomeAfterVAT, yearsPassed);
        double incomeAfterCosts = CommonMethods.calculateCosts(incomeAfterZUS, costs);
        double incomeAfterTAX = CommonMethods.calculateTAX(incomeAfterCosts);
        return incomeAfterTAX;

    }
}
