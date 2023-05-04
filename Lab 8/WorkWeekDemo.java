/**
 * WorkEnum
 * Create a class and an enum to perform operations on various different
 * days of the work week. Introduction to enums and execution of advanced
 * class concepts.
 *
 * @author Akash Pandit
 * @version v1.0, 4/29/2023
 */

class WorkWeekDemo {
    public static void main(String args[]) {
        // initialize various WorkWeek objects
        WorkWeek noArgConst = new WorkWeek();
        WorkWeek begin = new WorkWeek(WorkEnum.MONDAY);
        WorkWeek mid = new WorkWeek(WorkEnum.WEDNESDAY);
//        WorkWeek weekend = new WorkWeek(WorkEnum.SATURDAY);

        // Execute various WorkWeek methods on these objects
        noArgConst.daysAreSame(begin);
        noArgConst.daysAreSame(mid);
        noArgConst.compareDays(begin);
        noArgConst.compareDays(mid);
        mid.compareDays(begin);
        mid.printDay();
    }
}
