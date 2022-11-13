import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class person {
     private String name;
     private int age;
     private Random random;

    public person(String name1,int age1){
        this.age=age1;
        this.name=name1;
        this.random = new Random();
    }
    public void become_older(){
        this.age++;
    }
    public void change_name(String name1){
        this.name=name1;

    }

    public void print(){
        System.out.println(this.name+", age "+this.age+" years old.");
    }
    public int getAge(){
        return this.age;
    }
    public double test_rand(){
        double prob = this.random.nextGaussian();
        return prob;
    }
}
