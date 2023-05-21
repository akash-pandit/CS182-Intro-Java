/**
 * class ArrowDemo
 * 1) create empty RightArrow object
 * 2) perform operations on and draw RightArrow
 * 3) create RightArrow object w/ parameters
 * 4) draw new RightArrow object
 * 5) create LeftArrow object with parameters
 * 6) perform operations on and draw LeftArrow
 * 7) create empty LeftArrow object
 * 8) draw new LeftArrow object
 * 9) ???
 * 10) Profit
 * 
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @since v1.0, 5/13/2023
 */
public class ArrowDemo {
    public static void main(String[] args) {
        RightArrow right1 = new RightArrow();
        right1.drawShapeOn();;
        right1.setXAdj(10);
        right1.drawShapeOn();
        right1.setYAdj(5);
        right1.setArrowDim(10, 15);
        right1.drawShapeOn();

        RightArrow right2 = new RightArrow(5, 10, 15, 14);
        right2.drawShapeOn();

        LeftArrow left1 = new LeftArrow(13, 0, 15, 15);
        left1.drawShapeOn();
        left1.setArrowDim(10, 10);
        left1.drawShapeOn();
        left1.setXAdj(5);
        left1.drawShapeOn();
        left1.setYAdj(5);
        left1.drawShapeOn();

        LeftArrow left2 = new LeftArrow();
        left2.drawShapeOn();
    }
}
