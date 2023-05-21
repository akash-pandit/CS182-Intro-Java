/**
 * class Adjunct
 * "is an" Employee
 * adds getter method for salary & custom string output
 */
class Adjunct extends Employee {
    double hours, hrRate;

    /**
     * empty Adjunct constructor
     * init Adjunct obj w/ name = "No name yet", hireYear = 0, idNum = Onboarding,
     * hours = 0, hrRate = 0
     */
    Adjunct() {
        super();
        hours = 0;
        hrRate = 0;
    }

    /**
     * Adjunct constructor
     * @param name - adjunct employee name
     * @param hYear - adjunct employee hiring year
     * @param idNumber - adjunct employee id num
     * @param hours - adjunct employee hours worked per pay
     * @param hrRate - adjunct employee hourly pay rate
     */
    Adjunct(String name, int hYear, String idNumber, double hours, double hrRate) {
        super(name, hYear, idNumber);
        this.hours = hours;
        this.hrRate = hrRate;
    }

    /**
     * getter method for salary (hours * hrRate)
     * @return salary (hours * hrRate)
     */
    public double getSalary() {
        return hours * hrRate;
    }

    /**
     * overwrites Employee.toString, outputs object when printed
     * @return Employee.toString + Hours, Hourly Rate, & Salary formatted
     */
    public String toString() {
        return super.toString() +
                "\nHours: " + hours + " Hourly Rate: " + hrRate + " Salary: " +
                String.format("$%,.2f\n", getSalary());
    }
}
