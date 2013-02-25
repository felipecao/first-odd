package com.amazon.stream.question;

import com.amazon.stream.provided.Stream;
import com.amazon.stream.provided.impl.DefaultStream;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 2/24/13
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class FirstOddPickerTest {
    private FirstOddPicker firstOddPicker;

    @Before
    public void setup(){
        firstOddPicker = new FirstOddPicker();
    }

    @Test
    public void nullStreamReturnsNull(){
        assertNull(firstOddPicker.identifyFirstOddFromStream(null));
    }

    @Test
    public void bIsTheFirstOdd(){
        Stream s = new DefaultStream("aAbBABac");
        Character c = firstOddPicker.identifyFirstOddFromStream(s);
        assertNotNull(c);
        assertEquals(Character.valueOf('b'), c);
    }

    @Test
    public void cIsTheFirstOdd(){
        Stream s = new DefaultStream("aaaaAAAAAAcBD");
        Character c = firstOddPicker.identifyFirstOddFromStream(s);
        assertNotNull(c);
        assertEquals(Character.valueOf('c'), c);
    }

    @Test
    public void cIsTheFirstOddInLastPosition(){
        Stream s = new DefaultStream("aaaaAAAAAAc");
        Character c = firstOddPicker.identifyFirstOddFromStream(s);
        assertNotNull(c);
        assertEquals(Character.valueOf('c'), c);
    }
}
