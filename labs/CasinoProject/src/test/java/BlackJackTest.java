import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by latashawatson on 1/30/17.
 */
public class BlackJackTest {

    BlackJack blackjack;
    @Before
    public void setup(){
        blackjack = new BlackJack();
    }

    @Test
    public void checkPlayerBustTestTrue(){
        Boolean expected = true;
        blackjack.total = 25;
        Boolean actual = blackjack.checkPlayerBust();
        Assert.assertEquals("A total value of 25 should cause the player to bust", expected,actual);
    }

    @Test
    public void checkPlayerBustTestFalse(){
        Boolean expected = false;
        blackjack.total = 7;
        Boolean actual = blackjack.checkPlayerBust();
        Assert.assertEquals("A total of 19 should not cause player to bust", expected, actual);

    }

    @Test
    public void checkDealerBustTestTrue(){
        Boolean expected = true;
        blackjack.total = 25;
        Boolean actual = blackjack.checkDealerBust();
        Assert.assertEquals("A total value of 25 should cause the player to bust", expected,actual);
    }

    @Test
    public void checkDealerBustTestFalse(){
        Boolean expected = false;
        blackjack.total = 8;
        Boolean actual = blackjack.checkDealerBust();
        Assert.assertEquals("A total of 19 should not cause player to bust", expected, actual);

    }

    /*@Test
    public void stayResultsTrue() {
        Boolean expected = true;
        blackjack.total = 25;
        Boolean actual = blackjack.stayResults();
        Assert.assertEquals("A total value of 25 should ", expected, actual);
    }*/
    @Test
    public void stayResultsTrue(){
        Boolean expected = true;


    }

    @Test
    public void stayResultsFalse(){

    }
}
