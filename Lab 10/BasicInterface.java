/**
 * basic shape interface
 * acts as a framework for basic shape objects
 * provides get/set methods for x/yAdj, a drawShapeOn method, and an abstract drawShape method
 */
interface BasicInterface {
    /**
     * skeleton for a set method for xAdj
     * @param newXAdj xAdj to set
     */
    void setXAdj(int newXAdj);

    /**
     * skeleton for a get method for xAdj
     * @return xAdj
     */
    int getXAdj();

    /**
     * skeleton for a setmethod for yAdj
     * @param newYAdj yAdj to set
     */
    void setYAdj(int newYAdj);

    /**
     * skeleton for a get method for yAdj
     * @return yAdj
     */
    int getYAdj();

    /**
     * method to be implemented to draw out a shape, calls drawShape()
     */
    void drawShapeOn();
    
    /**
     * abstract method to be implemented to draw out a shape
     */
    abstract void drawShape();
}
