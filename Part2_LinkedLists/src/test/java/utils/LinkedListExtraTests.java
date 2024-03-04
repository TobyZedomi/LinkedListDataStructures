package utils;

import business.Song;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author michelle
 */
public class LinkedListExtraTests {

    public LinkedListExtraTests() {

    }


    /**
     * Test if element to be removed is null
     */
    @Test
    public void testRemoveIfNull() {

        System.out.println("Test if element to be removed is null");
        Song s = new Song(null,null);
        LinkedList instance = new LinkedList();
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));

        boolean expResult = false;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);
    }


}
