package pckg_lab5;

import java.util.HashMap;

/**
 * Class formed of the Boat objects
 * @see Boat class Boat
 * @author sit
 * @version 1.1
 */

public class Fleet {

    // attributes name and data structure <K,V>
    private String name;
    private HashMap<Boat, Integer> fleet;



    /**
     *
     * @param name String name of the fleet
     */
    public Fleet(String name){
        this.name = name;
        this.fleet = new HashMap<>();

    }

    /**
     * Method that adds boats to the fleet
     * @param boat Object of the class Boat
     * @see Boat
     */
    public void addBoat2Fleet(Boat boat){
        fleet.put(boat, boat.getID());
    }



    /**
     * Method that list all boats in the fleet
     */
    public void allBoats4Fleet(){
        // for-each boat in fleet{
        for (Boat boat : fleet.keySet()){
        System.out.println("------------------------------------");
        System.out.println(boat);
        System.out.println("Number of missions: " + fleet.get(boat));
    }
}

    /**
     * Method that checks if the boat is in the fleet
     * @param boat Object of the class Boat
     */
    public void boatInFleet(Boat boat){
        if (fleet.containsKey(boat)){
        System.out.println("<<<<<<<<<<<< " + boat.getID() + " >>>>>>>>>>>>");
        System.out.println(boat);
        System.out.println("Is in the fleet -> " + true);
    } else {
        System.out.println("<<<<<<<<<<<< " + boat.getID() + " >>>>>>>>>>>>");
        System.out.println(boat);
        System.out.println("Is in the fleet -> " + false);
        }
        }
        }
