import java.util.*;
import java.text.*;
/**
 * Created by latashawatson on 3/22/17.
 */
public class GivenDoubleProvideCurrencyFormatting {

    public static void main(String[] args) {
            //Scanner scanner = new Scanner(System.in);
            double payment = 87.00;
            //scanner.close();

            // Write your code here.
            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
            String us = nf.format(payment);
            NumberFormat numF = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
            String india = numF.format(payment);
            NumberFormat nF = NumberFormat.getCurrencyInstance(Locale.CHINA);
            String china = nF.format(payment);
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String france = numberFormat.format(payment);
            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }


