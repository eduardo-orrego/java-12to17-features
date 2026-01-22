package org.xuaxpedia.switchexpressions;

// In Java 17, switch expressions are standardized with a modern and concise syntax,
// allowing values to be returned and multi-line expressions to be used. The new syntax,
// which includes the "->" operator, simplifies case definitions and improves code readability,
// facilitating more expressive and compact conditional structures.

public class SwitchExpressionDemo01 {

    enum Vehicule {
        CAR("Model S", "Tesla"),
        PLANE("A320", "Airbus"),
        TRAIN("TGV", "Alstom");

        String manufacturer;
        String model;

        Vehicule(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }

        public String get() {
            return "Vehicule Name: " + name() + ", Model: " + model + ", Manufacturer: " + manufacturer;
        }
    }

    public static void main(String[] args) {

        Vehicule vehicule = Vehicule.PLANE;

        switch (vehicule) {
            case CAR, PLANE, TRAIN -> System.out.println(vehicule.get());
            default -> System.out.println("Not Found");
        }

    }

}

