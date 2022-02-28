package taskTax;

public class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        // TODO override me!
        return amount * 0.18;
    }
}