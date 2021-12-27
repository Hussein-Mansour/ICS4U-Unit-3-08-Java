/*
* This is the Bike class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-17
*/

/**
* Bike class inheritance from Vehicle.
*/
public class Bike extends Vehicle {

    /**
    * ring bell.
    *
    * @param ring
    */
    private String ring;

    /**
    * Number of Bike tires.
    *
    * @param nbtires bike number tires.
    */
    private final int nbtires = 2;

    /**
    * Sets the Bike ring bell.
    * Getts the Bike ring bell.
    *
    * @param ring ring bell.
    */

    // Setter.
    public final void setRingBell(String ring) {
        this.ring = ring;
    }

    // Getter.
    public final String getRingBell() {
        return ring;
    }

    /**
    * Getts the Bike number of tires.
    *
    * @return nbtires
    */

    // Getter.
    public final int getNumbTires() {
        return nbtires;
    }
}
