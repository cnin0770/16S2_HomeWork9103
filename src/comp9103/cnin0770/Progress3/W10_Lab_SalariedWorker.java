package comp9103.cnin0770.Progress3;

/**
 * Created by cnin0770 on 12/10/16.
 */
public class W10_Lab_SalariedWorker extends W10_Lab_Worker {
    private final int hoursPerWeek = 40;

    public W10_Lab_SalariedWorker() {
    }

    public W10_Lab_SalariedWorker(String name, double rate) {
        super(name, rate);
    }

    public double computePay(double rate, int hours) {
        return hoursPerWeek * rate;
    }
}
