import java.util.*;
public class ShoppingBasket{
    private Map<String, Purchase> map;
    
    public ShoppingBasket(){
        this.map = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(this.map.containsKey(product)){
            this.map.get(product).increaseAmount();
        }else{
            Purchase newp = new Purchase(product, 1, price);
            this.map.put(product, newp);
        }
    }
    public int price(){
        int price = 0;
        for(Purchase i: map.values()){
            price += i.price();
        }
        return price;
    }
    
    public void print(){
        for(Purchase item: map.values())
            System.out.println(item);
    }
}
