/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Scanner;

public class TroubleCar
{
    public static void main(String[] args)
    {
        System.out.println("Please enter Y for yes and N for no when answering the following questions.\n");
        System.out.print("Is the car silent when you turn the key? ");
        Scanner input = new Scanner(System.in);
        String q1 = input.nextLine();

        if(q1.equals("Y") || q1.equals("y"))
        {
            troubleBattery(input);
        }
        else if(q1.equals("N") || q1.equals("n"))
        {
            troubleNoise(input);
        }
    }

    public static void troubleBattery(Scanner input)
    {
        System.out.print("Are the battery terminals corroded? ");
        String q2 = input.nextLine();

        if(q2.equals("Y") || q2.equals("y"))
        {
            System.out.println("\nClean terminals and try starting again.");
        }
        else if(q2.equals("N") || q2.equals("n"))
        {
            System.out.println("\nReplace cables and try again.");
        }
    }

    public static void troubleNoise(Scanner input)
    {
        System.out.print("Does the car make a slicking noise? ");
        String q2 = input.nextLine();

        if(q2.equals("Y") || q2.equals("y"))
        {
            System.out.println("\nReplace the battery.");
        }
        else if(q2.equals("N") || q2.equals("n"))
        {
            troubleStart(input);
        }
    }

    public static void troubleStart(Scanner input)
    {
        System.out.print("Does the car crank up but fail to start? ");
        String q3 = input.nextLine();

        if(q3.equals("Y") || q3.equals("y"))
        {
            System.out.println("\nCheck spark plug connections.");
        }
        else if(q3.equals("N") || q3.equals("n"))
        {
            troubleEngine(input);
        }
    }

    public static void troubleEngine(Scanner input)
    {
        System.out.print("Does the engine start and then die? ");
        String q4 = input.nextLine();

        if(q4.equals("Y") || q4.equals("y"))
        {
            troubleFuel(input);
        }
        else if(q4.equals("N") || q4.equals("n"))
        {
            System.out.println("\nThis should not be possible.");
        }
    }

    public static void troubleFuel(Scanner input)
    {
        System.out.print("Does your care have fuel injection? ");
        String q5 = input.nextLine();

        if(q5.equals("Y") || q5.equals("y"))
        {
            System.out.println("\nGet it in for service.");
        }
        else if(q5.equals("N") || q5.equals("n"))
        {
            System.out.println("\nCheck to ensure the choke is opening and closing.");
        }
    }
}