public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int brickWeight = 1;
        for(int i = 0; i < container.getWeightLimit(); i+=brickWeight){
            Thing brick = new Thing("Brick", brickWeight);
            Suitcase s = new Suitcase(brickWeight);
            s.addThing(brick);
            brickWeight++;
            container.addSuitcase(s);
        }
    }    
    
}
            