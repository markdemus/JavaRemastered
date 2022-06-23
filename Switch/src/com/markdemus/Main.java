package com.markdemus;

public class Main {

    public static void main(String[] args) {

        //intro way of writing what would be a switch
        int value = 1;
        if(value ==1){
            System.out.println("Value was 1");
        } else if(value ==2){
            System.out.println("Value was 2");
        } else if(value ==3){
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 1;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
               // break; //breaks out of the switch once condition is met, if not here, it will run the others unti lit finds a break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default: //where the code goes if not switch was met
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchChallenge = 'D';
        switch (switchChallenge){
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;

            case 'C':
                System.out.println("C");
                break;

            case 'D': case 'E':
                System.out.println("D");
                break;

            default:
                System.out.println("Not found");
        }

        String month = "january";
        switch (month.toUpperCase()) {
            case "March":
                System.out.println("The month is March");
                break;

            case "February": case "JANUARY":
                System.out.println("The month is " + month);
                break;

            default:
                System.out.println("I have no idea");

        }

        printDayOfTheWeek(2);
        //more code here after break
    }

    //Challenge
    public static void printDayOfTheWeek(int day) {

        day = 2;
        switch (day){
            case 1:
                System.out.println("Day of week is Sunday");
                break;

            case 2: case 3: case 4: case 5: case 6:
                System.out.println("Day of week is a weekday");
                break;

            case 7:
                System.out.println("Day of week is Saturday");

            default:
                System.out.println("Invalid Day");
        }
    }
}
