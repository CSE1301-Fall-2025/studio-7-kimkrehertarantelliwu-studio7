import java.util.Random; 

public class die {
    
    private int sides; 
    private Random rand; 

    public die(int sides) {
        this.sides = sides; 
        this.rand = new Random(); 
    }

    public int getSides() {
        return sides;
    }

    public int roll() {
        return rand.nextInt(sides) + 1; 
    }

    public static void main(String[] args) { 
        die sixSided = new die(6); 
        die twentySided = new die(20); 
        System.out.println(sixSided.roll()); 
        System.out.println(twentySided.roll()); 
    }

}

