import java.util.Arrays;

class Solutions{
  public static int Array( int[] arr){
    Arrays.sort(arr);
    return arr[0];
  }
}

public class Small_num{
  public static void main(String [] args){
    int[] arr1={5,6,2,1,3,0};
    System.out.println(Solutions.Array(arr1));
}

}
