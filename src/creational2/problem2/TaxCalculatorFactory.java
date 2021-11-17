package creational2.problem2;

public class TaxCalculatorFactory {

    TaxCalculator getTaxCalculator(Employee e) {
        switch (e.getType()) {
            case INTERN:
                return InternTaxCalculator.INSTANCE;
            case PART_TIME:
                return PTTaxCalculator.INSTANCE;
            case FULL_TIME:
//                return new FTTaxCalculator();
                return FTTaxCalculator.INSTANCE;
        }

        return null;
    }
}
