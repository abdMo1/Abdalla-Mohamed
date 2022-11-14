public class Player {
    private String name;
    private int number_of_goals;
    public Player(String name){
        this.name=name;
    }
    public Player(String name,int number_of_goals){
        this.number_of_goals=number_of_goals;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getGoals(){
        return this.number_of_goals;
    }
    public String toString(){
        return "Player: "+this.name+", goals "+this.number_of_goals;
    }

}
