package lv.rvt;
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count=count;
        this.sum=sum;
    }

    public void addNumber(int number) {
        count++;
    }

    public int getCount() {
        return count;
    }
    public int sum(){
        sum = sum + addNumber();
    }
    public double average() {
        // write code here
    }
}