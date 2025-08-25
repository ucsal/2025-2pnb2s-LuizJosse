package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private final double taxRate;

    public TaxCalculator() {
        // Usa System property (se não definido, assume 10%)
        String rate = System.getProperty("tax.rate", "0.10");
        this.taxRate = Double.parseDouble(rate);
    }

    public double calculate(double subtotal) {
        return subtotal * taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
