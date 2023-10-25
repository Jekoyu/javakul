package Constructor;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            KasirCoba cashier = new KasirCoba();

            while (true) {
                System.out.println("Masukkan nama barang (ketik 'selesai' untuk mengakhiri): ");
                String itemName = input.next();

                if (itemName.equalsIgnoreCase("selesai")) {
                    break;
                }

                System.out.println("Harga per item: Rp ");
                double itemPrice = input.nextDouble();

                System.out.println("Jumlah barang yang dibeli: ");
                int itemQuantity = input.nextInt();

                cashier.addItem(itemName, itemPrice, itemQuantity);
            }

            System.out.println("Total Belanja: Rp " + cashier.calculateTotal());
        }
    }
}