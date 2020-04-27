/**
 * Exercise: ArrayList Debugging Activity
 * The following code demonstrates using the ArrayList. It adds several items to the list,
 * shows the list,  * removes some items, and displays the list again.
 * Or at least it should. This code doesn't work. It won't compile. Find the errors and fix it:
 *
 * * * * * * * * * * * * * * * * *       OUTPUT after Debugging   * * * * * * * * * * * * * * * * * * *
 *
 * Initial size of al: 0
 * Size of al after additions: 7
 * Contents of al: [C, A2, A, E, B, D, F]
 * Size of al after deletions: 5
 * Contents of al: [C, A2, E, B, D]
 *
 */

import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {
        
            // Create an arraylist
            ArrayList al = new ArrayList();
            System.out.println("Initial size of al: " + al.size());

            // Add elements to the arraylist
            al.add("C");
            al.add("A");
            al.add("E");
            al.add("B");
            al.add("D");
            al.add("F");
            al.add(1, "A2");
            System.out.println("Size of al after additions: " + al.size());     // "sizes" was corrected to be "size"

            // Display the arraylist
            System.out.println("Contents of al: " + al);

            // Removes elements from the arraylist
            al.remove("F");
//            al.remove("G");                                                   // "G" does not exist in the list
            al.remove(2);

            System.out.println("Size of al after deletions: " + al.size());     // "sizes" was corrected to be "size"
            System.out.println("Contents of al: " + al);
        
    }   // end of main()
}       // end of class
