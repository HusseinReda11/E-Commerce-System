public class ClothingProduct extends product{
private String fabric ;
private String size  ;

    public ClothingProduct() {
    }

    public ClothingProduct(String fabric, String size,int productId, String name, double price) {
      super( productId, name, price);
        this.fabric = fabric;
        this.size = size;
    }


    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
