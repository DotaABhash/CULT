import org.w3c.dom.ls.LSOutput;

public class Swap {

    public static void main(String[] args){
        int a =15;
        int b =8;

        System.out.println("The value of a before snap"+ a);
        System.out.println("The value of b before snap"+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The value of a after snap"+a);
        System.out.println("The value of b after snap"+b);

    }




}
