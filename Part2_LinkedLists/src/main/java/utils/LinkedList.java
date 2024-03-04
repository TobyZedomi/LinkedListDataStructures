package utils;

import business.Song;

/**
 * @author michelle
 */
public class LinkedList {

    private Node head;

    private Node tail;

    private int numElements;

    private int capacity;


    /**
     * Constructor for LinkedList
     */

    public LinkedList() {

        /// start of list is set to null
        head = null;
        /// amount in list is set to 0
        numElements = 0;
        /// max capacity of List is 7
        this.capacity = 7;

    }


/// size method

    /**
     * Get the amount of elements in the linkedList
     *
     * @return the number of elements in the linked List
     */
    public int size() {

        /// returning number of elements in the linkedList
        return numElements;
    }


/// get method

    /**
     * Get an element in the linkedList at a certain position
     *
     * @param pos is the position that is being searched
     * @return the element at the certain position entered
     */
    public Song get(int pos) {

/// if the position is less than 0 or greater than the size of the linked list
        if (pos < 0 || pos >= numElements) {

            /// it will throw a IndexOutOfBoundsException
            throw new IndexOutOfBoundsException("Invalid position supplied" + pos);
        }

        /// A current Node is being made and is set to the head
        Node current = head;

        /// loop up to that position entered the parameter
        for (int i = 0; i < pos; i++) {

            /// the next element in the list is what current is going to be
            current = current.getNext();
        }

//// return the element at the position that the user entered
        return current.getData();
    }

    ///indexOf Method

    /**
     * Get the specific position of an element entered by the user
     *
     * @param num is the element that is being searched
     * @return the position of the element or if the element is not in the linkedList it will return -1
     */
    public int indexOf(Song num) {

/// A current Node is being made and set to head
        Node current = head;

        /// loop through the entire LinkedList
        for (int i = 0; i < numElements; i++) {

            /// this get the data in the linkedList
            Song currentData = current.getData();
            /// If the data in the linkedList is equal to the one in the parameter
            if (currentData.equals(num)) {

                /// the position will be returned
                return i;
            }

            /// the next element is what current is going to be
            current = current.getNext();
        }

        ///return -1 if the element is not in the linkedList
        return -1;
    }




    //isEmpty method

    /**
     * Check if the linkedList has no data in it and is empty
     *
     * @return true if the linkedList has no elements in it and false if it has elements in the linkedList
     */
    public boolean isEmpty() {


//// if the size of the linkedList is 0
        if (numElements == 0) {
            /// it will return true
            return true;
        }

        /// if it's not empty it will return false
        return false;
    }







    protected static class Node {

        private Song data;
        private Node next;

        public Node(Song data) {
            this.data = data;
        }

        public Song getData() {
            return data;
        }

        public void setData(Song data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
