/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.*;
/**
 *
 * @author antho
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> dictionary;
    public PersonalMultipleEntryDictionary(){
        this.dictionary = new HashMap<String, Set<String>>();
    }    
    public void add(String word, String entry){
        if(!this.dictionary.containsKey(word)){
            this.dictionary.put(word, new HashSet<String>());
        }
        Set<String> set = this.dictionary.get(word);
        set.add(entry);
    }
    
    public Set<String> translate(String word){
        if(!this.dictionary.containsKey(word))return null;
        Set<String> set = this.dictionary.get(word);
        return set;
    }
    
    public void remove(String word){
        this.dictionary.remove(word);
    }
}
