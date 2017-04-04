import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by latashawatson on 2/22/17.
 */
public class MyArrayListTest {
    MyArrayList mAL;

    @Before
    public void setup() {
        mAL = new MyArrayList(3);
        mAL.collection[0] = 1;
        mAL.collection[1] = "shnozzberries";
        mAL.collection[2] = 'F';
    }

    @Test
    public void clearTest() {
        int expected = 0;
        mAL.clear();
        int actual = mAL.collection.length;
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void isEmptyTest() {
        boolean expected = false;
        boolean actual = mAL.isEmpty();
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void sizeTest() {
        int expected = 3;
        int actual = mAL.size();
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void removeTest() {
        int expected = 2;
        mAL.remove(0);
        int actual = mAL.collection.length;
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void addTest() {
        int expected = 4;
        mAL.add("raisins");
        int actual = mAL.collection.length;
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void addWithIndexTest() {
        int expected = 3;
        int actual = mAL.collection.length;
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void setTest() {
        String expected = "tasha";
        mAL.set(0,expected);
        String actual = (String) mAL.collection[0];
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void containsTest() {
        boolean expected = true;
        boolean actual = mAL.contains("shnozzberries");
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void getTest() {
        String expected = "shnozzberries";
        String actual = (String) mAL.get(1);
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void addAllTest() {
    ArrayList<String> tackOn = new ArrayList<>(3);
    tackOn.add(0, "lyrically performed armed robbery");
    tackOn.add(1, "flee with the lottery");
    tackOn.add(2, "possibly they spotted me");
    int expected = 6;
    mAL.addAll(tackOn);
    int actual = mAL.collection.length;
        Assert.assertEquals("Values should be equal", expected, actual);
    }

}