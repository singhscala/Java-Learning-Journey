package cdac.coreJava.day8.Assignment;

interface Payment{
    void makePayment(double amount);
}

class CreditCardPayment implements Payment{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of "+amount+" made using Credit Card");
    }
}

class UPIPayment implements Payment{

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of "+amount+" made using UPI");
    }
}

public class Bank {
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment();
        c.makePayment(1000);
        UPIPayment u = new UPIPayment();
        u.makePayment(1000);
    }
}
