/*
 * Natural numbers
 * even or odd numbers
 * Factors count , factors
 * prime number 
 */

import java.util.Scanner;

class Fundamentals{
    public static void main(String[] args) {
        // System.out.println("Venkatesh");

        //1. Natural numbers 1,2,3,4,5,6,......
        // problem n = 12,13 print natural numbers up to that number

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 

        // System.out.println(n);
        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);

        // repeating purpose 
        /*
         * for(intilization,condition,incrementation){
         *  //code
         * }
         */
        // comments

        //  for (int i = 1;i <= n; i++)
        //  {
        //     System.out.print(i+"\n");
        //     // /t - 4spaces  
        //  }

        // Whole Numbers
        
        // for (int i = 0;i <= n; i++)
        //  {
        //     System.out.print(i+"\t");
        //     // /t - 4spaces  
        //  }

        
        // 10 even - > reason  2)10(5 rem= 0
        // % is used to check the remainder 

        // if(n % 2  == 0 ){
        //     System.out.println("Even Number");
        // } else {
        //     System.out.println("Not a even number");
        // }
        // n = 9

        // if(n % 3 == 0) {
        //     System.out.println("it is multiple of 3");
        // } else {
        //     System.out.println("Not a multiple");
        // }

        // if(n % 2 == 0){
        //     System.out.println("even");
        // }else {
        //     System.out.println("odd");
        // }

        // % to check the remainder 

        // 9  2)9(4 8 rema = 1 

        // odd number 
        // 19 /5  == 1  --> Math rule
        // if(n%2 == 1){
        //     System.out.println("");
        // }
        // if(n %2 != 0)

        // 1. Home work question n = 100 even ,odd numbers

        
        
        // Factors 
        // 6 - > 1,2,3,6 - > 4 factors 
        // Number input count  

        //2. Home work --> take a number print the factors of number 

        // why for loop ?

        // n= 6
        // int count = 0;
        // for (int i =1 ; i <= n; i++)
        // {
        //     // 1,2,3,4,5,6
        //     // n/6
        //     // condtion check 
        //     if(n % i == 0){
        //         count++;
        //     }
        // }
        // System.out.println("Number of factors "+count);
        // // 10 -> 1,2,5,10
        // 9 - > 1,3,9

        // Home work
        // 10 ,  1,2,5,10 // 6-> 1,2,4,6

        // Prime numbers
        // N ->input N check whether it is prime number or not
        // prime number ->(1,N) factors = 2

        // 17 
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            if(n % i == 0){
                count++;
            }
        }

        if(count == 2){
            System.out.println("It is a prime ");
        }
        else {
            System.out.println("It is a not a prime number");
        }
        // 3. N= 30 2,3,5,7,11,13,17,19,23,29
        

       

    }
}