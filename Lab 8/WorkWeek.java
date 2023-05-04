class WorkWeek {
    private WorkEnum day;  // current workday of the week

    /**
     * constructor for an empty WorkWeek object, sets the day of the week
     * to monday
     */
    WorkWeek() {
        day = day.MONDAY;
    }

    /**
     * constructor for a WorkWeek object, sets
     * the day of the week to the parameter day
     * @param day the day of the week to set
     */
    WorkWeek(WorkEnum day) {
        this.day = day;
    }

    /**
     * public method daysAreSame
     * checks if inWorkWeek's day is the same as the current WorkWeek day, outputting
     * results to stdout
     * @param inWorkWeek the day to compare with this object's day
     */
    public void daysAreSame(WorkWeek inWorkWeek) {
        if (day.equals(inWorkWeek.getDay())) {
            System.out.println("The days are the same");
        } else {
            System.out.println("The days are different");
        }
    }

    /**
     * public method compareDays
     * compares a WorkEnum object to the current day of the WorkWeek to see which
     * one comes before or after or if they're the same. Results are outputted to
     * stdout.
     * @param inWorkWeek a WorkWeek object whose day parameter is taken to compare
     *                   for the current day of the week with the current day of the week
     */
    public void compareDays(WorkWeek inWorkWeek) {
        if (day.compareTo(inWorkWeek.day) < 0) {
            System.out.println(day + " comes before " + inWorkWeek.day);
        } else if (day.compareTo(inWorkWeek.day) == 0) {
            System.out.println(inWorkWeek.day + " is the same day as " + day);
        } else {
            System.out.println(day + " comes after " + inWorkWeek.day);
        }
    }

    /**
     * public method printDay
     * outputs the current day to stdout
     */
    public void printDay() {
        String newDay;
        newDay = day.toString().substring(0, 1) + day.toString().substring(1).toLowerCase();
        System.out.println("The day is " + newDay);
    }

    /**
     * public method getDay
     * getter method for day, returns the current day
     * @return the current day, a WorkEnum object
     */
    public WorkEnum getDay() {
        return day;
    }
}

enum WorkEnum {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}  // all possible workdays