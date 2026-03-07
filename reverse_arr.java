import java.util.*;

public class reverseArray(int [] arr){
  int i =arr[0];
  int j = arr.length
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = arr[temp];
  i++;
  j--;
  
}

public static void main(String []args){
  int [] ar1= {5,6,7,1,3,4,8};

  for (int i=0; i <ar1.length; i++){
    System.out.print(ar1[i]);
  }
  reverseArray(ar1);

  System.out.println();
  
  for (int i=0; i <ar1.length; i++){
    System.out.print(ar1[i]);
  }
}
