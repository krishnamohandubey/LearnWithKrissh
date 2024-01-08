package main.loop.forLoop;

import java.util.Scanner;

/* Greatest common factor of given two number A, B
eg. A = 36, B=42
*/
public class GCFofNumber {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int A =sr.nextInt();
        int B = sr.nextInt();

        GCFofNumber obj=new GCFofNumber();
        obj.findGCFusingFor(A,B);

        System.out.println("Greatest Factor is "+gcd(A,B));

    }

    public void findGCFusingFor(int A, int B){
        if(B%A != 0){
            for(int i=A; i>=1; i--){
                if(A%i == 0 && B%i == 0){
                    System.out.println("Factor is "+i);
                    break;
                }
            }
        }
    }

    public static int gcd(int a, int b){
        int result =Math.min(a,b);
        while (result > 0 ){
            if(a %result == 0 && b%result == 0){
                break;
            }
            result--;
        }
        return result;
    }
}
