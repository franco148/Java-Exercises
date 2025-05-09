package com.fral.extreme.ramdom.questions;

/**
 * THEORY QUESTIONS
 *
 * 1. Every unit in the system needs to have a clearly defined responsibility and functionality. Units that
 * combine multiple concerns must be split into smaller pieces. What is this concept?
 *
 * a. Encapsulation
 * b. Delegation
 * c. Separation of concerns        x
 * d. Polymorphism
 *
 *
 *
 *
 * 2. Which of the following are benefits of Front Controller Pattern?
 *
 * a. Avoids duplicate control logic                        x
 * b. Avoids embedding program logic in view
 * c. Uses template-based views
 * d. Applies common logic to multiple requests             x
 *
 *
 *
 * Which of the following patterns provides broadcast type communication?
 *
 * a. Singleton
 * b. Abstract Factory
 * c. Factory
 * d. Composite
 * e. Observer          x
 *
 *
 *
 *
 * Consider the following scenario: Carmi has a public/private key pair that has been signed by the trusted CA
 * Verisign. Julio Cesar already has a copy of Carmi's public key. Julio Cesar sends Carmi and encrypted jar file.
 * Carmi successfully decrypts the jar file using the private key. Which of the following statements regarding
 * this scenario is true?
 *
 * a. The jar file may contain malicious code                           x
 * b. Julio Cesar has written the jar file
 * c. The jar file may not have been signed with Carmi's public key
 * d. The code has not been modified in transit.
 *
 *
 *
 * Which terminal operations on the Stream class are reductions? (Choose all that apply)
 *
 * A. collect()         x
 * B. count()           x
 * C. findFirst()
 * D. map()
 * E. peek()
 * F. sum()             x
 *
 *
 * Which of the following events will cause a thread to die?
 *
 * A. The method sleep() is called.
 * B. The method wait() is called.
 * C. Execution of the start() method ends.
 * D. Execution of the run() method ends                    x
 * E. Execution of the run() method is called.
 *
 *
 *
 * In below java program, which exception will occur? FileReader file = new FileReader("test.txt");
 *
 * A. NullPointerException at compile time
 * B. NullPointerException at runtime
 * C. FileNotFoundException at compile time
 * D. FileNotFoundException at runtime              x
 *
 *
 *
 * What is -Xms and -Xmx while starting the JVM?
 *
 * A. Maximum and initial memory
 * B. Initial and maximum memory                            x
 * C. Extra memory on start and extra memory extended
 * D. They are not valid flags
 *
 *
 * In kafka records are published to:
 *
 * A. Topic                 x
 * B. Category
 * C. Table
 * D. Subject
 *
 *
 *
 * With the default settings of a kafka producer, which part of a record is used to determine its target partition
 * within the topic.
 *
 * A. Record key                x
 * B. Record value
 * C. Header key
 * D. Record timestamp
 *
 *
 *
 * Kafka. How is message ordering defined in kafka? Ordering is guaranteed...
 *
 * A. across all topics in a kafka cluster
 * B. for all messages in a single topic from a single producer
 * C. with the same key delivered by all producers writing to that partition        x
 * D. for all messages with the same key delivered by a single producer.
 * E. There are no message ordering guarantees in kafka
 *
 *
 *
 * Kafka. your consumer application has a real-time processing requirement. What information below is critical to monitor?
 *
 * A. Total time to serve requests to replica followers
 * B. The difference between the current offset to be read and the log end offset               x
 * C. Aggregate incoming byte rate
 * D. Consumer heartbeat rate to the Group Coordinator.
 *
 *
 *
 * A collection and a document in MongoDB is equivalent to......... concepts respectively.
 *
 * A. Table and Column
 * B. Table and Row             x
 * C. Column and Row
 * D. Database and Table
 *
 *
 *
 * In which format MongoDB represents document structure?
 *
 * A. BSON              x
 * B. TXT
 * C. DOCX
 * D. None of these
 *
 *
 *
 *
 * In an aggregation, the most basic pipeline stages provide............ that operate like queries.
 *
 * A. Methods
 * B. Filters                           x
 * C. Store procedure
 * D. None of the mentioned
 *
 *
 *
 *
 * You can't create multiple containers from the same image in docker.
 *
 * A. True
 * B. False                     x
 *
 *
 *
 *
 * ........ Is the technology that lets you create useful IT services using resources that are traditionally bound to hardware.
 *
 * A. Virtualization                    x
 * B. Docker hub
 * C. Docker swarm
 * D. All of the above
 *
 *
 *
 * In scrum, the sprint goal is (Choose the best answer):
 *
 * A. Recommended, but optional
 * B. An artifact that creates transparency through inspection and adaptation
 * C. An objective that provides flexibility and guidance to the Developers throughout the sprint   x
 * D. Decided by the Scrum Master, in collaboration with the Product Owner.
 *
 *
 *
 * Which concept is NOT defined in the Scrum Framework?
 *
 * A. Scrum Master
 * B. Project Manager               x
 * C. Scrum Product Owner
 * D. Daily Scrum
 * E. Scrum product burndown
 *
 *
 *
 * Which metric is most appropriate for evaluating the performance of an API under high load?
 *
 * A. Number of requests per second                 x
 * B. Number of registered users
 * C. Percentage of code errors
 * D. Dis space
 *
 *
 *
 *
 * Which of the following alerts would be most useful for detecting frequent failures in an API?
 *
 * A. Alert for memory usage
 * B. Alert for an increase in the number of commits
 * C. Alert for high response time                          x
 * D. Alert for low user activity
 *
 *
 *
 */

import java.util.stream.Stream;

/**
 * Given the following: Which option will allow this code to compile according to business logic?
 *
 * a. Change Carnivore interface to: interface Carnivore<E extends Plant> extends Hungry<E> {}
 * b. Change Herbivore interface to: interface Herbivore<E extends Animal> extends Hungry<E> {}
 * c. No changes are necessary, it compiles with no errors
 * d. Change the Cow class to: class Cow extends Animal implements Herbivore<Grass> { public void munch(Grass x){} }  x
 */

abstract class Plant {}
abstract class Animal {}
class Grass extends Plant {}

interface Hungry<E> { void munch(E x); }
interface Carnivore<E extends Animal> extends Hungry<E> {}
interface Herbivore<E extends Plant> extends Hungry<E> {}

class Cow extends Animal implements Herbivore<Grass> { public void munch(Grass x) {} }
class Lion extends Animal implements Carnivore<Cow> { public void munch(Cow x) {} }


/**
 * What is the output of the following?
 *
 * A: 12112
 * B: 212
 * C: 212112
 * D: java.util.stream.ReferencePipeline$23525          x
 * E: The code does not compile
 * F: An exception is thrown
 * G: The code hangs
 */
public class Question004 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", s -> s + 1);
        System.out.println(stream.limit(2).map(x -> x + "2"));
    }
}
