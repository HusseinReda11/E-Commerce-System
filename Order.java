import javax.swing.*;
public class Order extends Cart {
    public int orderid = 0;
    private double totalprice;
public void printorder(){
        orderid++;
    JOptionPane.showMessageDialog(null,"Here is you order's summary:");
    JOptionPane.showMessageDialog(null,"Order ID: "+ orderid);
    JOptionPane.showMessageDialog(null,"Customer ID: "+ getCustomerid());
    JOptionPane.showMessageDialog(null,"Products: \n");
    for (product product : products) {

        JOptionPane.showMessageDialog(null,"- " + product.getName() + ": $" + product.getPrice());
    }
    JOptionPane.showMessageDialog(null,"Total Price: $" + calculateTotalPrice());
}

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (product product : products) {
                totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}


