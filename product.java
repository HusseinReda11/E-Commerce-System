public class product {
protected  int productId;
protected String Name;
protected double price;

    public product() {
    }

    public product(int productId, String name, double price) {
        this.productId = productId;
       this.Name = name;
        this.price = price;
    }

    public int getProductId() {
        if (productId>0){
            return productId;
        }
        else {
            return productId*-1;
        }
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        if (price>0){
            return price;
        }
        else {
        return price*-1;
    }
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
