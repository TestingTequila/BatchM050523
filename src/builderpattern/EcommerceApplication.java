package builderpattern;

public class EcommerceApplication {

    // Use of this keyword
    //1. Inside setter method
    //2. Within Constructors
    //3. Builder Pattern

    public EcommerceApplication doLogin() {
        System.out.println("Login to App");
        return this;
    }

    public EcommerceApplication doLogin(String un, String pwd) {
        System.out.println(" Login to app : " + un + "" + pwd);
        return this;
    }

    public EcommerceApplication doSearch(String product) {
        System.out.println(" Product Searches is : " + product);
        return this;
    }

    public EcommerceApplication doSearch(String product, int price) {
        System.out.println(" Product Searched is : " + product + "Price is : " + price);
        return this;
    }

    public EcommerceApplication doSearch(String product, int price, String brand) {
        System.out.println(" Product Searched is : " + product + "Price is : " + price + " Brand: " + brand);
        return this;
    }

    public EcommerceApplication doAddToCart(String productName) {
        System.out.println(" Add to cart : " + productName);
        return this;
    }

    public EcommerceApplication doPayment(String paypalId, String password) {
        System.out.println("Make payment using : " + paypalId + " password :" + password);
        return this;
    }

    public EcommerceApplication doPayment(String upi) {
        System.out.println("Make payment using :" + upi);
        return this;
    }

    public EcommerceApplication doPayment(String cc, int cvv) {
        System.out.println("Make payment using :" + cc + " and CVV is : " + cvv);
        return this;
    }


    public EcommerceApplication generateOrderId() {
        System.out.println("1243432");
        return this;
    }

    public EcommerceApplication logout() {
        System.out.println(" Logout from the e-comm application");
        return this;
    }


}
