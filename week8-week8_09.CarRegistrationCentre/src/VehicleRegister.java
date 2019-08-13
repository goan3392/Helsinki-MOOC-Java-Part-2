/**
 *
 * @author giuseppedesantis
 */
import java.util.*;
public class VehicleRegister {
    private Map<RegistrationPlate, String> register = new HashMap<RegistrationPlate, String>();
    
    public boolean add(RegistrationPlate plate, String owner){
        if(this.register.get(plate) == null){
            this.register.put(plate, owner);
            return true;
        }else{
            return false;
        }
    }
    
    public String get(RegistrationPlate plate){
        if(this.register.get(plate) == null){
            return null;
        }else{
            return this.register.get(plate);
        }
    }
    
    public boolean delete(RegistrationPlate plate){
        if(this.register.get(plate) == null){
            return false;
        }else{
            this.register.remove(plate);
            return true;
        }
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : this.register.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owner = new ArrayList<String>();
        for(String name: register.values()){
            if(!owner.contains(name))
                owner.add(name);
        }
        
        for(int i = 0; i < owner.size(); i++){
            System.out.println(owner.get(i));
        }
    }
}