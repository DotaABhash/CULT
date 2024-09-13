import java.util.Scanner;
import java.util.HashMap;

public class UseOfHashmap {
    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease input a word to denote the frequency of character");
        word =sc.nextLine();

        HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();

        for(int i=0; i<word.length();i++){
            if(frequency.containsKey(word.charAt(i))){
                int n = frequency.get(word.charAt(i)) +1;
                frequency.put(word.charAt(i),n);
            } else {
                frequency.put(word.charAt(i),1);
            }
        }
        System.out.println(frequency);



    }
}
