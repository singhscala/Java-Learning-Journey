package cdac.coreJava.day8.Assignment;

abstract class Vehicle{
    String name;
    abstract void speed();
    void display(){
        System.out.println("asjhgcvjdsuh");
    }
}

public class Car extends Vehicle{

    @Override
    void speed() {
        System.out.println("100km/hr");
    }

    void setName(){
        this.name = "SUV";
    }

    String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.setName();
        c.speed();
        c.display();
        System.out.println(c.getName());


    }
}
