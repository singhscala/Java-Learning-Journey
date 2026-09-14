package cdac.coreJava.DataStructure.Stack;

public class StackArrayString {
    int max;
    Character[] arr;
    int top;

    StackArrayString(){
        max = 10;
        arr = new Character[max];
        top = -1;
    }

    StackArrayString(int max){
        this.max = max;
        arr = new Character[max];
        top = -1;
    }

    boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }

    boolean isFull(){
        if(top == max-1)
            return true;
        return false;
    }

    void push(char value){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            arr[++top] = value;
        }
    }

    char pop(){
        if(isEmpty()){
            return '\0';
        }else{
            return arr[top--];
        }
    }

    char peek(){
        if(isEmpty()){
            return '\0';
        }else{
            return arr[top];
        }
    }

    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for(int i=top; i>=0; i--){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StackArray sa = new StackArray();
//        sa.isEmpty();
//        sa.isFull();
//        System.out.println("Enter the total element you want to enter: ");
//        int t = sc.nextInt();
//        for (int i =0; i<t; i++){
//            System.out.println("Enter the +"+(i+1)+" element");
//            int value = sc.nextInt();
//            sa.push(value);
//        }
//        sa.display();
//        System.out.println(sa.pop());
//        System.out.println(sa.peek());
//        System.out.println(sa.pop());
//        System.out.println(sa.pop());
//    }
}
