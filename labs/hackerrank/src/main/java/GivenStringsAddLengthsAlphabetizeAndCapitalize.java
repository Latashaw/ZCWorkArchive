import java.util.Scanner;

/**
 * Created by latashawatson on 3/22/17.
 */
public class GivenStringsAddLengthsAlphabetizeAndCapitalize {

    public static void main(String[] args) {

        //Scanner sc=new Scanner(System.in);
        String A = "hello";
        String B = "world";
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        char Cap1 = A.charAt(0);
        String cap1 = "" + Cap1;
        char Cap2 = B.charAt(0);
        String cap2 = "" + Cap2;
        String capA = cap1.toUpperCase() + A.substring(1);
        String capB = cap2.toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);
    }
}
