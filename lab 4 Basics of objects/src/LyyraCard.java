public class LyyraCard {
    private double balance;
    public LyyraCard(double balanceAtStart){
        this.balance=balanceAtStart;
    }
    public String toString(){
        return "The card has "+this.balance+" euros";
    }
    public void payEconmical(){
        if(this.balance>=2.5){
            this.balance-=2.5;
        }
    }
    public void payGourmet(){
        if(this.balance>=4){
            this.balance-=4;
        }
    }
    public void loadMoney(double amount){
        this.balance+=amount;
        if(this.balance>=150){
            this.balance=150;
        }
    }

}
