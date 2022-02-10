import java.text.NumberFormat;
import java.util.Locale;

class Employee {
    private int id;
    private String name;
    private double baseSalary;
    private double houseRentAllowance;
    private double dearnessAllowance;
    private double travellingAllowance;
    private double medicalAllowance;
    private double pf;
    private double annualSalary;

    // setters
    Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    private void setHouseRentAllowance(double hra) {
        this.houseRentAllowance = hra;
    }

    private void setDearnessAllowance(double da) {
        this.dearnessAllowance = da;
    }

    private void setTravellingAllowance(double ta) {
        this.travellingAllowance = ta;
    }

    private void setMedicalAllowance(double ma) {
        this.medicalAllowance = ma;
    }

    private void setPF(double pf) {
        this.pf = pf;
    }

    private void setAnnualSalary(double sal) {
        this.annualSalary = sal;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getHouseRentAllowance() {
        return houseRentAllowance;
    }

    public double getDearnessAllowance() {
        return dearnessAllowance;
    }

    public double getTravellingAllowance() {
        return travellingAllowance;
    }

    public double getMedicalAllowance() {
        return medicalAllowance;
    }

    public double getPF() {
        return pf;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void calculateAllowances() {
        double base = getBaseSalary();
        setHouseRentAllowance(base * 0.5);
        setDearnessAllowance(base * 0.15);
        setTravellingAllowance(base * 0.2);
        setMedicalAllowance(base * 0.2);
        setPF(base * 0.05);
        double annualSalary = getBaseSalary() * 12 + getHouseRentAllowance() + getDearnessAllowance()
                + getTravellingAllowance() + getMedicalAllowance() + getPF();
        setAnnualSalary(annualSalary);
    }

    public void displaySlip() {
        Locale IND = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(IND);

        double netTaxableSalary = getAnnualSalary() - 50000 - getHouseRentAllowance();
        double incomeTax = 0.0;
        double temp = netTaxableSalary - 500000.0;
        if (temp > 0 && temp > 200000) {
            incomeTax += 20000;
        } else if (temp > 0) {
            incomeTax += temp * 0.1;
        }

        temp -= 200000;

        if (temp > 0 && temp > 400000) {
            incomeTax += 80000;
        } else if (temp > 0) {
            incomeTax += temp * 0.2;
        }

        temp -= 400000;

        if (temp > 0) {
            incomeTax += temp * 0.3;
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("\t\t\tSYSO Digital Enterprises");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Name: " + getName() + "\t\t|\t\t" + "Emp ID: " + getID());
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        System.out.println("Salary Details: ");
        System.out.println("\tBasic Salary:                " + india.format(getBaseSalary()));
        System.out.println("\tHouse Rent Allowance:        " + india.format(getHouseRentAllowance()));
        System.out.println("\tDearness Allowance:          " + india.format(getDearnessAllowance()));
        System.out.println("\tTravelling Allowance:        " + india.format(getTravellingAllowance()));
        System.out.println("\tMedical Allowance:           " + india.format(getMedicalAllowance()));
        System.out.println("\tProvident Fund Contribution: " + india.format(getPF()));
        System.out.println();
        System.out.println("\tNet Annual Salary            " + india.format(getAnnualSalary()));
        System.out.println();
        System.out.println("Taxation Details: ");
        System.out.println("\tGross Salary:                " + india.format(getAnnualSalary()));
        System.out.println("\tStandard Deductions:         -Rs.50,000");
        System.out.println("\tHouse Rent Allowance:        " + india.format(getHouseRentAllowance() * -1));
        System.out.println("\tNet Taxable Salary:          " + india.format(netTaxableSalary));
        System.out.println();
        System.out.println("\tNet Income Tax:              " + india.format(incomeTax));
    }

}

public class TaxCalculator {
    public static void main(String[] args) {
        Employee emp = new Employee(1001, "Dewashish Mehta", 1600000);
        emp.calculateAllowances();
        emp.displaySlip();
    }
}
