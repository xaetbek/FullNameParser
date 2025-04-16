package org.pluralsight;

import java.util.Scanner;

public class NameParser {
    public static void parse() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (i.e. First Middle Last): ");
        String fullName = scanner.nextLine().trim();

        String firstName = grabFirstWord(fullName);
        String lastName = grabLastWord(fullName);
    }

    public static String grabFirstWord(String fullName) {
        return fullName.substring(0, fullName.indexOf(' '));
    }
    public static String grabLastWord(String fullName) {
        return fullName.substring(fullName.lastIndexOf(' ') + 1);
    }
}
