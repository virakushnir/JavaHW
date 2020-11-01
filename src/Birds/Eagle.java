package Birds;

public class Eagle extends FlyingBird {
    public Eagle (String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public String fly () {
        return ("Eagle has " +feathers+ " feathers and layEggs: " + layEggs + "\n" + fly);
    }
}
