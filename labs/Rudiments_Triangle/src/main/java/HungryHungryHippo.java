/**
 * Created by latashawatson on 1/27/17.
 */
//Example of recursion
public class HungryHungryHippo {

    public String eat(Integer amountOfFood) {
        return eat(amountOfFood, " ");
    }

    private String eat(Integer amountOfFood, String message) {
        if (amountOfFood <= 0) {
            return message + "All done";
        }
        amountOfFood--;
        message += "Nom nom\n";
        return eat(amountOfFood, message);
    }
    
    public static void main(String[] args) {
        HungryHungryHippo hungryHungryHippo = new HungryHungryHippo();
        String output = hungryHungryHippo.eat(10);
        System.out.println(output);
    }


}
