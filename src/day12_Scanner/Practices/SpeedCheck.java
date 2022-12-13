package day12_Scanner.Practices;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int speedLimit = 55;

        System.out.println("Enter current speed: ");
        int currentSpeed = input.nextInt();

        if (currentSpeed>55) {
            System.out.println("You're driving "+(currentSpeed-speedLimit)+" mph over the limit. Slow down!");
        }

    }

}
/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */