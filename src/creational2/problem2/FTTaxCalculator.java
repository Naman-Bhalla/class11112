package creational2.problem2;

public enum FTTaxCalculator implements TaxCalculator {
    INSTANCE;

    @Override
    public double calculateTax(Employee e) {
        return ((30. * e.getSalary()) / 100) +
                ((3. * e.getSalary())/ 100) +
                ((2. * e.getSalary())/ 100);
    }
}


//public class FTTaxCalculator implements TaxCalculator {
//    FTTaxCalculator() {}
//    @Override
//    public double calculateTax(Employee e) {
//        return ((30. * e.getSalary()) / 100) +
//                ((3. * e.getSalary())/ 100) +
//                ((2. * e.getSalary())/ 100);
//    }
//}