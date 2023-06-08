package builderpattern;

public class ExecutingECommApplication {

    public static void main(String[] args) {

        EcommerceApplication eca = new EcommerceApplication();
        eca.doLogin("Jason@gmail.com", "test@1234")
                .doSearch("MacBook")
                .doPayment("2434 4545 5657 78667", "345")
                .generateOrderId()
                .logout();

        EcommerceApplication eca1 = new EcommerceApplication();
        eca1.doLogin()
                .doSearch("MacBook", 5000)
                .doAddToCart("MacBook")
                .doSearch("IPhone")
                .doAddToCart("IPhone")
                .doPayment("asd@hdfc")
                .generateOrderId()
                .logout();

        EcommerceApplication eca2 = new EcommerceApplication();
        eca2.doLogin().generateOrderId().logout();

        EcommerceApplication eca4 = new EcommerceApplication();
        eca4.doLogin().logout();
    }
}
