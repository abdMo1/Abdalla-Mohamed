public class MyData {
    private int day;
    private int month;
    private int year;
    public MyData(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString(){
        return this.day + "." + this.month + "." + this.year;
    }
    public boolean earlier(MyData compared){
        if(this.year <compared.year){
            return true;
        }
        else if(this.year == compared.year && this.month < compared.month){
            return true;
        }
        else if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }
        return false;
    }

}
