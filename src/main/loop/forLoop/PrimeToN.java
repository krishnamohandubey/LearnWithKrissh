package main.loop.forLoop;

import java.util.Scanner;

// question - print a prime no to N
public class PrimeToN {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int N=sr.nextInt();

        PrimeToN obj=new PrimeToN();
        obj.isPrime(N);

    }

    public void isPrime(int N){
        for(int num=1;num<=N;++num){
            //checck if the num is prime
            boolean isPrime = true;
            for(int i=2; i<num; i++){
                if(num % i == 0)
                    isPrime= false;
                break;
            }
            if(isPrime)
                System.out.println("Prime No "+num);
        }
    }
}
