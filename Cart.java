
public class Cart {
    protected int customerid;
    protected int nproduct;
    protected product products[];
    protected int counter = 0;
    public Cart() {
    }
    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int i) {
        this.customerid = i;
    }

    public int getNproduct() {
        return nproduct;
    }

    public void setNproduct(int nproduct) {
        this.nproduct = Math.abs(nproduct);
        products = new product[nproduct];
    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    public void addproduct(product p) {
        if (counter > products.length - 1) {
            System.out.println("your cart is full");
        return;
        }
else {
            products[counter] = p;
            counter++;
        }
    }

    public void removeproduct(int index) {
        products[index] = null;
        counter--;
        product arr[] = new product[nproduct -1];
        for (int i = 0, j = 0; i < nproduct; i++) {
            if (products[i] != null) {
                arr[j] = products[i];
                j++;
            }
        }
        products = arr;
    }

        public float calcPrice()
        {
            float total = 0;
            for (int i = 0; i < getNproduct(); i++) {
                total+=products[i].getPrice();
            }
            return total;
      }

    public void placeOrder() {
        for (int i = 0; i < getNproduct(); i++) {
            product currentProduct = products[i];
            System.out.printf("Product: %s, Price: %s%n", products[i].getName(), products[i].getPrice());
        }
        System.out.printf("Total Price: %s%n", calcPrice());
        products= new product[0];
    }
    }



