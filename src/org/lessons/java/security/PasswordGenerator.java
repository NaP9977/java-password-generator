package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {
    String name;
    String lastName;
    String favouriteColor;
    int day;
    int month;
    int year;
    int somma;
  char slash;
  String password;



    name = "Pinco";
    lastName = "Pallo";
    favouriteColor = "magenta";
    slash = '-';
    day = 12;
    month = 5;
    year = 1994;
    somma = day + month + year;
    password = name + slash + lastName + slash + favouriteColor + slash + somma;

System.out.println(password);




    }
}
