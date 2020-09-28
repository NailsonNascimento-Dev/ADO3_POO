
package ado3_poo;

import ado3_poo.Employee;

/**
 *
 * @author Nailson Nascimento <nailsonbr@gmail.com>
 */
public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weekleySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weekleySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;

    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnigs() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}
