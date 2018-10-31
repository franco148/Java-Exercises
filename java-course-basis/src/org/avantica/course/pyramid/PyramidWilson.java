package org.avantica.course.pyramid;

import java.util.Scanner;

public class PyramidWilson {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int variable;
        String myPiramide;
        System.out.println("Introdusca un numero entero");
        variable=sc.nextInt();
        //System.out.println(variable);

//		switch (variable) {
//        case 1:  myPiramide = "*";
//                 break;
//        case 2:  myPiramide = "**";
//                 break;
//        case 3:  myPiramide = "***";
//                 break;
//        case 4:  myPiramide = "****";
//                 break;
//        case 5:  myPiramide = "*****";
//                 break;
//        case 6:  myPiramide = "******";
//                 break;
//        case 7:  myPiramide = "*******";
//                 break;
//        case 8:  myPiramide = "********";
//                 break;
//        case 9:  myPiramide = "*********";
//                 break;
//        case 10: myPiramide = "**********";
//                 break;
//        case 11: myPiramide = "************";
//                 break;
//        case 12: myPiramide = "*************";
//                 break;
//        default: myPiramide = "**************";
//                 break;
//    }
//    System.out.println(myPiramide);
//    	for(int aux = 1; aux <= variable; aux++) {
//    		for(int aux2 = 1; aux2 <= variable-aux; aux2++) {
//        		System.out.println(" ");
//    		}
//    		for(int asteriscos = 1; asteriscos <=(aux*2)-1; asteriscos++) {
//        		System.out.println("*");
//        	}
//        	System.out.println();
//    	}

        for(int numBlancos = variable-1,numAsteriscos=1; numBlancos>=0; numBlancos--, numAsteriscos += 2){

            for(int i=1;i<=numBlancos;i++){
                System.out.print(" ");
            }

            for(int j=1;j<=numAsteriscos;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
