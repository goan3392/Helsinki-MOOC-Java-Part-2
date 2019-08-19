import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Printer {
    private String name;
    public Printer(String fileName) throws Exception{
        this.name = fileName;
    }
    
    
    public void printLinesWhichContain(String word) throws Exception {
        File f = new File(this.name);
        Scanner reader = new Scanner(f);
        
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            if(line.contains(word))
                System.out.println(line);
        }
    }    
}
