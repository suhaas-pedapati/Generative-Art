
import processing.core.PApplet;

public class FractalExample extends PApplet {

    private final int MAX_DEPTH = 5;
    private final float ANGLE = radians(25);
    private final float LINE_LENGTH = 100;

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        stroke(255);
        smooth();
    }

    public void draw() {
        background(0);
        translate(width / 2, height);
        line(0, 0, 0, -LINE_LENGTH);
        translate(0, -LINE_LENGTH);
        branch(LINE_LENGTH, MAX_DEPTH);
    }

    private void branch(float len, int depth) {
        if (depth > 0) {
            pushMatrix();
            rotate(ANGLE);
            line(0, 0, 0, -len);
            translate(0, -len);
            branch(len * 0.7f, depth - 1);
            popMatrix();

            pushMatrix();
            rotate(-ANGLE);
            line(0, 0, 0, -len);
            translate(0, -len);
            branch(len * 0.7f, depth - 1);
            popMatrix();
        }
    }

    public static void main(String[] args) {
        PApplet.main("FractalExample");
    }

}
