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


    /**
     * Test if the element to be removed is not in the list
     */
    @Test
    public void testRemoveIfValueIsNotThere() {

        System.out.println("Test if the element to be removed is not in the list");

        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));

        boolean expResult = false;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);
    }

    /**
     * Remove first element in list where only one element is in the list
     */
    @Test
    public void testRemoveIfOnlyOneValueIsThere() {

        System.out.println("Remove first element in list where only one element is in the list ");
        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();
        instance.add(new Song("MJ", "Thriller"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));

        boolean expResult = true;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);


        for (int i =0; i < instance.size();i++){

            System.out.println(instance.get(i));
        }

    }




}
