package main.loop.forLoop;

import java.util.Scanner;

public class DiamondStarProblem {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int N=sr.nextInt();

        int num_stars=1;
        //N rows to be printed
        for(int row=1; row<=N; ++row){

            //print num_stars number of star
            for(int st=1; st<=num_stars; st++)
                System.out.print("*");

            System.out.println("");
            //increment num_stars by 2
            num_stars+=2;
        }
        sr.close();
    }
}
