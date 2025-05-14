package pckg_lab4;

import java.util.ArrayList;

/**
 * Class Boat that receives boat name and needs to
 * populate crew members list
 * @author sit
 * @version 1.1
 */


public class Boat {

    // class attributes -> see class diagram
    private static int cbt = 0;
    private int id = 10;
    private String boatName;
    private ArrayList<String> crew;

    /**
     * Constructor for the class Boat
     * @param name String name for the boat
     */
    public Boat(String name){
        this.boatName=name;
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
        for (String memb : crew){
            System.out.println("Crew member: " + memb);
        }
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
