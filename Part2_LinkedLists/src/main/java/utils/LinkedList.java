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

    /// adding method

    /**
     * Add an element to the end of the linkedList
     *
     * @param s is the element that is being added in the linkedList
     */
    public void add(Song s) {
/// this node is going to carry the new data that will be added
        Node newNode = new Node(s);

/// if the size of the linkedList is greater than the capacity or the added value is null
        if (numElements > this.capacity || newNode == null) {
            /// it will throw an indexOutOfBoundsException
            throw new IndexOutOfBoundsException("Out of bounds");
        }
        /// if the size of the linkedList is equal to 0
        else if (numElements == 0) {

            // the head is set to the newNode
            head = newNode;

        } else {

            /// A current node is being set to the head
            Node current = head;

            /// loop through the current node until the element is not null
            while (current.getNext() != null) {
                /// the next element is what current is going to be. Going up in the linkedList
                current = current.getNext();
            }
            /// once it reaches the end of the linkedList add the new element ot be added at the end that was held in newNode
            current.setNext(newNode);
        }
        //// track the element being added in the linkedList
        numElements++;

    }


    /// remove method

    /**
     * Remove the first instance of the element in the linkedList
     *
     * @param value is the element that is being searched
     * @return true if the element was removed and false if the element was not removed
     */
    public boolean remove(Song value) {


        /// if the size of the linkedList is greater than the capacity or the removed value is null
        if (numElements > this.capacity || value == null) {
            /// a indexOutOfBoundsException will be thrown
            throw new IndexOutOfBoundsException("Out of bounds");
        }
        /// if the data in the linkedList is equal to the element in the parameter
        else if (head.data.equals(value)) {
            /// this removes the element from the linked-list
            head = head.next;
            // reduces the amount of elements in the linkedList by 1
            numElements--;
            /// return true as it has been removed from the linkedList
            return true;
        }

        /// return false if not removed from the linkedList
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
