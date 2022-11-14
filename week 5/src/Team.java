import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> Players = new ArrayList<Player>();


    int maxSize=0;

    public Team(String name){
        this.name = name;

    }
    public String getName(){
        return this.name;
    }
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;
    }
    public void addPlayer(Player player1){
        if(this.Players.size() < this.maxSize )
        {
            this.Players.add(player1);
        }

    }
    public void printPlayer(){
        for(Player plyr : this.Players){
            System.out.println(plyr);
        }
    }
    public int size(){
        return this.Players.size();
    }
    public int goals(){
        int sum=0;
        for(Player plyr : this.Players){
            sum+=plyr.getGoals();
        }
        return sum;
    }


}
