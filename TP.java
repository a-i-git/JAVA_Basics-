package XYZ;

import java.util.Scanner;

public class TP {
    public static void main(String[] args){
        System.out.print("Enter a number ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int sum=0,rem=0;
        int m=0;
        m=number;
        while(number>0){
            rem=number%10;
            sum=sum+(rem*rem*rem);
            number=number/10;
        }
        if(m==sum){
            System.out.println(m+" is an Armstrong Number ");
        }
        else
            System.out.println(m+" is not an Armstrong Number ");
    }
}
