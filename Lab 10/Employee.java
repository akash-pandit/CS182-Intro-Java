/**
 * class Employee
 * "is a" Person
 * contains methods to set/get hire year and id number, to compare for equality, and a custom
 * print output
 */
class Employee extends Person {
    private int hireYear;
    private String idNum;

    /**
     * empty Employee constructor
     * name = "No name yet", hireYear = 0, idNum = "Onboarding"
     */
    Employee() {
        super();
        hireYear = 0;
        idNum = "Onboarding";
    }

    /**
     * Employee constructor
     * @param name - employee name
     * @param hYear - year employee was hired
     * @param idNumber - id number for employee
     */
    Employee(String name, int hYear, String idNumber) {
        super(name);
        hireYear = hYear;
        idNum = idNumber;
    }

    /**
     * comparison method to test if 2 employee objects are the same employee by comparing ID nums
     * @param o - object to compare, cast to Employee object
     * @return bool whether they're the same or not
     */
    public boolean equals(Object o) {
        boolean isEqual = false;
        if (o != null && getClass() == o.getClass()) {
            Employee copy = (Employee) o;
            if (idNum.equalsIgnoreCase(copy.idNum)) {
                isEqual = true;
            }
        } return isEqual;
    }

    /**
     * @return the amount of years an employee's been employed
     */
    public int getServiceYears() {
        return CURRENT_YEAR - hireYear;
    }

    /**
     * getter method for hireYear
     * @return hireYear
     */
    public int getHireYear() {
        return hireYear;
    }

    /**
     * setter method for hireYear
     * @param hYear year to set as hireYear
     */
    public void setHireYear(int hYear) {
        hireYear = hYear;
    }

    /**
     * getter method for idNum
     * @return idNum
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * setter method for idNum
     * @param newIdNum idNum to set
     */
    public void setIdNum(String newIdNum) {
        idNum = newIdNum;
    }

    /**
     * overwrites Person.toString, outputs object data to stdout
     * @return Person.toString + id number + year hired + years of service
     */
    public String toString() {
        return super.toString() +
                "\nID Number: " + getIdNum() +
                "\nYear Hired: " + getHireYear() + " Years of Service: " + getServiceYears() + "\n";
    }
}
