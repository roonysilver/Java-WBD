package Inheritance.Circle;

import java.security.PublicKey;

public class Circle {
    public double radius = 1.0;
    private String color = "yellow";
    private boolean filled = true;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "A circle with radius = "
                + radius
                +" , color: "+color
                +" and "
                +(isFilled()? "filled" : " unfilled")
                +" with area is: "+ getArea();
    }
}

class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, double height, String color, boolean filled){
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString(){
        return "A cylinder with radius: "
                + getRadius()
                + " and height is " + height
                +" with color "
                +getColor()
                + (isFilled()? " filled " : " unfilled ")
                + " with volume is: " + getVolume();
    }
}

class Tester{
    public static void main(String[] args) {
        Circle circle = new Circle(2.5,"red",true);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(2.5,5,"white",false);
        System.out.println(cylinder);
    }
}
