import java.util.*;
public class Storehouse {
    private Map<String, Integer> store;
    private Map<String, Integer> stocks;
    
    public Storehouse(){
        this.store = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
            
    public void addProduct(String product, int price, int stock){
        this.store.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        if(this.store.get(product) == null) return -99;
        return this.store.get(product);
    }
    
    public int stock(String product){
        if(this.stocks.get(product) == null) return 0;
        return this.stocks.get(product);
    }
    
    public boolean take(String product){
        int amount = this.stock(product);
        if(this.stocks.get(product) == null || amount == 0) return false;
        if(this.stocks.get(product) > 0)
            this.stocks.put(product, --amount);
        return true;
    }
    
    public Set<String> products(){
        Set<String> set = store.keySet();
        return set;
    }
}
