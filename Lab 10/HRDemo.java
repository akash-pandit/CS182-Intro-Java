import java.util.ArrayList;

/**
 * class HRDemo
 * driver class for lab 10, creates varying objects of FullTime, Adjunct, and Employee types
 * performs various methods on and compares them
 *
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @since v1.0, 5/13/2023
 */
class HRDemo {
    public static void main(String[] args) {
        // create different employee type workers
        FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);
        Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);
        FullTime wilma = new FullTime();

        // add attributes to fulltime obj wilma
        wilma.setName("Flintstone, Wilma");
        wilma.setIdNum("BR-3");
        wilma.setHireYear(2015);
        wilma.setSalary(78123.2468);

        // create 2 new employees
        Employee betty = new Employee("Rubble, Betty", 2017, "BR-4");
        FullTime wilma2 = new FullTime("Slate, Wilma", 2015, "BR-3", 78123.2468);

        // init list of employees & add employees
        ArrayList<Person> staff = new ArrayList<>();
        staff.add(fred);
        staff.add(barney);
        staff.add(wilma);
        staff.add(betty);
        staff.add(wilma2);

        // output all employees
        for (int i = 1; i < staff.size(); i++) {
            System.out.println("Employee #" + i);
            System.out.println(staff.get(i-1));
        }

        // compare wilma & wilma2 by id number w/ id nums & removes dupes
        if (wilma.equals(wilma2)) {
            System.out.println("Both Wilmas are the same person");
            staff.remove(4);  // remove duplicate wilma
        } else {
            System.out.println("The Wilmas are different people");
        }

        // output all employees
        for (int i = 1; i < staff.size(); i++) {
            System.out.println("Employee #" + i);
            System.out.println(staff.get(i-1));
        }
    }
}
