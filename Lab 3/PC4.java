import javax.swing.JOptionPane;

/**
 * PC4 uses JOptionPane to average out a user's 3 test scores and tell them their letter and number grade
 * 1) Initialize exam1, exam2, exam3, avg, and grade
 * 2) Create JOptionPanes for each exam, saving them as e1, e2, and e3
 * 3) parse e1, e2, and e3 as ints exam1, exam2, exam3
 * 4) average the values and store in avg
 * 5) use if else if statements to determine letter grade
 * 6) dispaly letter grade and avg numerical grade in a JOptionPane
 * 7) exit gui
 * 8) ???
 * 9) Profit
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 2/25/23, Akash Pandit, v1.0
 */
public class PC4
{
    public static void main (String[] args){
        int exam1, exam2, exam3;
        double avg;
        char grade;

        String e1 = JOptionPane.showInputDialog(null, "What grade did you get on exam 1?");
        String e2 = JOptionPane.showInputDialog(null, "What grade did you get on exam 2?");
        String e3 = JOptionPane.showInputDialog(null, "What grade did you get on exam 3?");
        exam1 = Integer.parseInt(e1);
        exam2 = Integer.parseInt(e2);
        exam3 = Integer.parseInt(e3);

        avg = (exam1+exam2+exam3)/3.0;

        if (avg >= 90.0) {
            grade = 'A';
        } else if (avg >= 80.0) {
            grade = 'B';
        } else if (avg >= 70.0) {
            grade = 'C';
        } else if (avg >= 60.0) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        JOptionPane.showMessageDialog(null, String.format("With an average score of %,.1f", avg) + "\n" +
                "Your grade is: " + grade);  // output test avg and letter grade in JOptionPane
        System.exit(0);  // close gui thread
    }  // end method main
}  // end class PC4