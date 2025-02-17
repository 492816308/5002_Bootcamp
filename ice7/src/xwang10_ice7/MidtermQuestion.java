package xwang10_ice7;

/**
 * Midterm Question:
 * Write a class named Day.
 * The class should have an int field named dayNumber that holds the number of the day. For example, Monday would be 1,
 * Tuesday would be 2, and so forth. In addition, provide the following methods:
 * • A no-arg constructor that sets the dayNumber field to 1.
 * • A constructor that a8ūuiyccepts the number of the day as an argument. It should set the
 * dayNumber field to the value passed as the argument. If a value less than 1 or greater
 * than 7 is passed, the constructor should set dayNumber to 1.
 * • A setDayNumber method that accepts an int argument, which is assigned to the dayNumber field.
 * If a value less than 1 or greater than 7 is passed, the method should set dayNumber to 1.
 * • A getDayNumber method that returns the value in the dayNumber field.

 */
public class MidtermQuestion {
    public class Day {
        private int dayNumber;

        public Day() {
            dayNumber = 1;
        }

        public Day(int dayNumber) {
            this.dayNumber = dayNumber;
            if (dayNumber < 1 || dayNumber > 7) {
                this.dayNumber = 1;
            }
        }

        public void setDayNumber(int day) {
            dayNumber = day;
        }

        public int getDayNumber() {
            return dayNumber;
        }
    }
}
