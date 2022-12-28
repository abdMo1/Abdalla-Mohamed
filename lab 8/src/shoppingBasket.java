import java.util.HashMap;
import java.util.Map;

public class shoppingBasket {
    Map<String,Purchase>basket;
    public shoppingBasket(){
        basket=new HashMap<String,Purchase>();
    }

    public void add(String product,int price){
        if(basket.containsKey(product)){
            while(amount>0){
                basket.get(product).increaseAmount();
                amount--;
            }
        }
        else{
            Purchase purchase = new Purchase(product, amount, price);
            basket.put(product, purchase);
        }
    }
    public int price(){
        int total=0;
        for(Purchase p: basket.values()){
            total +=p.price();
        }
        return total;
    }
    public void print(){
        for(Purchase p : basket.values()){
            System.out.println(p);
        }
    }
}
