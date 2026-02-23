package chnu.edu.kn.ml;

public class Cone {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
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

    public double volume() {
        return (1.0/3.0) * Math.PI * radius * radius * height;

    }

    public double surfaceArea() {
        return Math.PI*radius*radius+Math.PI*radius*height;
    }

    public double getDiameter() {
        return 2*radius;
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    public double baseArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
