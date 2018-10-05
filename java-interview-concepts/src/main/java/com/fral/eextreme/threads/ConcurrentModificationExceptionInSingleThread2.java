package com.fral.eextreme.threads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Using Iterator but ArrayList's remove method
 * ================================================================================================================
 * Now, let's see another code example, where Java programmer thinks he has done everything right but still getting
 * the concurrent modification exception.
 *
 */
/*
public class ConcurrentModificationExceptionInSingleThread2 {

    public static void main(String args[]) {
        List<String> listOfBooks = new ArrayList<String>();
        listOfBooks.add("Programming Pearls");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Effective Java");
        listOfBooks.add("Code Complete");

        System.out.println("List before: " + listOfBooks);
        Iterator<String> iterator = listOfBooks.iterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            listOfBooks.remove(book);
        }

        System.out.println("List after: " + listOfBooks);
    }
}*/

/**
 * The real problem with this code is that even though the code is using Iterator to go over ArrayList, it's
 * not really using the Iterator.remove() method to remove the element. It is just using Iterator to get the
 * next element but calling the ArrayList.remove() method to delete the element.
 *
 * I know, it looks easy when you know the reason but in real time, many times programmer take even hours to
 * figure out what is wrong. So, just beware of that.
 *
 */


/**
 * Right way to remove element is by using Iterator's remove method
 * ================================================================================================================
 * Finally, here is the right way to delete an element from ArrayList during iteration. In this example, we have
 * used Iterator both iterate as well as remove the element. The code is ok but it has a serious limitation, you
 * can only use this code to remove the current element. You cannot remove any arbitrary element from ArrayList
 * in Java.
 *
 */
public class ConcurrentModificationExceptionInSingleThread2 {

    public static void main(String args[]) {
        List<String> listOfBooks = new ArrayList<String>();
        listOfBooks.add("Programming Pearls");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Effective Java");
        listOfBooks.add("Code Complete");

        System.out.println("List before: " + listOfBooks);
        Iterator<String> iterator = listOfBooks.iterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            System.out.println("Removing " + book);
            iterator.remove();
        }

        System.out.println("List after: " + listOfBooks);
    }
}

/**
 * The same behavior is applicable to ListIterator as well. I mean you can replace Iterator with ListIterator
 * and code will work fine. The ListIterator also allow you to navigate in both directions i.e. forward and
 * backward.
 *
 */
