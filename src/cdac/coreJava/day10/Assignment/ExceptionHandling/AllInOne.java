package cdac.coreJava.day10.Assignment.ExceptionHandling;

class MyException extends Exception {
    String message;
    MyException(String msg) {
        message = msg;
    }
    public String getMessage() {
        return message;
    }
}

class ConstructorChaining {
    ConstructorChaining() {
        this(5);
        System.out.println("No-arg");
    }

    ConstructorChaining(int x) {
        this(x, 10);
        System.out.println("Single-arg");
    }

    ConstructorChaining(int x, int y) {
        System.out.println("Two-arg");
    }
}

interface Admission {
    void registration();
}

class Student {
    public void AddStudent() {
        class MtechStudent implements Admission {
            public void registration() {
                System.out.println("Local class");
            }
        }
        new MtechStudent().registration();

        Admission anonStudent = new Admission() {
            public void registration() {
                System.out.println("Anonymous class");
            }
        };
        anonStudent.registration();
    }
}

public class AllInOne {

    public static void checkNumbers(String[] args) {
        try {
            if (args.length < 3) return;

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            if (num1 <= 10) throw new MyException("Num1<10");
            if (num2 <= 10) throw new MyException("Num2<10");
            if (num3 <= 10) throw new MyException("Num3<10");

            System.out.println("Sum: " + (num1 + num2 + num3));

        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        checkNumbers(args);
        new ConstructorChaining();
        new Student().AddStudent();
    }
}