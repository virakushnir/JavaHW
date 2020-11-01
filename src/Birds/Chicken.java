package Birds;

public class Chicken extends NonFlyingBird {
    public Chicken (String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public String fly () {
        return ("Chicken has " +feathers+ " feathers and layEggs: " + layEggs + "\n" + fly);
    }
}
