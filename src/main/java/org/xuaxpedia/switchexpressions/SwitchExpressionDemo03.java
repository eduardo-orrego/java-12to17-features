package org.xuaxpedia.switchexpressions;

import java.io.IOException;
import java.time.DayOfWeek;
import java.util.Scanner;

/*
* This example demonstrates the use of switch expressions in Java, introduced as a preview
* feature in Java 12 and standardized in Java 14.
* Switch expressions allow for more concise and expressive code by using the modern arrow (->) syntax
* and enabling multiple labels for a single case.
*/

public class SwitchExpressionDemo03 {

    public static void main(String[] args) throws IOException {

        System.out.println("------Using Switch before-------");
        System.out.print("Enter the day of the week: ");

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toUpperCase();

        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                System.out.println("Working Day");
                break;
            case "SATURDAY":
            case "SUNDAY":
                System.out.println("Weekdays");
                break;
            default:
                System.err.println("invalid entered value");
                System.exit(1);
                break;
        }

        System.out.println("-------Using Switch Expressions-------");
        System.out.println("Enter the day of the week: ");
        Scanner scanner2 = new Scanner(System.in);
        String day2 = scanner2.nextLine().toUpperCase();

        switch (day2) {
            case "MONDAY", "FRIDAY", "SUNDAY", "TUESDAY", "THURSDAY" -> System.out.println("Working Day");
            case "SATURDAY", "WEDNESDAY" -> System.out.println("Weekdays");
            default -> {
                System.err.println("invalid entered value");
                System.exit(1);
            }
        }

        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day2);

        int numLetters = switch (dayOfWeek) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };

        System.out.println("Month Number: " + numLetters);

    }

}
