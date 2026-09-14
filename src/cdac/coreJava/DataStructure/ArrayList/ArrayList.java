package cdac.coreJava.DataStructure.ArrayList;

import java.util.Scanner;

public class ArrayList {
    int max;
    int[] arr;
    int count;

    ArrayList(){
        max = 10;
        arr = new int[max];
        count = 0;
    }

    ArrayList(int max){
        this.max = max;
        arr = new int[max];
        count = 0;
    }

    int size(){
        return count;
    }

    int capacity(){
        return max;
    }

    void display(){
        System.out.print("[ ");
        for (int i=0; i<count; i++) {
            if (i != count - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.print(arr[i]);
        }
        System.out.println(" ]");
    }

    private void updateCapacity() {
        max = (int) (max*(1.5));
        int[] newArr = new int[max];
        for(int i = 0; i<count; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    void createList(int n){
        int l = count+n;
        while(l>max){
            updateCapacity();
        }
        Scanner sc = new Scanner(System.in);
        for(int i=count; i<l; i++){
            System.out.println("Enter the "+(i+1)+" value");
            arr[i] = sc.nextInt();
        }
        count += n;
    }

    void append(int value){
        if(count == max)
            updateCapacity();
        arr[count++] = value;
    }

    void insertAtPos(int pos, int value){
        if(pos>count || pos<0){
            System.out.println("Invalid position");
        }else{
            if(count == max){
                updateCapacity();
            }
            if(pos == count){
                append(value);
            }else{
                for (int i=count; i>pos-1; i--){
                    arr[i] = arr[i-1];
                }
                arr[pos-1] = value;
                count++;
            }
        }
    }

    void deleteAtPos(int pos){
        if(pos>count || pos<0){
            System.out.println("Invalid position");
        }else{
            if(pos == count){
                arr[pos-1] = 0;
            }else{
                for (int i=pos-1; i<count-1; i++){
                    arr[i] = arr[i+1];
                }
            }
            count--;
        }
    }

    void search(int value){
        boolean flag = false;
        for(int i=0; i<count; i++){
            if(arr[i] == value){
                flag = true;
                System.out.println(value+ " is Found at position: "+(i+1));
                break;
            }
        }
        if(!flag){
            System.out.println(value+" is not Found");
        }
    }

    void sort(){
        for (int i=0 ;i<count-1; i++){
            for (int j=0; j<count-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
