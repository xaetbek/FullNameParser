package org.pluralsight;

public class Main {
    public static void main(String[] args) {

        NameParser.parse();
        System.out.println(NameParser.grabFirstWord("Khayotbek Azimov"));
        System.out.println(NameParser.grabLastWord("Khayotbek Azimov"));
    }
}