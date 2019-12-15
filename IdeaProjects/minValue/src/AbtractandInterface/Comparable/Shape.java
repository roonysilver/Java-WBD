package AbtractandInterface.Comparable;

public class Shape {
    private String color = "blue";
    private boolean filled = true;

    public Shape(){}

    public Shape(String color,boolean filled){
        this.color = color;
        this.filled= filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "A shape with color of"
                + getColor()
                +" and "
                + (isFilled()? "filled" : "Not filled");
    }
}

class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "A circle with radis"
                + radius
                + " , which is subclass of"
                + super.toString();
    }
}
