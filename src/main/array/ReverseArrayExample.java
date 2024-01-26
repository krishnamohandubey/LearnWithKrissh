package main.array;

import main.array.basic.Practice2;

import java.util.Scanner;

public class ReverseArrayExample {
    public static void main(String[] args) {
        Practice2 obj=new Practice2();
        Scanner sr=new Scanner(System.in);

        int N=sr.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sr.nextInt();
        }
//        ReverseArrayExample.usingFor(N,arr);
        ReverseArrayExample.usingHalfDivideMethod(N,arr);
    }

    public static void usingWhile(int N,int arr[]){
        // write the code to reverse array
        // using while loop

        int i=0; //start i from begining
        int j=N-1; // start j from end
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }

        for(int val:arr)
            System.out.print(val+" ");


    }

    public static void usingFor(int N, int arr[]){
        // using for loop
        for(int i=0,j=N-1; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }

        for(int val:arr)
            System.out.print(val+" ");
    }

    public static void usingHalfDivideMethod(int N,int arr[]){
        for(int i=0;i<N/2; ++i){
            int temp =arr[i];
            arr[i]= arr[N-1-i];
            arr[N-1-i] = arr[i];
        }

        for(int val:arr)
            System.out.print(val+" ");
    }
}
