package comp9103.cnin0770.Progress3;

/**
 * Created by cnin0770 on 12/10/16.
 */
public abstract class W10_Lab_Worker {
    protected String name;
    protected double rate;

    public W10_Lab_Worker () {}

    public W10_Lab_Worker(String name, double rate) {}

    public abstract double computePay(double rate, int time);
}
