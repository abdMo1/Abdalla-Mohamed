import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(average(1,2,3,4));
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String userName = reader.nextLine();
        System.out.println("Number of characters:"+userName.length());
        int length=0;
        while(length<userName.length()){
            System.out.println(length+1 +"- character "+userName.charAt(length));
            length++;
        }
        int length2=userName.length()-1;
        System.out.println("In reverse order:");
        while(length2>=0){
            System.out.print(userName.charAt(length2));
            length2--;
        }
        System.out.println("Type the first word");
        String first = reader.nextLine();
        System.out.println("Type the second word");
        String second= reader.nextLine();
        int result = first.indexOf(second);
        if(result != -1){
            System.out.println("The word "+ second + " is found in word "+ first);
        }
        else {
            System.out.println("The word "+ second + " is not found in word "+ first);
        }
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.println("Type a word:");
            String word = reader.nextLine();
            if(words.contains(word)){
                System.out.println("You gave the word "+word+" twice");
                break;
            }
            else{
                words.add(word);
            }
        }
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> length1=lengths(list);
        System.out.println("The length of the Strings:"+length1);
        String wordf=reader.nextLine();
        palindrome(wordf);
    }
    public static double average(int num1,int num2,int num3,int num4){
        int average=(Integer.sum(num1,num2)+Integer.sum(num3,num4))/4;
        return average;
    }
    public static ArrayList<Integer> lengths(ArrayList<String> list){
        ArrayList<Integer> length=new ArrayList<Integer>();
        int size1=list.size()-1;
        while(size1 >=0){
            String temp = list.get(size1);
            int temp2= temp.length();
            length.add(temp2);
            size1--;
        }
        return length;
    }
    public static void palindrome(String word){

        String word2="";
        char ch;

        for(int i=0;i<word.length();i++){
            ch=word.charAt(i);
            word2=ch+word2;
        }
        if(word2.equals(word)){
            System.out.println("The text is a palindrome");
        }
        else{
            System.out.println("The text is not a palindrome");
        }
    }
}