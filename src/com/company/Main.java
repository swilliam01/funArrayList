package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        String input;

        colors.add("blue");
        colors.add("green");
        colors.add("black");

        do {
            System.out.println("Add a color :");
            input = keyboard.next();
            colors.add(input);

            for (int counter = 0; counter < colors.size(); counter++) {
                System.out.println(colors.get(counter));
            }
        }            while (input.equalsIgnoreCase("Q"));

    }

}