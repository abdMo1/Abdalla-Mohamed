import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Dice {
    private Random random;
    private int numberOfSides;
    public Dice(int numberOfSides){
        random = new Random();
        this.numberOfSides=numberOfSides;
    }
    public int roll(){
        int first = 1;
        return this.random.nextInt(first,this.numberOfSides+1);
    }
}
