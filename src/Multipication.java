import java.util.Scanner;

public class Multipication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();


        for(int j=1;j<=10;j++){
            System.out.println("Multipication of:"+ number);
            System.out.println(number+"*"+j+"="+number*j);
        }

    }

}