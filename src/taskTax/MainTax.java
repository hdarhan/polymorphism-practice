package taskTax;

public class MainTax {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                // TODO создать платежи с различным типами налогообложения
                new Bill(100_000, new IncomeTaxType(), taxService),
                new Bill(100_000, new ProgressiveTaxType(), taxService),
                new Bill(100_000, new VATaxType(), taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}