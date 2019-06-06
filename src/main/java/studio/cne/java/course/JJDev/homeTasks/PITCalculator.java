package studio.cne.java.course.JJDev.homeTasks;

import studio.cne.java.course.JJDev.lesson3.Methods;

public class PITCalculator {


    public static double calculatePIT (double income, double yearsPassed, double costs){

        double incomeAfterVAT = Methods.calculateVAT(income);
        double incomeAfterZUS = Methods.calculateZUS(incomeAfterVAT, yearsPassed);
        double incomeAfterCosts = Methods.calculateCosts(incomeAfterZUS, costs);
        double incomeAfterTAX = Methods.calculateTAX(incomeAfterCosts);
        return incomeAfterTAX;

    }
}
