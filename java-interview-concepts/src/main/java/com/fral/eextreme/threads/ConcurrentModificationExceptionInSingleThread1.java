package com.fral.eextreme.threads;

import java.util.ArrayList;
import java.util.List;


/**
 * How to deal with ConcurrentModificationException in Java? Beware while removing elements from ArrayList in loop
 * ================================================================================================================
 *
 * One of the common problem while removing elements from an ArrayList in Java is the ConcurrentModificationException.
 * If you use classical for loop with the index or enhanced for loop and try to remove an element from the ArrayList
 * using remove() method, you will get the ConcurrentModificationException but if you use Iterator's remove method or
 * ListIterator's remove() method, then you won't get this error and be able to remove the element. It's an unwritten
 * rule in Java that while looping through the list, you should not add() or remove() elements until the collection
 * supports fail-safe Iterator e.g. CopyOnWriteArrayList, which operate on a copy of list rather than the original
 * list.
 *
 * The main problem with this error is that it confuses developer that list is getting modified by multiple threads
 * and that's why Java is throwing this error, it's not true. Most of the time ConcurrentModificationException comes
 * even without multiple threads modifying the list
 *
 */
/*public class ConcurrentModificationExceptionInSingleThread1 {

    public static void main(String args[]) {
        List<String> listOfBooks = new ArrayList<String>();
        listOfBooks.add("Programming Pearls");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Effective Java");
        listOfBooks.add("Code Complete");

        // Using forEach loop to iterate and removing
        // element during iteration will throw
        // ConcurrentModificationException in Java
        for (String book : listOfBooks) {
            if (book.contains("Code")) {
                listOfBooks.remove(book);
            }
        }
    }
}*/

/**
 * You can see that this error comes even though we just have one thread, main thread which is operating with
 * ArrayList. The ConcurrentModification error comes because we are not using Iterator, instead just calling
 * listOfBooks.remove() method.
 *
 */


/**
 * Using Classical for loop and ArrayList.remove(index)
 * ================================================================================================================
 *
 * Here is another interesting code example of removing elements from ArrayList. Surprisingly this code will not
 * throw ConcurrentModificationException when you first run it? do you know why?
 *
 * Well, try it before you look at the explanation after the code. It's really this kind of minor details about
 * Java programming language and Collection framework
 *
 */

public class ConcurrentModificationExceptionInSingleThread1 {

    public static void main(String args[]) {
        List<String> listOfBooks = new ArrayList<String>();
        listOfBooks.add("Programming Pearls");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Effective Java");
        listOfBooks.add("Code Complete");

        System.out.println("List before: " + listOfBooks);
        for (int i=0; i<listOfBooks.size(); i++) {
            String book = listOfBooks.get(i);
            if (book.contains("Code")) {
                System.out.println("Removing:........." + book);
                listOfBooks.remove(i);
            }
        }

        System.out.println("List after: " + listOfBooks);
    }
}

/**
 * This code doesn't throw ConcurrentModificationException because here we are not using Iterator but we are just
 * using traditional for loop.
 *
 * It's the Iterator which throws ConcurrentModificationException, and not the remove method of ArrayList, hence
 * you don't see that error in below code.
 *
 * If you look at the code for ArrayList.java, you will notice that there is a nested class which implemented
 * Iterator interface and it's next() method calls checkForComodification() function which actually checks if
 * ArrayList has modified during iteration or not, if modCount doesn't match with expectedModCount then it throws
 * ConcurrentModificationException.
 *
 */
