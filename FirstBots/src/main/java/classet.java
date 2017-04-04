import java.util.HashMap;

/**
 * Created by latashawatson on 3/7/17.
 */
public class classet {
    public void test(){
        HashMap<Integer,Object> map = new HashMap();
        map.put(1, null);
        System.out.println(map.get(1));

    }

    public static void main(String[] args) {
        classet classet = new classet();
        classet.test();
    }
}
