package OOP;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double Perimeter(){
        return (this.width+this.height)*2;
    }

    public String display(){
        return "Rectangle{" + "width= " + width + ", height = " + height + "}" ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        Rectangle rec = new Rectangle(width, height);
        System.out.println("Your Rectangle: \n" + rec.display());
        System.out.println("Perimeter of Rectangle: \n" + rec.Perimeter());
        System.out.println("Area of Rectangle: \n" + rec.getArea());
    }
}
