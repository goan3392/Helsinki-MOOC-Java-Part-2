import java.util.*;
public class CivilService implements NationalService{
    int daysLeft;
    
    public CivilService(){
        this.daysLeft = 362;
    }
    
    public int getDaysLeft(){
        return this.daysLeft;
    }
    
    public void work(){
        if(this.daysLeft > 0)
            this.daysLeft--;
    }
}
