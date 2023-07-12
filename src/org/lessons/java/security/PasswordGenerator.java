package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {
    String name;
    String lastName;
    String favouriteColor;
    int day;
    int month;
    int year;
  char slash;
  String password;



    name = "Pinco";
    lastName = "Pallo";
    favouriteColor = "magenta";
    slash = '/';
    day = 12;
    month = 5;
    year = 1994;
    password = name + lastName + favouriteColor + day + slash + month + slash + year;

System.out.println(password);




    }
}
