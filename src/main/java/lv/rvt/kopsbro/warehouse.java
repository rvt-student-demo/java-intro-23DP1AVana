package lv.rvt.kopsbro;

public class warehouse {
    public static void main(String[] args) {
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        System.out.println(juice.getName()); 
        System.out.println(juice); 
    }
}