package com.markdemus;

public class Main {

    public static void main(String[] args) {
        Account marksAccount = new Account();//"1234567", 0.00, "Mark Demus", "214-607-2048","mark_demus@yahoo.com"); //this is calling the constructor

        System.out.println(marksAccount.getNumber());
        System.out.println(marksAccount.getBalance());

        marksAccount.withdrawal(100);
        marksAccount.deposit(50);
        marksAccount.withdrawal(52.5);
        marksAccount.deposit(51);
        marksAccount.withdrawal(100);

        Account nikkisAccount = new Account("Nikki","niiiki_morton07@yahoo.com","214-927-9499");
        System.out.println("Account number: " + nikkisAccount.getNumber() + " - Name: " + nikkisAccount.getCustomerName());
    }
}
