package Birds;

public class Penguin extends NonFlyingBird {
    public Penguin (String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public String fly () {
        return ("Penguin has " +feathers+ " feathers and layEggs: " + layEggs + "\n" + fly);
    }
}

