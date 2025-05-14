package pckg_lab4;

public class Test {
    public static void main(String[] args) {
        // Create object -> name Bonaca
        Boat betina700 = new Boat("Bonaca");

        // add crew members
        for (int i=1; i<=5; i++){
            betina700.addCrewMember("Member_" + i );
        }

        // list all crew members
        betina700.listAllCrewMembers();

        System.out.println("-------------------------------------------");
        // print string representation of the object
        System.out.println(betina700);

    }
}
