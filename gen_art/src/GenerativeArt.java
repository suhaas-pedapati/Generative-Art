import processing.core.PApplet;


public class GenerativeArt extends PApplet {


    public static void main(String[] args) {
        PApplet.main("GenerativeArt");
    }


    public void settings() {
        size(600,600);
    }


    public void setup() {
        background(255);
        noFill();
    }


    public void draw() {
        strokeWeight(random(1, 5));
        stroke(random(0, 255), random(0, 255), random(0, 255), 50);
        beginShape();
        for (int i = 0; i < 10; i++) {
            curveVertex(random(width), random(height));
        }
        endShape();
    }


}
