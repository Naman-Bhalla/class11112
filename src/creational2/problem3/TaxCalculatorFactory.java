package creational2.problem3;

public interface TaxCalculatorFactory {
    public  TaxCalculator getInternTaxCalculator();

    public  TaxCalculator getFTTaxCalculator();

    public  TaxCalculator getPartTimeTaxCalculator();

    public  TaxCalculator getTaxCalculator(Employee e);

//    TaxCalculator getTaxCalculator(Employee e) {
//        switch (e.getType()) {
//            case INTERN:
//                return InternTaxCalculator.INSTANCE;
//            case PART_TIME:
//                return PTTaxCalculator.INSTANCE;
//            case FULL_TIME:
//                return FTTaxCalculator.INSTANCE;
//        }
//
//        return null;
//    }
}


// Furniture Factory -> Furniture
// chairs -> Furniture
// tables -> Furniture
// sofas -> Furniture