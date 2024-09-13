import java.util.Scanner;


public class OptimusPrimeNumber {
    public static void main(String[] args) {
        int count=0;
        // Asking user to input a number
        Scanner userGivenNumber = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = userGivenNumber.nextInt();

        if(number<=1){
            System.out.println("The number"+number+"is not a Prime Number");
        }

        for(int i=1;i<number/2;++i){
            System.out.println("enter");
            if (number%i==0){
                System.out.println("counted");
              count++;
            }
        }

        if (count>1){
            System.out.println("The number"+number+"is not a Prime Number");
        }
        else{
            System.out.println("The number"+number+"is a Prime Number");
        }

        userGivenNumber.close();

    }
}
