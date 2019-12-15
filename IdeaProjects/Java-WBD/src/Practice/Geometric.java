package Practice;

public class Geometric {

//    Các trường dữ liệu
    private String color = "White";
    private String filled = null;

// khoi tao cac tu

    public Geometric(){}

    public Geometric(String color, String filled){
        this.color = color;
        this.filled = filled;
    }

//    cac thuoc tinh

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public String toString(){
        return "Created with "+ color + " color and" +
                (filled == null? " no fill" : "fill with " + filled + " color");
    }
}

class Circle extends Geometric {
//   mo rong truong
    private double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public  Circle(double radius, String color, String filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
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

    public double getDiameter(){
        return 2*radius;
    }

    public void printCircle(){
        System.out.println("the Color " + getColor() +" circle created with the radius is " + radius );
    }
}

class Rectangle extends Geometric{
    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, String filled, double width, double height){
        setColor(color);
        setFilled(filled);
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
}

class test {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.setFilled("Black");
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " +circle.getRadius());
        System.out.println("The perimeter is " + circle.getPerimeter());
        System.out.println("The Area is " + circle.getArea());
        System.out.println("the Diameter is " + circle.getDiameter());
        System.out.println();
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        System.out.println("The Area is " + rectangle.getArea());
        System.out.println();

    }
}