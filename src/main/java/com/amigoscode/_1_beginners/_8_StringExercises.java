package com.amigoscode._1_beginners;

/**
 * Exercise: Strings
 *
 * Learn how to work with Strings in Java.
 * Strings are objects that represent sequences of characters and come with
 * many useful built-in methods.
 */
public class _8_StringExercises {

    public static void main(String[] args) {

        String message = "Hello, Welcome to Amigoscode!";
        String padded = "   Hello World   ";
        String csv = "apple,banana,cherry,date,elderberry";

        // DONE: 1 - Get the length of the 'message' string and print it
        // Hint: Use the .length() method
        System.out.println(message.length());


        // DONE: 2 - Convert 'message' to uppercase and lowercase, and print both
        // Hint: Use .toUpperCase() and .toLowerCase()
        String upperCase = message.toUpperCase();
        String lowerCase = message.toLowerCase();
        System.out.println(upperCase);
        System.out.println(lowerCase);


        // Done: 3 - Get a substring of 'message' containing the first 5 characters and print it
        // Hint: Use .substring(startIndex, endIndex)
        String subString = message.substring(0, 5);
        System.out.println(subString);


        // Done: 4 - Check if 'message' contains the word "Amigoscode" and print the result
        // Hint: Use .contains()
        String contains = "Amigoscode";
        System.out.println(message.contains(contains));


        // Done: 5 - Replace "Amigoscode" with "Java" in 'message' and print the new string
        // Hint: Use .replace(oldValue, newValue)
        String result = message.replace("Amigoscode", "Java");
        System.out.println(result);


        // TODO: 6 - Trim the whitespace from the 'padded' string and print the result
        // Hint: Use .trim()


        // TODO: 7 - Split the 'csv' string by commas into a String array and print each element
        // Hint: Use .split(",") then loop through the resulting array


        // TODO: 8 - Check if two strings are equal using .equals() (not ==)
        // Create two String variables with the same text content and compare them.
        // Print the result of .equals() and explain why == may not work for Strings.

    }
}
