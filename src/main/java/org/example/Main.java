package org.example;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        String input;
        Expression ex;
        do {
            System.out.println("Enter expression: ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            ex=new Expression(input);
        }while (ex.Eval());

    }
}