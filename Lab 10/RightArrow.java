/**
 * class RightArrow
 * inherits from BasicShape (which implements BasicInterface) and
 * implements ArrowInterface
 * Provides public methods to define the parameters of a RightArrow and
 * to draw it
 */
public class RightArrow extends BasicShape implements ArrowInterface {
    private int tail;
    private int width;

    /**
     * empty constructor
     * xAdj & yAdj = 0, tail & width = 5
     */
    RightArrow() {
        super();
        tail = 5;
        width = 5;
    }

    /**
     * constructor for RightArrow
     * @param xAdj horizontal displacement from next line
     * @param yAdj vertical displacement from next line
     * @param tail length of tail
     * @param width width of arrowhead
     */
    RightArrow(int xAdj, int yAdj, int tail, int width) {
        super(xAdj, yAdj);
        this.tail = tail;
        if (width % 2 == 0) {
            this.width = width + 1;
        } else {
            this.width = width;
        }
    }

    /**
     * sets the dimensions of the right arrow object
     * @param newTail the length of the tail to set
     * @param newWidth the width of the arrowhead to set
     */
    public void setArrowDim(int newTail, int newWidth) {
        tail = newTail;
        if (width % 2 == 0) {
            width = newWidth + 1;
        } else {
            width = newWidth;
        }
    }

    /**
     * helper method to draw the tail of the arrow
     */
    private void drawTail() {
        for (int i = 0; i < tail; i++) {
            System.out.print('*');
        }
    }

    /**
     * helper method to draw out spaces by the tail and behind the arrowhead
     */
    private void drawSpaces() {
        for (int i = 0; i < tail + getXAdj(); i++) {
            System.out.print(' ');
        }
    }

    /**
     * actually draws the right arrow object
     */
    public void drawShape() {
        // Draw the arrow up to the mid line
        for (int i = 0; i < width / 2; i++) {
            drawSpaces();  // x adj factored in
            System.out.print('*');

            // draw the spaces
            for (int j = 0; j < i - 1; j++) {
                System.out.print(' ');
            }

            //draw the outer *
            if (i != 0) {
                System.out.println('*');
            } else {
                System.out.println();
            }
        } 

        // move mid line by x adjustment
        for (int i = 0; i < getXAdj(); i++) {
            System.out.print(' ');
        }
        // Draw the arrow at the mid line (tail & peak of head)
        drawTail();
        System.out.print('*');
        // fill in the hollow part of the tip
        for (int i = 1; i < width / 2; i++) {
            System.out.print(' ');
        }
        System.out.println('*');

        // Draw the arrow past the mid line
        for (int i = 0; i < width / 2; i++) {
            drawSpaces();
            System.out.print('*');

            for (int j = width; j > i + width / 2 + 3; j--) {
                System.out.print(' ');
            }
            if (i != width / 2 - 1) {
                System.out.println('*');
            } else {
                System.out.println();
            }
        } 
    }
}
