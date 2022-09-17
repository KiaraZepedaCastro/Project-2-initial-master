package com.csc205.project2;

public class Cube extends Shape {

    private double width;

    public Cube(){
        super();
        this.width = 0.0;
    }

    public Cube(double v) {
        super();
        this.width = v;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double surfaceArea(){
        return 6.0 * Math.pow(width, 2);
    }

    public double volume(){
        return Math.pow(width,3);
    }

    public int faces(){
        return 6;
    }
    public int edges() {
        return 12;
    }
    public int vertices() {
        return 8;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append(", faces=").append(faces());
        sb.append(", edges=").append(edges());
        sb.append(", vertices=").append(vertices());
        sb.append('}');
        return sb.toString();
    }

}
