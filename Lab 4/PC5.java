import javax.swing.JOptionPane;

/**
 * Description of class PC5
 * 1) Collect a string through a JOptionPane
 * 2) Input a single char string to check for occurrences in the base string
 * 3) Trim down and convert the 2nd string to a char
 * 4) Loop through base string and check each char if it's a string, incrementing a counter if it is
 * 5) Return the count of that char in the base string in a formatted string response
 * 6) ???
 * 7) Profit
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 3/4/2023, Akash Pandit, v1.0
 */
public class PC5 {
    public static void main(String[] args) {
        // initialize str, chr, and counter
        String str;  // holds baseline str
        char chr;  // holds char to be checked
        int counter;  // holds count of char in str

        str = JOptionPane.showInputDialog(null, "Enter a String");
        chr = JOptionPane.showInputDialog(null, "Enter a char to be assessed").charAt(0);

        counter = 0;  // set counter to 0
        for (int i = 0; i < str.length(); i++) {
            // create loop var i, increment it with every loop with the true condition being
            // i being smaller than the str length
            if (str.charAt(i) == chr)
                counter++;  // increment counter if the character in str at index i is the char we're checking for
        }

        // output
        System.out.println("In the phrase: " + str);
        if (counter > 1) {
            System.out.println("There are " + counter + ' ' + chr + "'s");
        } else {
            System.out.println("There is 1 " + chr);  // grammatically correct output for singular presence
        }
    }
}
