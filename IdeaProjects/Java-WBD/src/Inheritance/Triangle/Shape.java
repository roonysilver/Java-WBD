package Inheritance.Triangle;

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
        return " A shape with color of "
                + getColor()
                +" and "
                + (isFilled()? "filled" : "Not filled");
    }
}

class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public double getArea(){
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p - side1)*(p - side2)*(p - side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1= " + side1 +
                ", side2= " + side2 +
                ", side3= " + side3 +
                '}' + " with perimeter =" + getPerimeter() + " and Area =" + getArea() + super.toString();
    }
}

class Tester {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 2, 3, "red", false);
        System.out.println(triangle);
    }
}
