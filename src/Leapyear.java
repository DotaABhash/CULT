

import java.util.Scanner;
class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = sc.nextInt();

        int a = year%4;
        int b = year%100;
        int c=year%400;

        if((a==0)&& (b!=0 || c==0)){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}