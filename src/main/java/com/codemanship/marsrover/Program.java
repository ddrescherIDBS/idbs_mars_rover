package com.codemanship.marsrover;

import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target coordinates and direction: ");

        String input = scanner.nextLine();
        String[] inputs = input.split(",");
        String x = inputs[0];
        String y = inputs[1];
        String direction = inputs[2];

        String directionToPrint = switch (direction)
        {
            case "N" -> "North";
            case "E" -> "East";
            case "S" -> "South";
            case "W" -> "West";
            default -> "None";
        };

        System.out.println("The rover has been dropped at coordinates (" + x + "," + y + ") facing " + directionToPrint);
    }
}
