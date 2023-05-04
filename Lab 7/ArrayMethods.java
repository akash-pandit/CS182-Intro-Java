import java.util.Arrays;

/**
 * class ArrayMethods
 * provides a bunch of methods for a specified array object a
 *
 * @author Akash Pandit, aspandit@ucsc.edu
 * @version v1.0
 * @since 4/22/2023
 */
public class ArrayMethods
{
    private int[] a = {7, 8, 8, 3, 4, 9, 8, 7};  // declare & initialize array a

    /**
     * public method count
     * loops through the array using a for each loop and increments a value for return
     * @return the length of the array
     */
    public int count() {
        int count;
        count = 0;
        for (int val: a) {
            count++;  // increments count by 1 for each value in array a 
        } return count;
    }

    /**
     * public method sum
     * loops through the array using a for each loop and gathers the sum 
     * @return the sum of all values of array a
     */
    public int sum() {
        int sum;
        sum = 0;
        for (int val: a) {
            sum += val;  // increments sum by current iterated value in array
        } 
        return sum;
    }

    /**
     * public method average
     * computes and returns the average value of the integer array a
     * @return the average value of the integer array a
     */
    public double average() {
        return (double) sum()/count();
    }

    /**
     * public method findMax
     * loops through the array and compares values to find the max value in O(n) time
     * @return the maximum value of array a
     */
    public int findMax() {
        int max;
        max = a[0];  // sets max to the first value of array a
        for (int val: a) {
            if (val > max) {
                max = val;  // reassigns max as the current iterated value if that value > max
            }
        } 
        return max;
    }

    /**
     * public method findIndexOfMax
     * compares the max value of array a and finds its index
     * @return int, the index of the max value of array a
     */
    public int findIndexOfMax() {
        int max;
        max = findMax();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {  // checks if the value at index i is the max value
                return i;
            } 
        } 
        return -1;
    }

    /**
     * public method findLast
     * searches backwards through array a for the first occurrence of value key and returns that value's index
     * @param key - a value to search for in array a
     * @return the last index of value key in array a, or -1 if value key is not in array a
     */
    public int findLast(int key) {
        for (int i = a.length - 1; i >= 0; i--) {  // loops backwards through the array
            if (key == a[i]) {
                return i;
            }
        }
        return -1;  // only runs if key was not found in array a
    }

    /**
     * public method findAll
     * searches through array a to find the number of occurrences of value key
     * creates an array all to hold all indices of value key in array a
     * loops through array a again to find those indices and add them to array all
     * @param key - a value to search through array a for
     * @return an array of the indices of all occurrences of key in array a
     */
    public int[] findAll(int key) {
        int[] all;  // array that holds all indices of key in array a
        int count, ind;  // count: num of occurrences of key in a, ind: current index of array all

        // loop through array a and increment a counter for how many times key occurs
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                count++;
            }
        }

        // initialize all to an array of size count (will reserve just the right amount of memory slots)
        all = new int[count];
        ind = 0;  // initialize ind to beginning of all
        // loop through a again to find all instances of key in a and add their index to all and moving ind accordingly
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                all[ind] = i;
                ind++;
            }
        }
        return all;  // return the built array 
    }

    /**
     * public method getArray
     * getter method for array a, since its a private var
     * @return array a
     */
    public int[] getArray() {
        return a;
    }

    /**
     * public method copyArray
     * basically getArray but instead of actually returning array a it returns a copy
     * @return a copy of array a using Arrays' copyOf method
     */
    public int[] copyArray() {  // Note: use Arrays.copyOf()
        return Arrays.copyOf(a, a.length);
    }

    /**
     * public method print
     * **THIS CODE WAS GIVEN IN THE LAB 7 PT 1 FILE**
     * prints a formatted integer array in format {n1, n2, ... nN}
     * @param a an array of integers
     */
    public void print(int[] a) {
        System.out.print("{");
        int i;
        // prints all but the last array integer in the format 'n, '
        for (i = 0; i < a.length - 1; ++i) {
            System.out.print(a[i] + ", ");
        }
        // printst the last array integer, being careful to not access a value in an empty array
        if (a.length > 0) {
            System.out.print(a[i]);
        } System.out.println("}");  // prints the closing brace of the array and newlines
    }

    /*
    ---------- Part 2 --------------------------------------------------------------------------------------
     */

    /**
     * public method sortArray
     * returns a sorted version of the input array using a selection sort / bubble sort implementation
     * @param inArray - the array to be sorted
     */
    public void sortArray(int[] inArray) {
        boolean sorted;  // tells us if the array is sorted or not
        int temp;  // placeholder value
        for (int val: inArray) {
            sorted = true;
            for (int i = 0; i < inArray.length-1; i++) {
                if (inArray[i] > inArray[i+1]) {  // checks if the current value is greater than the next value
                    sorted = false;  // a swap will occur in the array
                    temp = inArray[i];
                    inArray[i] = inArray[i+1];
                    inArray[i+1] = temp;
                }
            }
            if (sorted) // only runs if the entire array is iterated over without swapping anything
                return;
        }
    }

    /**
     * public method reverseArray
     * returnes a reversed version of a given array of integers
     * @param inArray - the array of ints to be reversed
     * @return the reversed array
     */
    public int[] reverseArray(int[] inArray) {
        int[] output = new int[inArray.length];  // creates output array as an empty array as long as input
        for (int i = 0; i < inArray.length; i++) {
            output[inArray.length - 1 - i] = inArray[i];  //loops forwards, adds values backwards
        }
        return output;  // returns new reversed array
    }

    /**
     * public method genFiveByFiveRows
     * creates a matrix of integers, each row contains its row number
     * prints the contents of the matrix using for loops
     */
    public void genFiveByFiveRows() {
        int[][] matrix = {{1, 1, 1, 1, 1},
                          {2, 2, 2, 2, 2},
                          {3, 3, 3, 3, 3},
                          {4, 4, 4, 4, 4},
                          {5, 5, 5, 5, 5}};

        System.out.println("  A B C D E");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1);  // print row num
            System.out.print(' ');
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]);  // print matrix object at pos [i][j]
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    /**
     * public method genFiveByFiveRows
     * creates a matrix of integers, each column contains its column letter
     * prints the contents of the matrix using for loops
     */
    public void genFiveByFiveCols() {
        char[][] matrix = {{'A', 'B', 'C', 'D', 'E'},
                           {'A', 'B', 'C', 'D', 'E'},
                           {'A', 'B', 'C', 'D', 'E'},
                           {'A', 'B', 'C', 'D', 'E'},
                           {'A', 'B', 'C', 'D', 'E'}};

        System.out.println("  A B C D E");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1);  // print row num
            System.out.print(' ');
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]);  // print matrix object at pos [i][j]
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
