package lv.rvt.kopsbro;


class Warehouse {
    private double balance;
    private double capacity;

    public Warehouse(double capacity) {
        this.capacity = capacity;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) return; 
        balance += amount;
        if (balance > capacity) balance = capacity; 
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) return 0;
        double taken = Math.min(amount, balance);
        balance -= taken;
        return taken;
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }
}

class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.name = productName;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + ": " + super.toString();
    }
}

