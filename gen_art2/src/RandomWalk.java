import processing.core.PApplet;

public class RandomWalk extends PApplet {

    int x, y;

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        background(255);
        x = width/2;
        y = height/2;
    }

    public void draw() {
        int stepSize = (int) random(1, 10);
        int r = (int) random(0, 255);
        int g = (int) random(0, 255);
        int b = (int) random(0, 255);
        stroke(r, g, b);
        strokeWeight(3);
        point(x, y);

        int choice = (int) random(4);
        if (choice == 0) {
            x += stepSize;
        } else if (choice == 1) {
            x -= stepSize;
        } else if (choice == 2) {
            y += stepSize;
        } else {
            y -= stepSize;
        }

        if (x < 0 || x > width || y < 0 || y > height) {
            x = width/2;
            y = height/2;
            background(255);
        }
    }

    public static void main(String[] args) {
        PApplet.main("RandomWalk");
    }

}
