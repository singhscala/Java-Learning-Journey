package cdac.coreJava.DataStructure.Searching;

public class LinearSearch {

    void linearSearch(int value, int[] arr){
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                System.out.println(arr[i]+" found at index: "+(i+1));
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("Not found");
    }

    int linearSearchRecursive(int value, int index, int[] arr){
        if(index>=arr.length)
            return -1;
        if(arr[index]==value)
            return index+1;
        else{
             return linearSearchRecursive(value, index+1, arr);
        }
    }
}
