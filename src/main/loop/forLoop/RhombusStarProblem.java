package main.loop.forLoop;

import java.util.Scanner;

public class RhombusStarProblem {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int N=sr.nextInt();

        //N rows
        for(int row=1; row<=N; ++row){
            // print space
            for(int sp=1; sp<=(row-1); sp++)
                System.out.print(" ");
            // print N star
            for(int st=1;st<=N; ++st)
                System.out.print("*");
            System.out.println("");
        }

    }
}
