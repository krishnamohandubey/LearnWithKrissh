package main.array.basic;

import java.util.Arrays;
import java.util.Scanner;

//Given a number & an array , check if the given number is present in the array or not
public class Practice1 {
    public static void main(String[] args) {
      Scanner sr=new Scanner(System.in);
      int N = sr.nextInt();

      int arr[]=new int[N];

      for(int i=0; i<N; ++i){
          arr[i] = sr.nextInt();
      }
      int targert_num = sr.nextInt();

      boolean ans=false;
      for(int value:arr){
          if(value==targert_num){
              ans=true;
              break;

          }

      }
        System.out.println("ANS is "+ans);
    }
}
