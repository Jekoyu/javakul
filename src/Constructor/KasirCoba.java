package Constructor;

class KasirCoba {
    private double total;

    public KasirCoba() {
        total = 0.0;
    }

    public void addItem(String itemName, double itemPrice, int quantity) {
        double itemTotal = itemPrice * quantity;
        total += itemTotal;
        System.out.println("Menambahkan " + itemName + " x " + quantity + " ke keranjang.");
    }

    public double calculateTotal() {
        return total;
    }
}