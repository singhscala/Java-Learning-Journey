package cdac.coreJava.day9.Assignment;

abstract class Person{
    abstract void getData();
    void info(){}
}

interface Password{
    int password = 123;
    void displayData();
}

class Employee extends Person implements Password{
    String name;
    int deptNo;
    int code;

    @Override
    public void displayData() {
        System.out.println("Name: "+name);
        System.out.println("Department No: "+deptNo);
        System.out.println("Code: "+code);
    }

    @Override
    void getData() {
        System.out.println("Password is: "+password);
    }
}

final public class MainClass {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayData();
        e.getData();
    }
}
