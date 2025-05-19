package pckg_lab5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Boat that receives boat name and needs to
 * populate crew members list
 * @author ap
 * @version 1.1
 */


public class Boat {

    // Boat attributes
    // see LAB-06
    private static int counter = 10;
    private int id;
    private String boatName;
    private ArrayList<String> crew;


    /**
     * Constructor for the class Boat
     * @param name String name for the boat
     */
    public Boat(String name){
        this.id = counter;
        counter+=3;
        this.boatName = name;
        this.crew = new ArrayList<>();
    }



    /**
     * Method that ads members to the boat crew list
     * @param member String name of the member
     */
    public void addCrewMember(String member){
        crew.add(member);
    }



    /**
     * Method that lists all crew members
     */
    public void listAllCrewMembers(){
        for (String member : crew){
            System.out.println("Crew member: " + member);
        }
    }

    /**
     * new method
     * Getters for boat's id
     * @return id identification number of the boat
     */
    public int getID(){
        return id;
    }



    /**
     * new method
     * Adds all members from an array to the
     * crew's list
     * @param members String array - crew members names
     */
    public void addAllMembers(String[] members){
        crew.addAll(Arrays.asList(members));
    }

    @Override
    public String toString() {
        return "Boat{" +
                "id=" + id +
                ", boatName='" + boatName + '\'' +
                ", crew=" + crew +
                '}';
    }
}