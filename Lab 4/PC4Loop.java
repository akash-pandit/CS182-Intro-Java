import javax.swing.JOptionPane;

/**
 * Description of class PC4Loop
 * 1) initialize string temp, holds JOptionPane until it's parsed to an int
 * 2) initialize ints width, line, spaces, stars for iteration
 * 3) run a loop that loops for each line in the output
 * 4) nest a loop that prints the spaces for each line in the output
 * 5) nest a loop that prints the stars for each line in the output
 * 6) do 4 and 5 again for the bottom half
 * 7) output diamond of specified width and kill the JOptionPane GUI thread
 * 8) ???
 * 9) Profit
 *
 * @author Akash Pandit
 * @version v1.0
 * @since 3/4/2023, Akash Pandit, v1.0
 */
public class PC4Loop {
    public static void main(String[] args) {
        String temp;
        int width, line, spaces, stars;

        temp = JOptionPane.showInputDialog(null, "Enter max width for stars.");
        width = Integer.parseInt(temp);

        if (width % 2 == 0)
            width++;

        for (line=0,spaces=width/2;line<=width/2;line++,spaces--){ ////how many lines should be based on width
            for (int i = 0; i < spaces; i++){  //this is for spaces
                System.out.print(" ");
            }
            for (stars=-1;stars<=line*2-1;stars++){  //this is for stars
                System.out.print("*");
            }
            System.out.println();  //this gets to next line
        }
        ////bottom half
        for (line=width/2,spaces=0;line>0;line--,spaces++){  //lines start one less than largest line in top half, go down, based on width
            for (int i = 0;i <= spaces; i++){  //this is for spaces
                System.out.print(" ");
            }
            for (stars=1;stars<=line*2-1;stars++){  //this is for stars
                System.out.print("*");
            }
            System.out.println();  //this gets to next line
        }
        System.exit(0);  //Kills JOptionPane GUI thread
    }  ////end main()
} ////end class