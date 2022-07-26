package recur;

import java.util.Scanner;

public class recursion {
    /*static int fact (int num)
    {
        if(num==0){
            return 1;
        }
        else if (num==1) {
            return 1;
        }
        else
            return num*fact(num-1);

    }
    public static void main(String[] args){
        System.out.print("Enter a number ");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int a;
        a=fact(number);
        System.out.println("The factorial of the number is "+a);

     */


    //FIBONACCI SEQUENCE
    /*static int fibo(int n){
        if(n<=0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        System.out.print("Enter the limit of the series ");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        System.out.println("The Fibonacci Series gets printed this way ");
        for(int i=0;i<number;i++)
        {
            System.out.println(fibo(i));
        }

     */


    //Exponent and Base
    static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        else if (b==1) {
            return a ;
        }
        else
            return a*pow(a,b-1);
    }
    public static void main(String[] args){
        System.out.print("Enter the base ");
        Scanner scanner=new Scanner(System.in);
        int base=scanner.nextInt();
        System.out.print("Enter the Exponent ");
        Scanner scanner1=new Scanner(System.in);
        int exponent=scanner1.nextInt();
        System.out.println("The answer is "+pow(base,exponent));


    }

}
