package com.markdemus;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        int count = 0;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

//        for(count = 0; count != 6; count++){
//            System.out.println("Count value is "+ count);
//        }

        while(true) {
            if(count == 6){
                break;
            }
            System.out.println("Count value is "+ count);
            count++;
        }

        //Do-While
        count = 0;
        do {
            System.out.println("Count value is " + count);
            count++;
            if(count > 100) {
                break;
            }
        } while (count != 6);

        //Challenge
//        int number = 2;
//        int finishNumber = 20;
//        int totalNumbers = 0;
//
//        while (number <= finishNumber && totalNumbers != 6) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//
//        }
//    }

        int number = 2;
        int finishNumber = 20;
        int totalNumbers = 0;

        while(number <= finishNumber && totalNumbers != 6) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            totalNumbers++;
            if(totalNumbers >= 5) {
                break;
            }
        }
        System.out.println("Found " + totalNumbers + " numbers");
    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
