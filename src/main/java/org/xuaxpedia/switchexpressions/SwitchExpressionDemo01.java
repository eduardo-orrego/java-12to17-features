package org.xuaxpedia.switchexpressions;

// In Java 17, switch expressions are standardized with a modern and concise syntax,
// allowing values to be returned and multi-line expressions to be used. The new syntax,
// which includes the "->" operator, simplifies case definitions and improves code readability,
// facilitating more expressive and compact conditional structures.

public class SwitchExpressionDemo01 {

    enum Vehicule {
        CAR,
        PLANE,
        TRAIN
    }

    public static void main(String[] args) {

        Vehicule vehicule = Vehicule.CAR;

        switch (vehicule) {
            case CAR -> System.out.println("Car");
            case PLANE -> System.out.println("Plane");
            case TRAIN -> System.out.println("Train");
            default -> System.out.println("Not Found");
        }

    }

}

