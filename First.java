package com.mycompany.first;

import java.util.Scanner;

public class First {
    

    public static void main(String[] args) {
        //System.out.println("Jane Doe");
        //System.out.println("Hello World!\n(And all the people of the world)");
       // int year =  365 * 24 * 60 *60;
       // System.out.println(year);
        //System.out.println(3+4);
        
       // Scanner reader = new Scanner(System.in);
        //System.out.println("Type an INT:");
        //int number1 = Integer.parseInt(reader.nextLine());
        //System.out.print("Type an INT:");
        //int number2 = Integer.parseInt(reader.nextLine());
        //System.out.println(number1+number2);
        Scanner reader = new Scanner(System.in);
        System.out.print(">>");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print(">>");
        int number2 = Integer.parseInt(reader.nextLine());
        if(number1 > number2){
            System.out.println(number1);

        }
        else if (number1 == number2 )
        {
            System.out.println("Equal");
        }
        else{
            System.out.println(number1);
        }
        
    }
}
