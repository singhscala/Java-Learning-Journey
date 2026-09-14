package cdac.coreJava.day9.Assignment;

class Order {
    private String name;
    private int number;
    private double quantity;
    private double cost;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double computePrice(){
        return quantity*cost;
    }
}

class ShippedOrder extends Order {
    private final double SHIPPING_CHARGE = 40.0;

    @Override
    public double computePrice() {
        return (getQuantity() * getCost()) + SHIPPING_CHARGE;
    }
}

public class UseOrder {
    public static void main(String[] args) {

        ShippedOrder order = new ShippedOrder();

        order.setName("Prachi");
        order.setNumber(101);
        order.setQuantity(5);
        order.setCost(200);

        System.out.println("Customer Name: " + order.getName());
        System.out.println("Customer Number: " + order.getNumber());
        System.out.println("Order Quantity: " + order.getQuantity());
        System.out.println("Unit Cost: " + order.getCost());

        System.out.println("Total Cost: " + order.computePrice());
    }
}
