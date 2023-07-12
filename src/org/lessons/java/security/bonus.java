package org.lessons.java.security;
import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        String lastName;
        String favouriteColor;
        int day;
        int month;
        int year;
        int somma;
        char slash;
        String password;

        name = input.nextLine();
        lastName = input.nextLine();
        favouriteColor = input.nextLine();
        day = input.nextInt();
        month = input.nextInt();
        year = input.nextInt();
        somma = day + month + year;
        slash = '-';
        password = name + slash + lastName + slash + favouriteColor + slash + somma;

        System.out.println(password);

    }
}
