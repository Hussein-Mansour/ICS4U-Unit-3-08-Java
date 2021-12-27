/*
* This program is my Vehicle class.
*
* @author  Hsen Mansour
* @version 1.0
* @since   2021-12-014
*/

/**
* This is the Vehicle class program.
*/

public class Vehicle {

    /**
    * Color for Truck.
    */
    private String color = "Red.";

    /**
    * Color for Bike.
    */
    private String bColor = "Blue.";

    /**
    * Number of doors.
    */
    private String nbdoors = "4 Doors";

    /**
    * Plate.
    */
    private int plate = 1;

    /**
    * Speed.
    */
    private int speed = 1;

    /**
    * Max Speed.
    */
    private int maxspeed = 1;

    /**
    * Accelerate.
    */
    private String accelerate;

    /**
    * Break.
    */
    private String brake;

    // --------------START------------------

    /**
    * Method getPlate.
    *
    * @return plate.
    */
    public final int getPlate() {
        return plate;
    }

    /**
    * Method getColour.
    *
    * @return color.
    */
    public final String getColour() {
        return color;
    }

    /**
    * Method getColourr.
    *
    * @return bColor.
    */
    public final String getColourr() {
        return bColor;
    }

    /**
    * Method getNbDoors.
    *
    * @return nbdoors.
    */
    public final String getNbDoors() {
        return nbdoors;
    }

    /**
    * Method getSpeed.
    *
    * @return speed.
    */
    public final int getSpeed() {
        return speed;
    }

    /**
    * Method maxspeed.
    *
    * @return maxspeed.
    */
    public final int maxSpeed() {
        return maxspeed;
    }

    // Sets & Gets accelerate.
    // Set.
    public final void setAccelerate(String accelerate) {
        this.accelerate = accelerate;
    }

    /**
    * Method getAccelerate.
    *
    * @return accelerate.
    */
    public final String getAccelerate() {
        return accelerate;
    }

    // Sets & Gets break.
    // Set.
    public final void setBrake(String brake) {
        this.brake = brake;
    }

    /**
    * Method getBreak.
    *
    * @return brake.
    */
    public final String getBreak() {
        return brake;
    }
}
