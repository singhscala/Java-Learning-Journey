package cdac.coreJava.DataStructure.Searching;

public class BinarySearch {

    void binarySearch(int value, int[] arr){
        int min=0;
        int max = arr.length-1;
        int mid;
        boolean flag = false;

        while(min<=max){
            mid=(min+max)/2;
            if(arr[mid]==value){
                System.out.println(arr[mid]+" found at index: "+(mid+1));
                flag = true;
                break;
            }
            else if(arr[mid]>value)
                max = mid-1;
            else
                min = mid+1;
        }
        if(!flag)
            System.out.println("Not found");
    }

    int binarySearchRecursive(int value, int[] arr, int mid, int min, int max){
        if(min>=max)
            return -1;
        mid = (min+max)/2;
        if(arr[mid]==value)
            return mid;
        else if(arr[mid]>value)
            return binarySearchRecursive(value, arr, mid, min, mid-1);
        else{
            return binarySearchRecursive(value, arr, mid, mid+1, max);
        }
    }
}
