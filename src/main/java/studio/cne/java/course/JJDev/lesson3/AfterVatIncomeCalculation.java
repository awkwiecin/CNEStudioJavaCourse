package studio.cne.java.course.JJDev.lesson3;

import studio.cne.java.course.JJDev.commonConstantsAndMethods.CommonMethods;

import java.util.Scanner;

public class AfterVatIncomeCalculation {

    public void calculateTaxedIncome() {

        Scanner reader = new Scanner(System.in);
        System.out.println("-- AFTER TAX CALCULATOR --");
        System.out.println("Enter your income");
        double income = reader.nextDouble();

        double taxIncome = CommonMethods.calculateVAT(income);
        System.out.println("Your taxed income is: "+ taxIncome);
        System.out.println("-- YOUR TAXED PRICE IS CALCULATED --");

    }

}
