package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Conditional Statements
 *
 * Learn how to control the flow of your program using if/else and switch statements.
 * Conditional statements allow your program to make decisions based on conditions.
 */
public class ConditionalStatements {

    public static void main(String[] args) {

        // DONE: 1 - Write an if statement that prints "Positive" if a number is greater than 0
        // Declare an int variable called number and assign it a positive value.

        int number = 7;

        if (number > 0) {
            IO.println("%d is a positive number."
                    .formatted(number));
        }


        // DONE: 2 - Add an else clause to the above that prints "Not positive"
        // Change the value of number to a negative value or 0 to test both branches.

        number = -3;

        if (number > 0) {
            IO.println("%d is a positive number."
                    .formatted(number));
        } else if (number < 0) {
            IO.println("%d is a negative number."
                    .formatted(number));
        }


        // DONE: 3 - Write an if/else if/else chain for grade classification
        // Declare an int variable called score and assign it a value (0-100).
        // If score >= 90, print "Grade: A"
        // Else if score >= 80, print "Grade: B"
        // Else if score >= 70, print "Grade: C"
        // Else print "Grade: F"

        int score = 85;

        if (score >= 90) {
            IO.println("Grade: A");
        } else if (score >= 80) {
            IO.println("Grade: B");
        } else if (score >= 70) {
            IO.println("Grade: C");
        } else {
            IO.println("Grade: E");
        }


        // DONE: 4 - Write a switch statement for day of the week
        // Declare an int variable called day (1-7).
        // Use a switch statement to print the day name:
        //   1 -> "Monday", 2 -> "Tuesday", ... 7 -> "Sunday"
        // Include a default case for invalid values.

        int day = 3;

        switch (day) {
            case 1 -> IO.println("Monday");
            case 2 -> IO.println("Tuesday");
            case 3 -> IO.println("Wednesday");
            case 4 -> IO.println("Thursday");
            case 5 -> IO.println("Friday");
            case 6 -> IO.println("Saturday");
            case 7 -> IO.println("Sunday");
            default -> IO.println("Invalid value");
        }


        // DONE: 5 - Use a switch statement with a String
        // Declare a String variable called month (e.g., "February").
        // Use a switch statement to print the number of days in that month.
        // Handle at least 3-4 months plus a default case.

        String month = "February";

        switch (month) {
            case "January" -> IO.println(30);
            case "February" -> IO.println(28);
            case "March" -> IO.println(31);
            case "April" -> IO.println(30);
            case "May" -> IO.println(31);
            default -> IO.println("Invalid value");
        }


        // DONE: 6 - Use a switch expression (Java 14+) to return a value
        // Using the 'day' variable from above, assign the day name to a String
        // using a switch expression with arrow syntax:
        //   String dayName = switch (day) {
        //       case 1 -> "Monday";
        //       ...
        //   };
        // Print the result.

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        IO.println("Day name: %s"
                .formatted(dayName));


        // TODO: 7 - Write a nested if statement to check if a number is positive AND even
        // Declare an int variable called value.
        // First check if it is positive (> 0).
        //   If positive, check if it is even (value % 2 == 0).
        //     If even, print "Positive and even"
        //     Else print "Positive and odd"
        //   Else print "Not positive"

        int value = 8;

    }
}
