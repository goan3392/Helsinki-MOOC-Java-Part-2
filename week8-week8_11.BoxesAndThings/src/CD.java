
public class CD implements ToBeStored{
    private String Artist, Title;
    private int publishingYear;
    private double weight;
    
    public CD(String artist, String title, int year){
        this.Artist = artist;
        this.Title = title;
        this.publishingYear = year;
        this.weight = 0.1;
    }
    
    public double weight(){
        return this.weight;
    }
    
    public String toString(){
        return  this.Artist + ": " + this.Title  + " (" + this.publishingYear + ")";
    }
}
