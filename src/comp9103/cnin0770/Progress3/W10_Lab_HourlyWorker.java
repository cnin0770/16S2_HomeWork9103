package comp9103.cnin0770.Progress3;

/**
 * Created by cnin0770 on 12/10/16.
 */
public class W10_Lab_HourlyWorker extends W10_Lab_Worker {
    int hours;
    double salary;
    private final int hoursMax = 40;
    private final double exceedingRate = 1.5;

    public W10_Lab_HourlyWorker () {}

    public W10_Lab_HourlyWorker (String name, double rate, int hours) {
        super(name, rate);
        this.hours = hours;
    }

    public double computePay (double rate, int hours) {
        if (hours <= 40) {
            salary = rate * hours;
        } else {
            salary = rate * hoursMax + rate * exceedingRate * (hours - hoursMax);
        }

        return salary;
    }
}
