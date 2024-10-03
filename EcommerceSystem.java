import javax.swing.JOptionPane;
import java.util.*;
public class EcommerceSystem {
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);

    JOptionPane.showMessageDialog(null,"Welcome to Ecommerce System ");
    int id=Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Enter your ID")));
    String name=JOptionPane.showInputDialog("Enter your Name");
    String addres=JOptionPane.showInputDialog("Enter your addres");
    int nproduct=Math.abs(Integer.parseInt(JOptionPane.showInputDialog("How many products would you like to add?")));
    
    ElectronicProduct e = new ElectronicProduct("Samsung", 1, 1, "smartphone", 599.9);
    ClothingProduct c = new ClothingProduct("Cotton", "Medium", 2, "T-shirt", 19.99);
    BookProduct p = new BookProduct(3, "OOP", 39.99, "X Publications", "O’ReillyO’Reilly");
    Customer f = new Customer();
    Cart j = new Cart();
Order O = new Order();
    O.setCustomerid(id);
    f.setName(name);
    f.setAddress(addres);

    j.setNproduct(nproduct);
    product product1=new product(1,"smart phone",599.9);
    product product2=new product(2,"T-shirt",19.99);
    product product3=new product(3,"OOP", 39.99);
    
for (int k =0 ; k<j.getNproduct();k++){
    int i=Math.abs(Integer.parseInt(JOptionPane.showInputDialog("which product would you like to add? 1-smart phone 2- T-shirt 3- OOP")));
    if (i<0||i>3){
        System.out.println(" Warrning :you intered an invalid product item!!");
        break;
    }
        System.out.println("you intered an invalid product_item");
     switch (i){
         case 1:
             j.addproduct(product1);
             break;
             case 2:
                 j.addproduct(product2);
        break;
         case 3:
             j.addproduct(product3);
             break;
     }
}
O.setProducts(j.getProducts());
O.calculateTotalPrice();
    JOptionPane.showMessageDialog(null,"your Total price is "+O.calculateTotalPrice()+"would you like to place order? 1-yes 2-no");
   int l=Integer.parseInt(JOptionPane.showInputDialog("Enter your answer"));
   O.printorder();
}
}
