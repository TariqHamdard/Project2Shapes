package org.example;

public class Cone extends Shape{
    private double slantHeight;
    private double radius;

    private double height;

    public Cone(){
        this.slantHeight = 5.0;
        this.radius = 4.0;
        this.height = 3.0;
    }

    public Cone(double v, double v2, double v3) {
        super();
        this.radius = v;
        this.slantHeight = v2;
        this.height = v3;
    }

    public double getSlantHeight() {
        return slantHeight;
    }

    public void setSlantHeight(double slantHeight) {
        this.slantHeight = slantHeight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {

        return  Math.PI * Math.pow(radius, 2) + Math.PI * radius * slantHeight;
    }

    public double volume() {
        return  (1.0/3.0) * Math.PI * Math.pow(radius, 2.0) + height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("Slant Height=").append(slantHeight);
        sb.append(", radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
