package com.markdemus;

public class Main {

    public static void main(String[] args) {

        //Challenge continued
//        int number = 4; //start at 4
//        int finishNumber = 20; //finish at 20
//
//        while (number <= finishNumber) {
//            number++; //increment
//            //test to see if not even
//            if(!isEvenNumber(number)) {
//                continue; //will bypass code below and start over with next number, allowing loop to continue
//            }
//            System.out.println("Even number " + number);
//            }

        //Challenge 2
        int number = 4; //start at 4
        int finishNumber = 20; //finish at 20
        int evenFound = 0;

        while (number <= finishNumber) {
            number++; //increment
            //test to see if not even
            if(!isEvenNumber(number)) {
                continue; //will bypass code below and start over with next number, allowing loop to continue
            }
            System.out.println("Even number " + number);
            evenFound++;
            if(evenFound >= 5) {
                break;
            }
            // //without this, it would have counted to 20.// Also having it here means the test is being executed before printing out the even number (missing 14)
        }

        System.out.println("Total even numbers found = " + evenFound);

        //Starting code
        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for(count = 1; count != 6; count++) {
//            System.out.println(" Count value is " + count);
//        } Sample of For Loop

        //other way to write while loop
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break; //break out of loop once it reaches 6
//            }
//            System.out.println("Count value is " + count);
//            count++; //without this, it will run infinitely
//        }

        //do-while
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count > 5){
                break; //will break out loop recognizing the while statement
            }
        } while (count != 1); //expression to test to exit loop or not


    }


    //challenge
    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) { //testing if it is an even number
            return true;
        } else {
            return false;
        }
    }

}



