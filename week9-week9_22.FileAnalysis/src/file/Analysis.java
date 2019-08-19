
package file;

import java.io.File;
import java.util.*;

public class Analysis {
    private Scanner rd;
    private List<String> list;
    public Analysis(File file) throws Exception {
        this.rd = new Scanner(file,  "UTF-8");
        this.list = new ArrayList<String>();
        while(rd.hasNextLine()) {
            this.list.add(rd.nextLine());
        }
    }
    
    
    public int lines() throws Exception{
        return list.size();
    }
    
    
    public int characters() throws Exception{
        int count = 0;
        for(String line: list) {
            count+= line.length()+1;
        }
        return count;
        
    }
}
