
import java.util.Arrays;

class Solutions{
    public static int sortarr(int []arr){
        Arrays.sort(arr);
        return arr[arr.length -1];
    }
}
public static void main (String []args){
    int [] arr1 ={5,6,2,1,3,0};
    int [] arr2 ={5,6,2,8,9};

    System.out.println("largest num is "+ Solutions.sortarr(arr1));
    System.out.println("largest num is "+ Solutions.sortarr(arr2));
}
