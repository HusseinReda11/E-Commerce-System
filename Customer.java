public class Customer {
    private int customerid ;
    private String name ;
    private String address;

    public Customer() {
    }
    public Customer(int customerid, String name, String address) {
        System.out.println("enter your id ");
        this.customerid = customerid;
        System.out.println("enter your name ");
        this.name = name;
        System.out.println("enter your address ");
        this.address = address;
    }
    public int getCustomerid() {
        if (customerid>0){
            return customerid;
        }
        else {
            return customerid*-1;
        }
    }
    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
