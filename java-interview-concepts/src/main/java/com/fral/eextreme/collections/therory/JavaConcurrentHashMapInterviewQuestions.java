package com.fral.eextreme.collections.therory;

public class JavaConcurrentHashMapInterviewQuestions {
}

/**
 * What is ConcurrentHashMap in Java?
 * ================================================================================================================
 * The java.util.concurrent.ConcurrentHashMap is a concurrent collection class added on JDK 1.5 as a replacement
 * of synchronized hash-based map implementations e.g. Hashtable and synchronized HashMap. They offer better
 * performance and scalability over their synchronized counterpart with little risk.
 *
 *
 * Is ConcurrentHashMap thread-safe in Java?
 * ================================================================================================================
 * Yes, ConcurrentHashMap is thread-safe in Java, which means two thread can modify the map without damaging its
 * internal data structure e.g. array and linked list. If you compare this to HashMap, which is not thread-safe,
 * exposing HashMap to multiple threads may damage internal data structure and may render the map completely
 * useless, where many links may go missing or pointing to wrong elements.
 *
 *
 * How does ConcurrentHashMap achieve thread-safety?
 * ================================================================================================================
 * The java.util.ConcurrentHashMap achieves thread-safety by dividing the map into segments and locking only the
 * segment which requires instead of locking the whole map. So, yes, it achieves thread-safety using locking but
 * it performs better because it never locks the whole map. This technique is also known as lock stripping.
 *
 *
 * Can multiple threads read from ConcurrentHashMap same time?
 * ================================================================================================================
 * Yes, ConcurrentHashMap allows concurrent read without locking as reading operation doesn't require locking or
 * thread-safety.
 *
 * Can one thread read and other writes on ConcurrentHashMap at the same time?
 * ================================================================================================================
 * Yes, it's possible for a small number of the writer. For example, if a write operation is modifying one segment
 * of ConcurrentHashmap and read operation is happening on other segments then a reader will not block, but if
 * reader thread is also trying to read from the same segment than it will block until the writer is done.
 *
 *
 */
