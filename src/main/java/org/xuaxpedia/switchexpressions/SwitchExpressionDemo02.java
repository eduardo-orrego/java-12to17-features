package org.xuaxpedia.switchexpressions;

import java.util.Scanner;

// In Java 17, switch expressions are standardized with a modern and concise syntax,
// allowing values to be returned and multi-line expressions to be used. The new syntax,
// which includes the "->" operator, simplifies case definitions and improves code readability,
// facilitating more expressive and compact conditional structures.

public class SwitchExpressionDemo02 {

    public static void main(String[] args) {

        System.out.print("Enter the day of the week: ");
        Scanner scanner1 = new Scanner(System.in);
        String day1 = scanner1.nextLine().toUpperCase();

        int result1 = switch (day1) {
            case "MONDAY" -> 1;
            case "TUESDAY" -> 2;
            default -> {
                System.out.println("invalid day entered");
                yield 0;
            }
        };

        System.out.println("result: " + result1);

        System.out.print("\nEnter the day of the week: ");
        Scanner scanner2 = new Scanner(System.in);
        String day2 = scanner2.nextLine().toUpperCase();

        int result2 = switch (day2) {
            case "MONDAY":
                yield 1;
            case "TUESDAY":
                yield 2;
            default:
                System.out.println("invalid day entered");
                yield 0;
        };

        System.out.println("result: " + result2);
    }

}
