import java.math.*;
public class ElectronicProduct extends product{
private String brand ;
private int  warrantyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String brand, int warrantyPeriod, int productId, String name, double price) {
       super(productId, name, price);
        this.brand = brand;
    Math.abs( this.warrantyPeriod = warrantyPeriod);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        if (warrantyPeriod>0){
            return warrantyPeriod;
        }
        else {
            return warrantyPeriod*-1;
        }
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
