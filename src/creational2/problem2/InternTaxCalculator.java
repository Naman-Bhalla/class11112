package creational2.problem2;

public enum InternTaxCalculator implements TaxCalculator {
    INSTANCE;

    @Override
    public double calculateTax(Employee e) {
        return ((20. * e.getSalary()) / 100);
    }
}

// public enum EmployeeType {
//  A, B, C
// }