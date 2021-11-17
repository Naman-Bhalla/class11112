package creational2.problem1;

public class TaxCalculatorImpl implements TaxCalculator{

    @Override
    public double calculateTax(Employee e) {
        return ((20. * e.getSalary()) / 100) +
                ((3. * e.getSalary())/ 100);
    }
}
