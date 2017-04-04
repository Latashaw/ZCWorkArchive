import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by latashawatson on 3/26/17.
 */
public class test {
//
//    public void evenOdd(String s) {
//        char[] numbers = s.toCharArray();
//        ArrayList<Integer> nums = new ArrayList();
//        for(int i = 0; i < numbers.length; i++) {
//            nums.add(Character.getNumericValue(i));
//        }
//        boolean isFirst;
//    int prevNum = 0;
//        for(int i = 0; i < nums.size(); i++) {
//            if(i == 0){
//                isFirst = true;
//            }
//            if(nums.get(i) % 2 == 0) {
//                if(!isFirst) {
//
//                }
//            }
//        }
//
//
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String s = "127403648";
//        test est= new test();
//        est.evenOdd(s);
//    }
//}
//



    public String adjacentDigits(String s) {
        StringBuilder result = new StringBuilder(); // store result here

        int prevDigit = -1; // temporary value
        for(String str : s.split("")) { // iterate through each digit
            int curDigit  = Integer.parseInt(str); // convert digit to integer
            boolean isFirstDigit = prevDigit == -1; // check if this is the first digit

            if(isFirstDigit) { // if this is the first digit
                prevDigit = curDigit;
                continue; // skip; nothing to evaluate
            }


            if(!isZero(curDigit)) { // if current digit is not zero
                if(!isZero(prevDigit)) { // if prev digit is not zero
                    if(isEven(curDigit) && isEven(prevDigit)) { // if both even
                        result.append("*"); // put '*' between digits
                    }

                    if(isOdd(curDigit) && isOdd(prevDigit)) { // if both odd
                        result.append("-"); // put '-' between digits
                    }
                }
            }
            result.append(curDigit);
        }
        return result.toString();
    }

    public boolean isZero(int val) {
        return val == 0;
    }

    public boolean isEven(int val) {
        return val % 2 == 0;
    }

    public boolean isOdd(int val) {
        return !isEven(val);
    }


}