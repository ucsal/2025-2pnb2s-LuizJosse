package br.com.mariojp.solid.srp;

public class Main {
    public static void main(String[] args) {
        // Configura a taxa de imposto para 8%
        System.setProperty("tax.rate", "0.08");

        // Cria o pedido
        Order order = new Order();
        order.add(new Item("Café", 8.0, 2));   // 16
        order.add(new Item("Bolo", 12.5, 1));  // 12.5 -> subtotal 28.5

        // Gera o recibo
        ReceiptService service = new ReceiptService();
        String receipt = service.generate(order);

        // Exibe o recibo
        System.out.println(receipt);
    }
}
