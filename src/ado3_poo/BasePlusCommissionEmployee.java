
package ado3_poo;

import ado3_poo.CommissionEmployee;

/**
 *
 * @author Nailson Nascimento <nailsonbr@gmail.com>
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(double grossSales, double commissionRate, String firstName, String lastName, String socialSecurityNumber) {
        super(grossSales, commissionRate, firstName, lastName, socialSecurityNumber);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base Salary must be >= 0.0");

        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%, .2f", "base-salaried", super.toString(), "base salarya", getBaseSalary());
    }

}
