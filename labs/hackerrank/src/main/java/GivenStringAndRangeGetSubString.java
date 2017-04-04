import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by latashawatson on 3/28/17.
 */
public class GivenStringAndRangeGetSubString {

    public String findSubString(String s, int start, int end) {
        //find substring within inclusive range (end-1)
    String result = s.substring(3, 7);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String S = "HelloWorld";
        int start = 3;
        int end = 7;
        GivenStringAndRangeGetSubString g = new GivenStringAndRangeGetSubString();
        g.findSubString(S, start, end);
    }

}
