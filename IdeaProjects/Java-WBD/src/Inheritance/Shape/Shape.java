package Inheritance.Shape;

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

class Rectangle extends Shape{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(){}

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }

    @Override
    public String toString(){
        return "A Rectangle with width="
                + getWidth()
                + " and height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}

class Square extends Rectangle {

    public Square(){}

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width){
        setSide(width);
    }

    @Override
    public void setHeight(double height){
        setSide(height);
    }

    @Override

    public String toString(){
        return "A Square set side ="
                +getSide()
                +", is a subclass of "
                + super.toString();
    }
}

class Tester {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);


        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle= new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5,3.8,"orange",true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(2.3,"red",true);
        System.out.println(square);
    }
}


