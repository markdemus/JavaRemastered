package com.markdemus;

public class OOE {

    public static void main(String[] args) {


        int result = 1 + 2; // = operator is the assignment operator
        System.out.println("1 + 2 = " + result); //3
        int previousResult = result;
        System.out.println("Previous result = " + previousResult); //3 - independent of variable result
        result = result - 1;
        System.out.println("3 - 1 = " + result); //2

        result = result * 10;
        System.out.println("2 * 10 = " + result); //20

        result = result / 5;//given whole number using division operator
        System.out.println("20 / 5 = " + result); //4
        result = result % 3; //given remainder with using modulus operator
        System.out.println("4 % 3 = " + result); //1

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //abbreviating operands
        //result = result + 1; also equals:
        result++;// 1 + 1 = 2
        System.out.println("1 + 1 = " + result); //2

        result--;
        System.out.println("2 - 1 = " + result); //1

        result += 2; //abb. of result = result + 2
        System.out.println("1 + 2 = " + result); //3

        result *= 10;
        System.out.println("3 * 10 = " + result); //30

        result /= 2;
        System.out.println("30 / 2 = " + result); //15

        result -= 2;
        System.out.println("15 - 2 = " + result); //13


    }
}
