package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = kb.nextLine();

        System.out.println("How much money do you have?");
        hasMarker m = new hasMarker(kb.nextDouble());

        boolean b = hasMarker.canAfford();

    }
}
