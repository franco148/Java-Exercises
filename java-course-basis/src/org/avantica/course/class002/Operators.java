package org.avantica.course.class002;

public class Operators {

    public static void main(String[] args) {
         Integer myFirstNumber = 127;
         Integer mySecondNumber = 127;

        System.out.println("hash 1: " + System.identityHashCode(myFirstNumber));
        System.out.println("hash 1: " + System.identityHashCode(mySecondNumber));

        System.out.println(myFirstNumber == mySecondNumber);

        System.out.println("128 == 128: " + (128 == 128));

//        myFirstNumber = 128;
//        mySecondNumber = 128;
//
//        System.out.println("myFirstNumber == mySecondNumber: " + (myFirstNumber == mySecondNumber)); //

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        System.out.println("int1 == int2: " + (int1 == int2));
        System.out.println("int1 == int3: " + (int1 == int3));
        System.out.println("int2 == int3: " + (int2 == int3));

        System.out.println("int1.equals(int2): " + int1.equals(int2));
        System.out.println("int1.equals(int2): " + int1.equals(int3));
        System.out.println("int1.equals(int2): " + int2.equals(int3));

        //
        Integer int4 = int1;
        System.out.println("int1 == int4" + (int1 == int4));
    }
}
