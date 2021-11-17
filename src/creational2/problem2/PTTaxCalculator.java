package creational2.problem2;

public enum PTTaxCalculator implements TaxCalculator {
    INSTANCE;

    @Override
    public double calculateTax(Employee e) {
        return ((20. * e.getSalary()) / 100) +
                ((2. * e.getSalary())/ 100) +
                ((5. * e.getSalary())/ 100);
    }
}
