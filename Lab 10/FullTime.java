/**
 * class FullTime
 * "is an" Employee
 * adds get/set methods for salary & custom string output
 */
class FullTime extends Employee {
    double salary;

    /**
     * empty FullTime constructor
     * init FullTime obj w/ name = "No name yet", hireYear = 0, idNum = Onboarding, salary = 0
     */
    FullTime() {
        super();
        salary = 0;
    }

    /**
     * FullTime constructor
     * @param name - full time employee name
     * @param hYear - full time employee hire year
     * @param idNumber - full time employee ID number
     * @param salary - full time employee yearly salary
     */
    FullTime(String name, int hYear, String idNumber, double salary) {
        super(name, hYear, idNumber);
        this.salary = salary;
    }

    /**
     * setter method for salary
     * @param salary - yearly salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * getter method for salary
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * overwrites Employee toString, returning employee toString & salary formatted
     * @return summarized info of full time worker when object printed
     */
    public String toString() {
        return super.toString() +
                "\nSalary: " + String.format("$%,.2f\n", getSalary());
    }
}
