package Go;

import java.security.Principal;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        /*System.out.println("Hello World");
        Scanner scanner3=new Scanner(System.in);
        String name=scanner3.nextLine();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the principal ");
        int Principal=scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.print("Enter the ROI ");
        float ROI=scanner1.nextFloat();
        Scanner scanner2=new Scanner(System.in);
        System.out.print("Enter the Time Period ");
        int Time_Period=scanner2.nextInt();
        float simpl;
        simpl=(Principal*ROI*Time_Period)/100;
        System.out.println("The simple interest is "+simpl);
         */
        System.out.print("Enter a number ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number % 5 ==0 && number % 3==0){
            System.out.println("Fizz"+"Buzz");
        }
        else if(number % 3==0){
            System.out.println("Fizz");
        }
        else if (number % 5==0) {
            System.out.println("Buzz");
        }
        else
            System.out.println(number);


    }
}
