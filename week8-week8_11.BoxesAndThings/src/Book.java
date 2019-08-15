
public class Book implements ToBeStored{
    private String name, writer;
    private double weight;
    
    public Book(String name, String writer, double weight){
        this.name = name;
        this.writer = writer;
        this.weight = weight;
    }
    
    public double weight(){
        return this.weight;
    }
    
    public String toString(){
        return this.name + ": " + this.writer ;
    }
}
