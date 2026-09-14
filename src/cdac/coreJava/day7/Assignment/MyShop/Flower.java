package cdac.coreJava.day7.Assignment.MyShop;

public class Flower {
    String name;
    int petals;
    int price;
    int piece;
    int total_price;

    public Flower() {
        this.name = "Rose";
        this.petals = 20;
        this.price = 200;
        this.piece = 10;
        this.total_price = 2000;
    }

    public Flower(String name, int petals, int price, int piece, int total_price){
        this.name = name;
        this.petals = petals;
        this.price = price;
        this.piece = piece;
        this.total_price = total_price;
    }

    public int calculateDiscount(){
        if(total_price>2000){
            return 200;
        }
        return 100;
    }

    public void display(int discount){
        System.out.println("Flower Name: "+name+"\nNo. of petals: "+petals+"\nPrice: "
                +price+"\nTotal piece: "+piece+"\nTotal Price: "+total_price+"\nAfter Discount: "+discount);
    }
}
