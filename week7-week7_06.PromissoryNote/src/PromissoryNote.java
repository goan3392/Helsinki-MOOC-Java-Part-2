import java.util.*;

public class PromissoryNote {
    private HashMap<String, Double> bank;
    
    public PromissoryNote(){
        bank = new HashMap<String, Double>();            
        
    }
    
    public void setLoan(String toWhom, double value){
        bank.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String person){
        if(bank.get(person) == null){
            return 0;
        }
        return bank.get(person);
    }
    
}
