package main.loop.forLoop;

import java.util.Scanner;

// check if the number is prime number
public class Practice3 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int N = sr.nextInt();

        boolean isPrime = true;
        for(int i=2; i< N-1; ++i){
            if(N %i ==0 ){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Number is Prime no :: "+N);

    }
}
