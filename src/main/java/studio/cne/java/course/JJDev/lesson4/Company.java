package studio.cne.java.course.JJDev.lesson4;

public class Company {

    private double income;
    private double yearsPassed;
    private double costs;

    public Company(double income, double yearsPassed, double costs) {
        this.income = income;
        this.yearsPassed = yearsPassed;
        this.costs = costs;
    }

    public double getIncome() {
        return income;
    }

    public double getYearsPassed() {
        return yearsPassed;
    }

    public double getCosts() {
        return costs;
    }
}
