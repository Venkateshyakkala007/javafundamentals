

import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        // int n = sc.nextInt();

        // Revere of a number

        // // % remainder
        // System.out.println("the last digit of a number "+n%10);

        // // / quotient 
        // System.out.println("The quotient of a number "+n/10);

        // // Reverse of a number
        // int rev = 0;

        // while(n > 0){
        //     int last = n %10;
        //     rev = rev*10+last;
        //     n = n/10;
        // }

        // System.out.println("The reverse of number "+rev);

        // amstrong number

        int n = sc.nextInt(); // n number when we check count
        // int temp = n; // amstrong number repeat while temp = 0
        // int alpha = n; // we use for last to check condtion 

        // int count = 0;
        // while(n > 0){
        //     count++;// i dont need n%10 here means last digit
        //     n = n/10;
        // }


        // System.out.println(count);

        // // Amstrong number

        // int sum = 0;

        // while(temp>0){
        //     int last = temp%10;
        //     sum = sum+(int)Math.pow(last,count);
        //     temp=temp/10;
        // }
        

        // if(sum == alpha){
        //     System.out.println("amstrong number");
        // }else{
        //     System.out.println("It is not a amstrong number");
        // }



        int count2 = (int)Math.floor(Math.log10(n) + 1);

        System.out.println(count2);


    }
}
