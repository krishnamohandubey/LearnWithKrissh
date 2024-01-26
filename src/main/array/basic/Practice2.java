package main.array.basic;
// Find the smallest and the second-smallest element in a given array

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Practice2 obj=new Practice2();
        Scanner sr=new Scanner(System.in);

        int N=sr.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sr.nextInt();
        }

        int min_value=obj.smallestNo(N,arr);
        //System.out.println(min_value);

        int second_min =obj.SecondMinNo(N,arr,min_value);
        //System.out.println(second_min);
        obj.minAndSecondMinNo(N,arr);
        sr.close();
    }

    public int smallestNo(int N, int[] arr){

        int min_so_far = arr[0];
        for (int i=0; i<N;++i){
           if(arr[i] < min_so_far)
               min_so_far=arr[i];
        }
        return min_so_far;
    }

    public int SecondMinNo(int N, int[] arr, int min_value){
        int sec_min = Integer.MAX_VALUE;
        for (int i=0; i<N;++i){
            if(arr[i] == min_value)
                continue;
            if(arr[i]< sec_min)
                sec_min=arr[i];
        }
        return sec_min;
    }

    public void minAndSecondMinNo(int N, int[] arr){
        int min_element = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;
        for (int i=0; i<N;++i){
           if(arr[i] < min_element){
               sec_min = min_element;
               min_element = arr[i];
           }else if(arr[i] != min_element && arr[i] < sec_min){
               sec_min = arr[i];
           }

        }
        System.out.println("Min No "+min_element);
        System.out.println("Second Min No "+sec_min);
    }
}
