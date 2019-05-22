package studio.cne.java.course.lesson3;

import java.util.Scanner;

public class AfterVatIncomeCalculation {

    public void calculateTaxedIncome() {

        Scanner reader = new Scanner(System.in);
        System.out.println("-- AFTER TAX CALCULATOR --");
        System.out.println("Enter your income");
        double income = reader.nextDouble();

        double taxIncome = Methods.calculateIncomeAfterTaxing(income);
        System.out.println("Your taxed income is: "+ taxIncome);
        System.out.println("-- YOUR TAXED PRICE IS CALCULATED --");

    }

}
