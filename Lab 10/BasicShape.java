/**
 * abstract class BasicShape
 * implements BasicInterface
 * provides empty and parameterized constructor for BasicShape objs, set/get methods 
 * for xAdj and yAdj, and a drawing method
 */
abstract class BasicShape implements BasicInterface {
    private int xAdj;
    private int yAdj;

    /**
     * empty constructor
     * xAdj & yAdj = 0
     */
    BasicShape() {
        xAdj = 0;
        yAdj = 0;
    }

    /**
     * constructor for BasicShape objs
     * @param xAdj displacement from cursor left
     * @param yAdj displacement from cursor down
     */
    BasicShape(int xAdj, int yAdj) {
        this.xAdj = xAdj;
        this.yAdj = yAdj;
    }

    /**
     * setter method for xAdj
     * @param newXAdj xAdj to set
     */
    public void setXAdj(int newXAdj) {
        xAdj = newXAdj;
    }

    /**
     * getter method for xAdj
     * @return xAdj
     */
    public int getXAdj() {
        return xAdj;
    }

    /**
     * setter method for yAdj
     * @param newYAdj yAdj to set
     */
    public void setYAdj(int newYAdj) {
        yAdj = newYAdj;
    }
    
    /**
     * getter method for yAdj
     * @return yAdj
     */
    public int getYAdj() {
        return yAdj;
    }

    /**
     * draw method, moves down yAdj amt of lines then draws the shape
     * xAdj is accounted for in implementations of drawShape()
     */
    public void drawShapeOn() {
        for (int i = 0; i < yAdj; i++) {
            System.out.println();
        } drawShape();

    }

    /**
     * abstract skeleton for drawShape
     * implementations will shift horizontally based on xAdj and draw the shape
     */
    public abstract void drawShape();
}
