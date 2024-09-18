package org.xuaxpedia.newinstanceof;

// Introduced in Java 14 and standardized in Java 16, pattern matching with instanceof
// simplifies type checking and casting into a single operation, allowing direct handling
// of object elements if the expression matches the specified type. This enhances code
// readability and safety by avoiding explicit casts and conversion errors.

public class InstanceOfDemo03 {

    record Person(String name, int age) {
    }

    public static void main(String[] args) {

        String result1 = checkObject(new Person("Edward", 38));
        System.out.println(result1);
        String result2 = checkObject(new Figure("Circle", 100.00));
        System.out.println(result2);

    }

    public static String checkObject(Object obj) {

        if (obj instanceof Person person) {
            return "Name: %s, age: %s".formatted(person.name(), person.age());
        } else if (obj instanceof Figure figure) {
            return "Name: %s, perimeter: %s".formatted(figure.name, figure.perimeter);
        } else if (obj == null) {
            return "It is null";
        } else {
            return "It is an object";
        }

    }
}

class Figure {

    String name;
    double perimeter;

    Figure(String name, double perimeter) {
        this.name = name;
        this.perimeter = perimeter;
    }

}

