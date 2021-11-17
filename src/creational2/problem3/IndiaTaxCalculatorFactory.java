package creational2.problem3;

public class IndiaTaxCalculatorFactory implements  TaxCalculatorFactory{

    public TaxCalculator getTaxCalculator(Employee e) {
        switch (e.getType()) {
            case INTERN:
                return InternTaxCalculator.INSTANCE;
            case PART_TIME:
                return PTTaxCalculator.INSTANCE;
            case FULL_TIME:
                return FTTaxCalculator.INSTANCE;
        }

        return null;
    }

    @Override
    public TaxCalculator getFTTaxCalculator() {
        return FTTaxCalculator.INSTANCE;
    }

    @Override
    public TaxCalculator getInternTaxCalculator() {
        return InternTaxCalculator.INSTANCE;
    }

    @Override
    public TaxCalculator getPartTimeTaxCalculator() {
        return PTTaxCalculator.INSTANCE;
    }
}
