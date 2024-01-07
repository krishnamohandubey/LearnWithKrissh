package loop.forLoop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int n=sr.nextInt();
        sumOfDigitsSolution obj=new sumOfDigitsSolution();
        int sum=obj.sum(n);
        System.out.println("Sum is "+sum);
    }
}

class sumOfDigitsSolution{
    public int sum(int n){
        int sum=0;
        for(int i=n;n>0;n/=10){
            int lastDigit=n%10;
            sum+=lastDigit;
        }
        return sum;
    }
}
