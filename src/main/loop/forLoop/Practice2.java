package main.loop.forLoop;

import java.util.Scanner;

/*
Prob - First 10 natural number whose sum is 6,
       Hunt those number having digit sum = k
Eg - N=10, K=6
Ans - 6,15,24,33,42,51,60,105,114,123
*/
public class Practice2 {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        int target_count = sr.nextInt();
        int target_sum = sr.nextInt();

        int cur_num=1,count=0;
        while(count < target_count){
            int cur_sum=0;
            for(int num=cur_num; num>0; num/=10){
                cur_sum += (num%10);
            }
            if(cur_sum == target_sum){
                System.out.println(cur_num);
                count++;
            }
            cur_num++;
        }
    }


}
