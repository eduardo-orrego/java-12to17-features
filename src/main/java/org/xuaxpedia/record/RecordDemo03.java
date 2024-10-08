package org.xuaxpedia.record;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Records allow defining immutable classes for efficient data transfer, automating
// the generation of methods such as equals(), hashCode(), and toString(), as well
// as a constructor and getter methods. The immutability of records eliminates the
// need for setters, simplifying the creation of data classes and improving code
// clarity and maintainability.

public class RecordDemo03 {

    public static void main(String[] args) {

        List<Merchant> merchantList = Arrays.asList(
                new Merchant("Juan", 43528578),
                new Merchant("Luis", 42526585),
                new Merchant("Roger", 48859624)
        );

        List<Merchant> sortedSales = findTopMerchants(merchantList, 3);

        System.out.println("Result of ordered sales");
        sortedSales.forEach(merchant -> System.out.printf("dni: %s, name: %s %n", merchant.dni,
                merchant.name));

    }

    static List<Merchant> findTopMerchants(List<Merchant> merchants, int month) {

        // Local record
        record MerchantSales(Merchant merchant, double sales) {
        }

        return merchants.stream()
                .map(merchant -> new MerchantSales(merchant, merchant.computeSales(merchant, month)))
                .sorted((m1, m2) -> Double.compare(m2.sales(), m1.sales()))
                .map(MerchantSales::merchant)
                .collect(Collectors.toList());
    }

}

class Merchant {

    String name;
    int dni;

    Merchant(String name, int dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public int getDni() {
        return dni;
    }

    public double computeSales(Merchant merchant, int month) {
        return Math.random() * 1000.00;
    }

}
