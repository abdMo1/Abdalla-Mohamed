import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        //System.out.println("Team: "+barcelona.getName());
        Player brain = new Player("Brain");
        //.out.println("Player: "+brain);
        Player pekka = new Player("Pekka",39);
        //System.out.println(pekka.toString());
        barcelona.setMaxSize(2);
        barcelona.addPlayer(brain);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikeal",1));
        barcelona.printPlayer();
        System.out.println("Number of players: "+ barcelona.size());
        System.out.println("Total goals: "+barcelona.goals());

    }
}