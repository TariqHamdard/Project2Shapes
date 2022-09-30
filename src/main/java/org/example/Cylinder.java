package org.example;

public class Cylinder extends Shape{

    private double height;
    private double radius;

    public Cylinder() {
        super();
        this.radius = 1.0;
        this.height = 4.0;
    }

    public Cylinder(double v, double v2) {
        super();
        this.radius = v;
        this.height = v2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 2.0 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2.0) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}


