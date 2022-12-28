import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    Map<String,Integer> prices;
    Map<String,Integer> Stocks;
    public Storehouse(){
        this.prices =new HashMap<String, Integer>();
        this.Stocks =new HashMap<String, Integer>();


    }

    public void addProduct(String product,int price,int stock){
        prices.put(product, price);
        Stocks.put(product, stock);
    }

    public int price(String product){
        if(this.prices.containsKey(product)){
            return prices.get(product);
        }else{
            return -99;
        }
    }
    public int stock(String product){
        if(this.Stocks.containsKey(product)){
            return Stocks.get(product);
        }else{
            return 0;
        }
    }
    public boolean take(String product) {
        if (this.Stocks.containsKey(product)) {

            if (this.Stocks.get(product) > 0) {
                this.Stocks.put(product, Stocks.get(product) - 1);
                return true;
            } else {
                return false;
            }

        }
        else{
            return false;
        }
    }
    public Set<String> products(){
        return this.prices.keySet();
    }
}
