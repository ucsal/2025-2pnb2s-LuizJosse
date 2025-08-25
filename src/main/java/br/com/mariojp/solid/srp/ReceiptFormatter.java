package br.com.mariojp.solid.srp;

public class ReceiptFormatter {

    public String format(Order order, double tax, double total) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RECIBO ===\n");
        for (Item i : order.getItems()) {
            sb.append(i.getName())
              .append(" x").append(i.getQuantity())
              .append(" = ").append(i.getTotalPrice())
              .append("\n");
        }
        sb.append("Subtotal: ").append(order.getSubtotal()).append("\n");
        sb.append("Tax: ").append(tax).append("\n");
        sb.append("Total: ").append(total).append("\n");
        return sb.toString();
    }
}
