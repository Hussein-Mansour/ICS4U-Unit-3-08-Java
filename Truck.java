/*
* This is the Truck class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-17
*/

/**
* Truck class inheritance from Vehicle.
*/
public class Truck extends Vehicle {

    /**
    * Air Break.
    */
    private String airBreak;

    /**
    * Number of truck tires.
    *
    * @param nbbtires number tires.
    */
    private final int nbbtires = 6;

    /**
    * Sets & Gets the Truck air break.
    *
    * @param airBreak Set Air Break for truck.
    */

    // Setter.
    public final void setAirBreak(String airBreak) {
        this.airBreak = airBreak;
    }

    // Getter.
    public final String getAirBreak() {
        return airBreak;
    }

    /**
    * Getts the Truck Number of Tires.
    *
    * @return nbbtrires
    */

    // Getter.
    public final int getNumbbTires() {
        return nbbtires;
    }
}
