package main.loop.forLoop;

// entered no is power of 2

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo obj=new PowerOfTwo();
        Scanner sr=new Scanner(System.in);
        int N =sr.nextInt();
//        System.out.println(obj.isPowerOfTwo(N));
        System.out.println(obj.isPowerOfTwoAnotherWay(N));

    }

    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n == 0 || n%2 != 0) return false;
        return isPowerOfTwo(n/2);

    }

    public boolean isPowerOfTwoAnotherWay(int N){
        while(N%2 == 0)
            N /= 2;
        boolean ans = (N ==1) ? true : false;
        return ans;
    }
}
