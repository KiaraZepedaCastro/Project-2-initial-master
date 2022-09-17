package com.csc205.project2;

public class Cylinder extends Shape{

    private double height;
    private double radius;

    public Cylinder(){
        super();
        this.height = 0;
        this.radius = 0;
    }

    public Cylinder(double v, double v1){
        super();
        this.height = v;
        this.radius= v1;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return (2.0 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    public double volume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public int faces(){
        return 2;
    }
    public int edges() {
        return 0;
    }
    public int vertices() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append(", faces=").append(faces());
        sb.append(", edges=").append(edges());
        sb.append(", vertices=").append(vertices());
        sb.append('}');
        return sb.toString();
    }
}
