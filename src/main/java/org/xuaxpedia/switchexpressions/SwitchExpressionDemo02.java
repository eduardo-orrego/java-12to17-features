package org.xuaxpedia.switchexpressions;

import java.util.Scanner;

/*
* This example demonstrates the use of switch expressions in Java, introduced as a preview
* feature in Java 12 and standardized in Java 14.
* Switch expressions allow for more concise and expressive code by returning values directly
* from each case using the 'yield' keyword.
* In this example, a day of the week is read from user input and a switch expression is used
* to map it to a corresponding integer value.
* When the input does not match any valid case, a default case handles the invalid input,
* prints a message, and returns a value of 0.
* This returned value (0) is assigned to a variable, allowing it to be captured and used
* later in the program’s execution flow.
* Two different switch expression syntaxes are demonstrated: the modern arrow (->) syntax
* and the traditional colon (:) syntax combined with the 'yield' statement.
* In all cases, each branch of the switch produces a value, ensuring that the switch
* expression as a whole evaluates to a single result.
*/

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