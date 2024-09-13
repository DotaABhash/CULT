import java.util.Scanner;

public class CompareSortAlphabet {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names you want to sort");
        n = sc.nextInt();
        String arr[] = new String[n];

        Scanner scc = new Scanner(System.in);

        System.out.println("Enter"+n + " names to add into Array");

        for(int i=0;i<n;i++){
            //System.out.println("Enter name to add into Array");
            arr[i]=scc.nextLine();
        }
        System.out.println("proceed ");
        String temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i].compareTo(arr[j])>0){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("out of loop");
        System.out.println("Sorted list Alphabetically");
        for(int i =0; i<n;i++){
            System.out.println(arr[i]);
        }

    }


}
