import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

//    returns a random number between 1...number of sides.
    public int roll() {
        return -1;
    }
}
