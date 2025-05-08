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
 * a. Avoids duplicate control logic
 * b. Avoids embedding program logic in view
 * c. Uses template-based views
 * d. Applies common logic to multiple requests
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
 * a. The jar file may contain malicious code
 * b. Julio Cesar has written the jar file
 * c. The jar file may not have been signed with Carmi's public key
 * d. The code has not been modified in transit.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
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
