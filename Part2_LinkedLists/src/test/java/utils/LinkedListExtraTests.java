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

    /**
     * Test removing first element in the list where the element appears multiple time in the list
     */
    @Test
    public void testRemoveIfMultipleValuesIsThere() {
        System.out.println("Test removing first element in the list where the element appears multiple time in the list ");
        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();
        instance.add(new Song("MJ", "Thriller"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("MJ", "Thriller"));
        instance.add(new Song("MJ", "Thriller"));
        instance.add(new Song("MJ", "Thriller"));


        boolean expResult = true;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);



        for (int i =0; i < instance.size();i++){

            System.out.println(instance.get(i));
        }

    }

    /**
     * Test removing element where the element is not in the list to remove
     */
    @Test
    public void testRemoveIfNoValuesIsThere() {

        System.out.println("Test removing element where the element is not in the list to remove ");
        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();

        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));


        boolean expResult = false;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);



        for (int i =0; i < instance.size();i++){

            System.out.println(instance.get(i));
        }

    }

    /**
     * Test removing element from the list where the amount of elements in the list is greater than the capacity
     */
    @Test
    public void testRemoveSongWhereSizeOfListIsGreaterThanCapacity() {

        System.out.println("Test removing element from the list where the amount of elements in the list is greater than the capacity ");
        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();

        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));

        assertThrows(IndexOutOfBoundsException.class, () -> {

            instance.remove(s);
        });

    }

    /**
     * Test remove song to end of list where its null
     */
    @Test
    public void testRemoveSongToEndOfListWhereItsNull() {


        System.out.println("Test remove song to end of list where its null ");
        Song s = new Song(null,null);
        LinkedList instance = new LinkedList();

        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));


        assertThrows(IndexOutOfBoundsException.class, () -> {

            instance.remove(s);
        });

    }


    /**
     * Test add song to the end of the list where the element is not in the list
     */
    @Test
    public void testAddSongToEndOfList() {

        System.out.println("Test add song to the end of the list where the element is not in the list ");
        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();

        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(s);

        LinkedList instance1 = new LinkedList();
        instance1.add(new Song("Prince", "Sign O The Times"));
        instance1.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance1.add(new Song("Carti", "WLR"));
        instance1.add(new Song("MJ","Thriller"));

        for (int i = 0; i < instance.size();i++){

            Song expResult = instance1.get(i);
            Song Result = instance.get(i);

            assertEquals(expResult,Result);
        }


        for (int i =0; i < instance.size();i++){

            System.out.println(instance.get(i));
        }

        System.out.println("***");

        for (int i =0; i < instance1.size();i++){

            System.out.println(instance1.get(i));
        }

    }



    /**
     * Test add element to the end of the list where the element appears multiple time in the linkedList already
     */
    @Test
    public void testAddSongToEndOfListWithMultiple() {

        System.out.println("Test add element to the end of the list where the element appears multiple time in the linkedList already ");
        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();

        instance.add(new Song("Stevie Wonder", "Songs In The Key Of Life"));
        instance.add(new Song("MJ", "Thriller"));
        instance.add(new Song("My Bloody Valentine", "Loveless"));
        instance.add(new Song("MJ", "Thriller"));
        instance.add(new Song("Radiohead", "Ok Computer"));
        instance.add(s);

        LinkedList instance1 = new LinkedList();
        instance1.add(new Song("Stevie Wonder", "Songs In The Key Of Life"));
        instance1.add(new Song("MJ", "Thriller"));
        instance1.add(new Song("My Bloody Valentine", "Loveless"));
        instance1.add(new Song("MJ", "Thriller"));
        instance1.add(new Song("Radiohead", "Ok Computer"));
        instance1.add(new Song("MJ", "Thriller"));

        for (int i = 0; i < instance.size();i++){

            Song expResult = instance1.get(i);
            Song Result = instance.get(i);

            assertEquals(expResult,Result);
        }


        for (int i =0; i < instance.size();i++){

            System.out.println(instance.get(i));
        }

        System.out.println("***");

        for (int i =0; i < instance1.size();i++){

            System.out.println(instance1.get(i));
        }

    }



    /**
     * Test add element to ethe end of the list where the element is at the start of the list already
     */
    @Test
    public void testAddSongToEndOfListWithElementAtStart() {

        System.out.println("Test add element to ethe end of the list where the element is at the start of the list already ");
        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();


        instance.add(new Song("MJ", "Thriller"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(s);

        LinkedList instance1 = new LinkedList();
        instance1.add(new Song("MJ", "Thriller"));
        instance1.add(new Song("Prince", "Sign O The Times"));
        instance1.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance1.add(new Song("Carti", "WLR"));
        instance1.add(new Song("MJ", "Thriller"));

        for (int i = 0; i < instance.size();i++){

            Song expResult = instance1.get(i);
            Song Result = instance.get(i);

            assertEquals(expResult,Result);
        }


        for (int i =0; i < instance.size();i++){

            System.out.println(instance.get(i));
        }

        System.out.println("***");

        for (int i =0; i < instance1.size();i++){

            System.out.println(instance1.get(i));
        }

    }


    /**
     * Test add song to end of the list where there is the element to be added at the end of the list already
     */
    @Test
    public void testAddSongToEndOfListWithElementAtEnd() {

        System.out.println("Test add song to end of the list where there is the element to be added at the end of the list already ");
        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();


        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(new Song("MJ", "Thriller"));
        instance.add(s);

        LinkedList instance1 = new LinkedList();
        instance1.add(new Song("Prince", "Sign O The Times"));
        instance1.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance1.add(new Song("Carti", "WLR"));
        instance1.add(new Song("MJ", "Thriller"));
        instance1.add(new Song("MJ", "Thriller"));

        for (int i = 0; i < instance.size();i++){

            Song expResult = instance1.get(i);
            Song Result = instance.get(i);

            assertEquals(expResult,Result);
        }


        for (int i =0; i < instance.size();i++){

            System.out.println(instance.get(i));
        }

        System.out.println("***");

        for (int i =0; i < instance1.size();i++){

            System.out.println(instance1.get(i));
        }

    }


    /**
     * Test add song to end of list where size of list is greater than the capacity
     */
    @Test
    public void testAddSongToEndOfListWhereSizeOfListIsGreaterThanCapacity() {


        System.out.println("Test add song to end of list where size of list is greater than the capacity ");
        Song s = new Song("MJ","Thriller");
        LinkedList instance = new LinkedList();

        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));


        assertThrows(IndexOutOfBoundsException.class, () -> {

            instance.add(s);
        });

    }


    /**
     * Test add song to end of list where its null
     */
    @Test
    public void testAddSongToEndOfListWhereItsNull() {


        System.out.println("Test add song to end of list where its null ");
        Song s = new Song(null,null);
        LinkedList instance = new LinkedList();

        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));
        instance.add(new Song("Carti", "WLR"));
        instance.add(new Song("Prince", "Sign O The Times"));
        instance.add(new Song("Jimi Hendrix", "Axis Bold As Love"));


        assertThrows(IndexOutOfBoundsException.class, () -> {

            instance.add(s);
        });

    }


}
