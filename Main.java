/*
* This program is the Main program.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-17
*/

import java.util.Scanner;

/**
* This is the Main class program.
*/
final class Main {

    /**
    * Space.
    */
    public static final String SPACE = "\n";

    /**
    * Invailed Input.
    */
    public static final String ININ = "Invailed Input!";

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting... the main method
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Truck truck = new Truck();
        final Bike bike = new Bike();

        // Starting...
        System.out.println("Vehicles properties:");

        // Truck
        System.out.println(SPACE + "Truck:" + SPACE);
        // License plate number based on Vehicle class.
        final int plate = truck.getPlate();
        System.out.print("-Truck License plate number: " + plate + SPACE);
        // Truck Number Of Tires.
        final int tiress = truck.getNumbbTires();
        System.out.print("-Truck Number Of Tires: " + tiress + SPACE);
        // Truck Color.
        final String colorr = truck.getColour();
        System.out.print("-Truck color: " + colorr + SPACE);
        // Truck Air Break.
        // User Input.
        final Scanner myObjj = new Scanner(System.in);
        System.out.print(SPACE + "Truck Air Break (yes or no): ");
        final String userIntt = myObjj.nextLine();
        // Break statment.
        if (userIntt.equals("yes") || userIntt.equals("Yes") 
            || userIntt.equals("YES") || userIntt.equals("Y")) {
            System.out.println(SPACE + "Air Break System Activation..." 
                                     + SPACE);
            truck.setAirBreak(userIntt + " Activated.");
            System.out.println(truck.getAirBreak());
            System.out.println(SPACE + "Done." + SPACE);
        } else if (userIntt.equals("no") || userIntt.equals("NO")
                   || userIntt.equals("No") || userIntt.equals("N")) {
            System.out.println(SPACE + "No Air Break System Activation..." 
                                     + SPACE);
            System.out.println("Done." + SPACE);
        } else {
            System.out.println(SPACE + ININ + SPACE);
        }

        // Bike
        System.out.println(SPACE + "-----------------------" + SPACE);
        System.out.println(SPACE + "Bike:" + SPACE);
        // Bike color.
        final String colorrr = bike.getColourr();
        System.out.print("-Bike color: " + colorrr + SPACE);
        // Bike number of tires.
        final int tires = bike.getNumbTires();
        System.out.print("-Bike Number Of Tires: " + tires + SPACE);
        // Bike Speed based on Vehicle class.
        final int speed = bike.getSpeed();
        System.out.print("-Bike Speed: " + speed + SPACE);
        // adding speed by user input
        final Scanner myObj = new Scanner(System.in);
        System.out.print(SPACE + 
                         "Speed up (Min Speed: 0 | Max Speed: 50 | KM/H): ");
        int userIn = myObj.nextInt();
        if ((userIn > 0) && (userIn <= 50)) {
            System.out.println(SPACE + "Speeding up..." 
                                     + SPACE);
            final int speedup = bike.getSpeed();
            final int result = (speedup) + (userIn);
            System.out.print(SPACE + "Current Speed: " + result + " Km/H"
                                + SPACE);
        } else if ((userIn < 0) || (userIn >= 50)) {
            System.out.println(SPACE + "(Min Speed: 0 | Max Speed: 50 | KM/H)"
                                     + SPACE  + SPACE 
                                     + "   You can't speed up to: "
                                     + userIn + " Km/H" + SPACE);
        } else {
            System.out.println(SPACE + ININ + SPACE);
        }

        // Bike bell based on Vehicle class.
        final String bell = bike.getRingBell();
        // adding speed by user input
        final Scanner myObjjj = new Scanner(System.in);
        System.out.print(SPACE + "Ring bell (Yes or No): ");
        String userI = myObjjj.nextLine();
        if (userI.equals("yes") || userI.equals("Yes") 
            || userI.equals("YES") || userI.equals("Y")) {
            System.out.println(SPACE + ".... BING BING BING ....." + SPACE);
        } else if (userI.equals("no") || userI.equals("NO")
                    || userI.equals("No") || userI.equals("N")) {
                    // nothing pfff.
        } else {
            System.out.println(SPACE + ININ + SPACE);
        }

        // Done.
        System.out.print(SPACE + "Done." + SPACE);
    }
}
