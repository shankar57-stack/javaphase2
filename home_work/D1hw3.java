class BillSystem{
    int productId;
    String productName;
    double price;
    int quantity;
    double producttotal;
    void setDetails(int id, String name, double p, int q){
        productId = id;
        productName = name;
        price = p;
        quantity = q;
    }
    void Producttotal( int quantity, double price){
        
         producttotal= price * quantity;
         System.out.println("Product ID: " + productId + ", Product Name: " + productName + ", Quantity: " + quantity + ", Price: " + price + ", Total: " + producttotal);
       
    }
    void ApplyDiscount(int quantity, double price,double producttotal){
        
        if(producttotal > 1000){
            double discount = producttotal * 0.10;
            double finalAmount = producttotal - discount;
            System.out.println("Product ID: " + productId + ", Product Name: " + productName + ", Quantity: " + quantity + ", Price: " + price + ", Total: " + producttotal + ", Discount: " + discount + ", Final Amount after Discount: " + finalAmount);
        } 
        
    }
    void GST(int quantity, double price,double producttotal){
        double gst = producttotal * 0.18;
        double finalAmountWithGST = producttotal + gst;
        System.out.println("Product ID: " + productId + ", Product Name: " + productName + ", Quantity: " + quantity + ", Price: " + price + ", Total: " + producttotal + ", GST: " + gst + ", Final Amount with GST: " + finalAmountWithGST);
    }
    void totalBill(int quantity, double price,double producttotal){
        Producttotal(quantity, price);
        ApplyDiscount(quantity, price, producttotal);
        GST(quantity, price, producttotal);
    }
    void displayBill(int quantity, double price,double producttotal){
        Producttotal(quantity, price);
        ApplyDiscount(quantity, price, producttotal);
        GST(quantity, price, producttotal);
    }
}


public class D1hw3 {
    public static void main(String[] args) {
        
        BillSystem bill1 = new BillSystem();
        bill1.setDetails(101, "Laptop", 800.0, 2);
        bill1.Producttotal(bill1.quantity, bill1.price);
        bill1.totalBill(bill1.quantity, bill1.price, bill1.producttotal);
        bill1.displayBill(bill1.quantity, bill1.price, bill1.producttotal);

        BillSystem bill2 = new BillSystem();
        bill2.setDetails(102, "Smartphone", 500.0, 3);
        bill2.Producttotal(bill2.quantity, bill2.price);
        bill2.totalBill(bill2.quantity, bill2.price, bill2.producttotal);
        bill2.displayBill(bill2.quantity, bill2.price, bill2.producttotal);

        BillSystem bill3 = new BillSystem();
        bill3.setDetails(103, "Headphones", 150.0, 5);
        bill3.Producttotal(bill3.quantity, bill3.price);
        bill3.totalBill(bill3.quantity, bill3.price,bill3.producttotal);
        bill3.displayBill(bill3.quantity, bill3.price,bill3.producttotal);
     
    }
}