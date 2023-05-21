/**
 * class LeftArrow
 * inherits from BasicShape (which implements BasicInterface) and
 * implements ArrowInterface
 * Provides public methods to define the parameters of a LeftArrow and
 * to draw it
 */
public class LeftArrow extends BasicShape implements ArrowInterface {
    private int tail;
    private int width;

    /**
     * empty constructor for a left arrow object
     * xAdj = 0, yAdj = 0, tail = 5, width = 5
     */
    LeftArrow() {
        super();
        tail = 5;
        width = 5;
    }

    /**
     * constructor for a left arrow object
     * @param xAdj the horizontal displacement from next line
     * @param yAdj the vertical displacement from next line
     * @param tail the length of the tail
     * @param width the width of the arrowhead
     */
    LeftArrow(int xAdj, int yAdj, int tail, int width) {
        super(xAdj, yAdj);
        this.tail = tail;
        if (width % 2 == 0) {
            this.width = width + 1;
        } else {
            this.width = width;
        }
    }

    /**
     * sets the dimensions of the arrow
     * @param newTail the length of the tail
     * @param newWidth the width of the arrowhead (++ if even)
     */
    public void setArrowDim(int newTail, int newWidth) {
        tail = newTail;
        if (newWidth % 2 == 0) {
            width = newWidth + 1;
        } else {
            width = newWidth;
        }
    }

    /**
     * draws out the tail of the arrow
     */
    private void drawTail() {
        for (int i = 0; i < tail; i++) {
            System.out.print('*');
        }
    }

    /**
     * helper method to draw spaces, has different loop parameters based
     * on whether you're drawing the top or bottom half of the arrow
     * @param i iterator, shows what Y pos this is in arrow
     * @param top boolean to determine top half or bottom half of arrow
     */
    private void drawSpaces(int i, boolean top) {
        if (top) {
            for (int j = width / 2; j > i; j--) {
                System.out.print(' ');
            }
        } else {
            for (int j = width; j > i + width / 2 + 3; j--) {
                System.out.print(' ');
            } 
        }
    }
    
    /**
     * actually draws out the arrow
     */
    public void drawShape() {
        // for i in range(width//2) (7)
        for (int i = 0; i < width / 2; i++) {
            drawSpaces(i, true);
            System.out.print('*');

            for (int j = 0; j < i - 1; j++) {
                System.out.print(' ');
            } 
            if (i != 0) {
                System.out.println('*');
            } else {
                System.out.println();
            }
        }
        System.out.print('*');
        for (int i = 0; i < width / 2 - 1; i++) {
            System.out.print(' ');
        } System.out.print('*');
        drawTail();
        System.out.println();

        for (int i = 0; i < width / 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(' ');
            } System.out.print('*');

            drawSpaces(i, false);
            if (i != width / 2 - 1) {
                System.out.println('*');
            } else {
                System.out.println();
            }
        }
        
    }
}
