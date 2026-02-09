package labwork1.problem1;

public class Data {
    private int count;
    private double max;
    private double sum;

    public Data() {
        this.count = 0;
        this.max = 0;
        this.sum = 0;
    }

    public void insert(int num) {
        sum += num;
        count++;
        max = Math.max(max, num);
    }

    public double getAvg() {
        return sum / count;
    }

    public double getMax() {
        return max;
    }
}
