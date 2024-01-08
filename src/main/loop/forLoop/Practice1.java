package main.loop.forLoop;

/*
Prob - Given a value of N , Print only those numbers from 1 to N that have sum of digits = K
Eg - N=30, K=9
Ans - 9 -> 9, 18->9 , 27 ->9
*/

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
       Scanner sr =new Scanner(System.in);
       int L=sr.nextInt();
       int K=sr.nextInt();

       //iterate value from L to R
       for(int N=1; N<=L; ++N){
           int sum=0;
           // calculate the sum of digits for N
           for(int num=N;num >0; num/=10){
               int lastDigit=num%10;
               sum += lastDigit;
           }
           if(sum == K)
                System.out.println(N +" ::: "+sum);
       }
    }
}
