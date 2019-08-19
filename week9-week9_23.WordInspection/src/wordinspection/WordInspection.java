/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;
import java.util.*;
import java.io.File;
/**
 *
 * @author antho
 */
public class WordInspection {
    private List<String> list;
    private Scanner rd = null;
    public WordInspection(File file) throws Exception{        
        try {
            rd = new Scanner(file,  "UTF-8");
        } catch(Exception e){
            System.out.print("Error");
            return;
        }
        this.list = new ArrayList<String>();
        while(rd.hasNextLine()) {
            list.add(rd.nextLine());
        }
    }
    
    public int wordCount(){
        return list.size();
    }
    
    public List<String> wordsContainingZ() {
        List<String> zList = new ArrayList<String>();
        for(String s: this.list){
            if(s.contains("z"))
                zList.add(s);
        }        
        return zList;
        
    }
    
    public List<String> wordsEndingInL() {
        List<String> endsL = new ArrayList<String>();
        for(String s :this.list) {
            if(s.endsWith("l")){
                endsL.add(s);
            }
        }
        return endsL;
    }
    
    public List<String> palindromes() {
        List<String> palindrome = new ArrayList<String>();
        for(int i = 0; i < this.list.size(); i++){
            StringBuilder sb = new StringBuilder(list.get(i));
            if(sb.reverse().toString().equals(list.get(i)))
                palindrome.add(list.get(i));
        }
        return palindrome;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        String vowels = "aeiouyäö";
        List<String> vowelList = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++) {
            boolean check = true;
            String word = list.get(i);
            for(int j = 0; j < word.length(); j++) {                
                for(int v = 0; v < vowels.length(); v++) {
                    if(word.indexOf(vowels.charAt(v)) == -1){
                        check = false;
                        break;
                    }    
                }
                if(check == false)break;
            }
            if(check) vowelList.add(word);
        }
        
        return vowelList;
    }
    
}
