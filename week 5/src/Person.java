public class Person {
    private String name;
    private int weight;
    private int height;
    private MyData birthMyData;
    public Person(String name,int day,int month,int year){
        this.name = name;
        this.weight=0;
        this.height=0;
        this.birthMyData = new MyData(day,month,year);
    }
    public String toString(){
        return this.name + ",born "+this.birthMyData;
    }
}
