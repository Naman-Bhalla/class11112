package creational2.problem1;

public class Client {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculatorImpl();

        Employee a = new FTEmployee();
        a.setSalary(100);

        Employee b = new Intern();
        b.setSalary(50);

        Employee c = new PartTimeEmployee();
        c.setSalary(70);

        System.out.println(taxCalculator.calculateTax(a));
        System.out.println(taxCalculator.calculateTax(b));
        System.out.println(taxCalculator.calculateTax(c));

    }
}
