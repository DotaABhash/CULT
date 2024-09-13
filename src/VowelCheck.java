import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        String word;
        int vowelCounter=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check the vowels");
        word = sc.nextLine();

        for(int i=0;i<word.length();i++){
                String vowel = String.valueOf(word.charAt(i));


            if(vowel.equalsIgnoreCase("a")||vowel.equalsIgnoreCase("e")||vowel.equalsIgnoreCase("i")||vowel.equalsIgnoreCase("o")||vowel.equalsIgnoreCase("u")){
                vowelCounter++;
                System.out.println(vowel);
            }

        }
        System.out.println("...................................................................................");
        System.out.println("The number of vowels detected:");
        System.out.println(vowelCounter);
        sc.close();
    }
}
