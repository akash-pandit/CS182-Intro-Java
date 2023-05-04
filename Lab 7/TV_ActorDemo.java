import java.util.ArrayList;

/**
 * class TV_ActorDemo:
 * 1) Create an empty ArrayList of TV_Actor objects based on TV_Actor.java
 * 2) Add actors to the list and print its contents
 * 3) Remove actors and add new actors to specific indices and print its contents with each change
 * 4) ???
 * 5) Profit
 *
 * @author Akash Pandit, aspandit@ucsc.edu
 * @version v1.0
 * @since 4/22/2023
 */
public class TV_ActorDemo { // Change to Main in Replit and rename file to Main.java
    //write out main()
    public static void main(String args[])
    {
        //create TV_Actor ArrayList called list
        ArrayList<TV_Actor> list = new ArrayList<TV_Actor>();
        list.add(new TV_Actor("Bart", "The Simpsons"));  //add TV_Actor Bart, The Simpsons
        list.add(new TV_Actor("Maggie", "The Simpsons"));  //add TV_Actor Maggie, The Simpsons
        list.add(new TV_Actor("Lisa", "The Simpsons"));  //add TV_Actor Lisa, The Simpsons
        printArrayList(list);  // print list to stdout

        //remove Maggie (item 1 from the list) and print to stdout
        list.remove(1);
        printArrayList(list);

        // replace list pos 1 with new tv actor Butthead from B&B
        list.remove(1);
        list.add(1, new TV_Actor("Butthead", "B&B"));
        printArrayList(list);

        // add new tv actor Beavis from B&B to position 1 in list and print to stdout
        list.add(1, new TV_Actor("Beavis", "B&B"));
        printArrayList(list);

        // remove object at index 0 from list and print to stdout
        list.remove(0);
        printArrayList(list);
    }//end main()

    /**
     * formats and prints the contents of a TV Actor ArrayList to stdout
     * @param inList - the ArrayList<TV_Actor> to output
     */
    public static void printArrayList(ArrayList<TV_Actor> inList){
        System.out.println("Printing ArrayList<TV_Actor> list");
        int actorNumber=0;
        for (TV_Actor entry:inList){
            System.out.println("Actor " + actorNumber + " " + entry);
            actorNumber++;
        }
        System.out.println();
    }//end printArrayList
}//end TCV_ActorDemo