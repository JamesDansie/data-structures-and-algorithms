package code401challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    Hashtable test;
    @Before
    public void setUp() throws Exception {
        test = new Hashtable();
        test.add("key1", "value1");
        test.add("key2", "value2");
        test.add("key3", "value3");
    }

    @Test
    public void hash() {
        assertEquals("cat should has to 2",
                test.hash("cat"),
                2);
    }

    @Test
    public void add() {
        assertEquals("Happy test",
                test.toString(),
                "Hashtable{values=[[Storage{key='key3', value='value3'}], null, null, null, null, null, null, null, [Storage{key='key1', value='value1'}], [Storage{key='key2', value='value2'}]]}");
    }

    @Test
    public void addBool(){
        assertTrue(test.add("potato", "banana"));
    }

    @Test
    public void get() {
        assertEquals("first key should have value1",
                test.get("key1"),
                "value1");
    }

    @Test
    public void contains() {
        assertTrue(test.contains("key1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDup(){
        test.add("key1","value1");
    }

    @Test
    public void addLots(){
        test.add("key4", "value4");
        test.add("key5", "value5");
        test.add("key6", "value6");
        test.add("key7", "value7");
        test.add("key8", "value8");
        test.add("key9", "value9");
        test.add("key10", "value10");
        test.add("key11", "value11");
        assertEquals("big list of stuff",
                test.toString(),
                "Hashtable{values=[[Storage{key='key3', value='value3'}], [Storage{key='key4', value='value4'}], [Storage{key='key5', value='value5'}], [Storage{key='key6', value='value6'}], [Storage{key='key7', value='value7'}], [Storage{key='key8', value='value8'}], [Storage{key='key9', value='value9'}, Storage{key='key10', value='value10'}], [Storage{key='key11', value='value11'}], [Storage{key='key1', value='value1'}], [Storage{key='key2', value='value2'}]]}");
    }
}