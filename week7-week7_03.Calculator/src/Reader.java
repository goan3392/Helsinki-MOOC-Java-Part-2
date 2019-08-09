import java.util.*;

public class Reader {
    private Scanner input = new Scanner(System.in);
    
    
    public String readString(){
        return input.nextLine();
    }
    
    public int readInteger(){
        return Integer.parseInt(input.nextLine());
    }
    
}
