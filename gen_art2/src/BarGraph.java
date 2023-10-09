/*

import processing.core.PApplet;

public class BarGraph extends PApplet {

    private final int NUM_DATA_POINTS = 12;
    private final int MAX_BAR_HEIGHT = 200;
    private final int BAR_WIDTH = 50;

    private int[] data = new int[NUM_DATA_POINTS];
    private int[] colors = {color(71, 142, 213), color(215, 86, 85), color(90, 185, 80)};

    public void settings() {
        size(800, 600);
    }

    public void setup() {
        for (int i = 0; i < NUM_DATA_POINTS; i++) {
            data[i] = (int) random(MAX_BAR_HEIGHT);
        }
        noStroke();
        smooth();
    }

    public void draw() {
        background(255);

        // draw gridlines
        stroke(200);
        for (int i = 0; i < NUM_DATA_POINTS; i++) {
            line(i * BAR_WIDTH + 30, 30, i * BAR_WIDTH + 30, height - 30);
        }
        for (int i = 0; i <= MAX_BAR_HEIGHT; i += 50) {
            line(30, height - 30 - i, width - 30, height - 30 - i);
        }

        // draw x-axis label
        textAlign(CENTER, CENTER);
        fill(0);
        textSize(20);
        text("Data Points", width / 2, height - 10);

        // draw y-axis label
        pushMatrix();
        translate(10, height / 2);
        rotate(-HALF_PI);
        fill(0);
        textSize(20);
        text("Values", 0, 0);
        popMatrix();

        // draw bars
        for (int i = 0; i < NUM_DATA_POINTS; i++) {
            fill(colors[i % 3]);
            rect(i * BAR_WIDTH + 35, height - data[i] - 30, BAR_WIDTH - 10, data[i]);
        }

        // draw legend
        fill(0);
        textSize(16);
        textAlign(LEFT, CENTER);
        text("Legend", width - 100, 20);
        for (int i = 0; i < 3; i++) {
            fill(colors[i]);
            rect(width - 100, 30 + i * 20, 10, 10);
            fill(0);
            text("Data " + (i + 1), width - 80, 35 + i * 20);
        }
    }

    public static void main(String[] args) {
        PApplet.main("BarGraph");
    }
}
*/