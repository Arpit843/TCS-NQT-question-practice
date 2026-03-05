class Solutions{
  public static int Array( int[] arr){
    Arrays.sort(arr);
    return arr[0];
  }
}

public class main{
  public static void main(String [] args){
    int[] arr1={5,6,2,1,3,0};
    System.out.print("smallest element is ",Solutions.Array(arr1));
}

}
