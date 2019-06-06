package studio.cne.java.course.JJDev.homeTasks;

import studio.cne.java.course.JJDev.lesson3.Methods;

public class Hometask1Test {

    public static void test() {
        Company company = new Company(1000000,20,20000);

        double taxedIncome = PITCalculator.calculatePIT(company.getIncome(), company.getYearsPassed(), company.getCosts());

        System.out.println(taxedIncome);


    }

}
