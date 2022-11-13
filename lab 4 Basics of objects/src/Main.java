import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);
        combine(list1,list2);
        System.out.println(list1);
        System.out.println(list2);
        Dice d1 = new Dice(6);
        System.out.println(d1.roll());



        person p1 = new person("abdalla",19);
        person p2 = new person("Ibrahem",18);
        p1.change_name("fatema");
        p1.become_older();
        p1.become_older();
        p2.print();
        p1.print();
        System.out.println(p1.getAge());
        int total = p1.getAge() +p2.getAge();
        System.out.println(total);
        String abdalla="Abdalla";
        System.out.println(abdalla.toString());
        System.out.println(p1.test_rand());
        System.out.println(p1.test_rand());
        System.out.println(p1.test_rand());
        System.out.println(p1.test_rand());
        System.out.println(p1.test_rand());

        LyyraCard card = new LyyraCard(5);
        System.out.println(card);
        card.payEconmical();
        System.out.println(card);
        card.payGourmet();
        System.out.println(card);
        card.payGourmet();
        card.payGourmet();
        System.out.println(card);
        card.loadMoney(2555);
        System.out.println(card);


    }


    public static void combine(ArrayList<Integer> first ,ArrayList<Integer> second){
        first.addAll(second);
    }
}