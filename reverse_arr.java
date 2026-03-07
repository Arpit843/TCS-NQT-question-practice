import java.util.*;
class Solution{
    public void reverseArray(int [] arr){
        int i =0;
        int j = arr.length-1;
        while(i< j){
            
            int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i++;
              j--;
}}
}
public class Main{
    
    public static void main(String []args){
      int [] ar1= {5,6,7,1,3,4,8};
      Solution obj = new Solution();
    
      for (int i=0; i <ar1.length; i++){
        System.out.print(ar1[i]);
      }
      obj.reverseArray(ar1);
    
      System.out.println();
      
      for (int i=0; i <ar1.length; i++){
        System.out.print(ar1[i]);
      }
    }
}
