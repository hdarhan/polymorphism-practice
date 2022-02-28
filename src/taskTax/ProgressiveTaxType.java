package taskTax;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        // TODO override me!
        if (amount >= 100000) {
            return amount * 0.15;
        } else {
            return amount * 0.10;
        }
    }
}