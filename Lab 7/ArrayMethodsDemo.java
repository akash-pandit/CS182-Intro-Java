import java.util.Arrays;

/**
 * Driver for running and testing ArrayMethodsDemo
 * 
 * @author Rico Cassoni, richard.cassoni@gcccd.edu
 * @version v1.0
 * @since 2/14/2022
 */
public class ArrayMethodsDemo  //change name to Main and rename file to Main.java for Replit
{
    public static void main (String[] args){
        ArrayMethods test = new ArrayMethods();
        System.out.println("Lab7 Pt1 - Let's get ready to rumble :-)");
        System.out.println("========================================");
        System.out.println("a[] has " + test.count() + " elements");
        System.out.println("The sum of all elements in a[] is: " + test.sum());
        System.out.printf("The avg of all elements in a[] is: %.2f\n", test.average());
        System.out.println("The largest number in a[] is: " + test.findMax());
        System.out.println("The index of the largest number in a[] is: " + test.findIndexOfMax());
        System.out.println("The last (or right most) index of 8 is: " + test.findLast(8));
        System.out.println("The last (or right most) index of 2 is: " + test.findLast(2));
        int[] findAll8s = test.findAll(8);
        System.out.print("8s were located in the following indices ");
        test.print(findAll8s);
        int[] copyOfA = test.copyArray();
        System.out.println("a[] and copyOfA[] are equal: " + Arrays.equals(test.getArray(),copyOfA));

        //Part 2
        System.out.println("\n\nLab7 Pt2 - Let's continue to rumble :-)");
        System.out.println("=======================================");
        test.sortArray(copyOfA);
        System.out.print("copyOfA[] sorted is: ");
        test.print(copyOfA);
        System.out.println("a[] and copyOfA[] are equal: " + Arrays.equals(test.getArray(),copyOfA));
        int[] anotherCopyOfA = test.copyArray();
        System.out.print("anotherCopyOfA[]: ");
        test.print(anotherCopyOfA);
        Arrays.sort(anotherCopyOfA);
        System.out.print("anotherCopyOfA[] sorted: ");
        test.print(anotherCopyOfA);
        System.out.println("copyOfA[] and anotherCopyOfA[] are equal: " + Arrays.equals(copyOfA, anotherCopyOfA));
        anotherCopyOfA = test.reverseArray(anotherCopyOfA);
        System.out.print("anotherCopyOfA[] reversed is: ");
        test.print(anotherCopyOfA);
        System.out.println();
        test.genFiveByFiveRows();
        System.out.println();
        test.genFiveByFiveCols();
    }
}
