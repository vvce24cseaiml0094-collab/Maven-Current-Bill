package com.example;

public class Source {

    public double calculateBill(int units) {

        if (units < 0) {
            throw new IllegalArgumentException("Units cannot be negative");
        }

        double bill = 0;

        // Slab 1: 0–100 units
        if (units <= 100) {
            bill = units * 1.5;
        }

        // Slab 2: 101–200 units
        else if (units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        }

        // Slab 3: 201–300 units
        else if (units <= 300) {
            bill = (100 * 1.5)
                 + (100 * 2.5)
                 + (units - 200) * 4.0;
        }

        // Slab 4: Above 300 units
        else {
            bill = (100 * 1.5)
                 + (100 * 2.5)
                 + (100 * 4.0)
                 + (units - 300) * 5.0;
        }

        // Fixed charge
        bill = bill + 50;

        return bill;
    }
}