/**
 * Created by latashawatson on 1/27/17.
 */
public class Triangle {

    public void figure(char x, char y) {    //Figure2
        System.out.print(x);
        System.out.print(x);
        System.out.print(x);
        System.out.print(x);
        System.out.print(x);
            System.out.print(y);
        System.out.print(x);
        System.out.print(x);
        System.out.print(x);
        System.out.print(x);
            System.out.print(y);
        System.out.print(x);
        System.out.print(x);
        System.out.print(x);
            System.out.print(y);
        System.out.print(x);
        System.out.print(x);
            System.out.print(y);
        System.out.print(x);

    }

    public void figure2(char x, char y) {
        for (int j = 5; j > 0; j--) {
            for (int i = 0; i <j; i++) {
                System.out.print(x);
            }
            System.out.print(y);
        }

    }

    public void figure3() {
        for (int j = 5; j > 0; j--) {
            for (int i = 0; i <j; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public void figure4() {
        int count = 5;
        while (count > 0) {
            int nextCount = 0;
            while(nextCount<count){
                System.out.print("*");
                nextCount++;
            }
            System.out.print("\n");
            count--;
        }

    }

public String recursion(Integer amountOfFood, String message){
        if(amountOfFood<= 0){
            return message + "all done";
        }
        amountOfFood--;
        message += "Num Num\n";
        return recursion(amountOfFood, message);
}
    public void figure5a(){
        int count = 5;
        if(count>=0){
            System.out.print("\n");
            count--;
        }
    }

    public void figure5b() {
        int nextCount = 1;
        if (nextCount <= 5) {
            System.out.print("*");
            nextCount++;
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.print("*****\n****\n***\n**\n*");    //Figure1
        System.out.print('\n');
        triangle.figure('*', '\n');
        System.out.print('\n');
        triangle.figure2('*', '\n');
        System.out.print('\n');
        triangle.figure3();
        System.out.print('\n');
        triangle.figure4();
        System.out.print('\n');
        triangle.recursion();




    }
}
