package com.csc205.project2;

public class Cone extends Shape{

    private double height;
    private double radius;

    public Cone(){
        super();
        this.height = 0;
        this.radius = 0;
    }

    public Cone(double v, double v1){
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
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    public double volume(){
        return Math.PI * Math.pow(radius, 2) * (height/3);
    }

    public int faces(){
        return 1;
    }
    public int edges() {
        return 0;
    }
    public int vertices() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
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
