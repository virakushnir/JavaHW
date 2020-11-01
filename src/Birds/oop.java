package Birds;

public class oop {
    public static void main(String[] args) {
        Bird[] bird = new Bird[4];
        bird[0] = new Penguin("black and white", true);
        bird[1] = new Chicken("black, white, yellow, brown", true);
        bird[2] = new Swallow("black, white, red, blue", false);
        bird[3] = new Eagle("dark brown", true);

        for (int i = 0; i < bird.length; i++)
            System.out.println(bird[i].fly());
    }
}
