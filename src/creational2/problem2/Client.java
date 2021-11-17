package creational2.problem2;

public class Client {
    public static void main(String[] args) {
        TaxCalculatorFactory taxCalculatorFactory = new TaxCalculatorFactory();

        Employee a = new FTEmployee();
        a.setSalary(100);

        Employee b = new Intern();
        b.setSalary(50);

        Employee c = new PartTimeEmployee();
        c.setSalary(70);

        // object of a subtype of TaxCalculator interface based on type of an employee
        System.out.println(taxCalculatorFactory.getTaxCalculator(a).calculateTax(a));
        System.out.println(taxCalculatorFactory.getTaxCalculator(b).calculateTax(b));
        System.out.println(taxCalculatorFactory.getTaxCalculator(c).calculateTax(c));

        // getInstance()

    }
}
