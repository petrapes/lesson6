package com.engeto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("Here is the story: \n" +
                "Once upon a time there was " + name + ", who was teacher" + ". \n" +
                "On the way to work, " + name + " reflected on life. \n" +
                "Perhaps " + name + " will not be teacher" + " forever.");
    }
}
