//package comp9103.cnin0770;

/**
 Exercise 2: Staff Class
 Define a Staff class so that the staff receives their biweekly salary
 based on their hourly rates and how many hours they worked.
 Write the class to:
 b) Describe the data (instance variables)
 c) Define the constructor(s)
 d) Define on the methods
 */
public class W6_HomeworkExercise2_Staff {
    double hourRate, biWeekSalary;
    int workHoursPerDay;
    static int biWeekHours = 10;

    public W6_HomeworkExercise2_Staff(){}

    public W6_HomeworkExercise2_Staff (double rate, int hours) {
        hourRate = rate;
        workHoursPerDay = hours;
        biWeekSalary = rate * hours * biWeekHours;
    }

    public static void main (String[] args) {
        W6_HomeworkExercise2_Staff staff1 = new W6_HomeworkExercise2_Staff(
                11.5, 4
        );
        System.out.println("staff 1's biweekly salary is " + staff1.getBiWeekSalary());

        W6_HomeworkExercise2_Staff staff2 = new W6_HomeworkExercise2_Staff(
                30, 8
        );
        System.out.println("staff 2's daily salay is " + staff2.salaryPerDay());
    }

    //to calculate salary per day
    public double salaryPerDay (){
        return workHoursPerDay * hourRate;
    }

    //get biweekly payment
    public double getBiWeekSalary () {
        return biWeekSalary;
    }
}
