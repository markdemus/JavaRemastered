package com.markdemus;

public class Switch {

    public static void main(String[] args) {


        int switchValue = 7;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4: case 5: case 6:
                System.out.println("Value was 4, 5 or 6");
                System.out.println("It was actually 4");
                break;
            default:
                System.out.println("Value was not found");
                //break;
        }

    //Challenge
        char charValue = 'D';

        switch(charValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':case 'E':case 'F':
                System.out.println("Value was " + charValue);
                break;
            default:
                System.out.println("Value was not found");
                //break;
        }

        String month = "JanuAry";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Value was Jan");
                break;
            case "February":
                System.out.println("Value was Feb");
                break;
            case "March":
                System.out.println("Value was Mar");
                break;
            case "April":case "May":case "June":
                System.out.println("Value was " + month);
                break;
            default:
                System.out.println("Value was not found");
                //break;
        }

    }
}
