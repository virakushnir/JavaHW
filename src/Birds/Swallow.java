package Birds;

public class Swallow extends FlyingBird {
    public Swallow (String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public String fly () {
        return ("Swallow has " +feathers+ " feathers and layEggs: " + layEggs+ "\n" + fly);
    }
}
