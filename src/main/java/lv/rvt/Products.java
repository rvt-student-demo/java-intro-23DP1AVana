package lv.rvt;
public class Products {
    private String initiallName;
    private double initialPrice;
    private int initialQuantity;
    
    
    Products(String initialName, double initialPrice, int initialQuantity){
        this.initiallName = initialName;
        this.initialPrice =initialPrice;
        this.initialQuantity=initialQuantity;
    }
    public void printProducts(){
        System.out.println(initiallName+", price "+initialPrice+", "+initialQuantity+" pcs");

    }
}
