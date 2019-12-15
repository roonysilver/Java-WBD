package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(){}

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminant() {
        double delta = b*b-4*a*c;
        return delta;
    }

    public double getRoot(){
        double r;
        return r = -b/(2*a);
    }

    public double getRoot1(double delta){
        double r1;
        return r1 = (-b + Math.sqrt(delta))/(2*a);
    }

    public double getRoot2(double delta){
        double r2;
        return r2 = (-b - Math.sqrt(delta))/(2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();
        if(delta > 0){
            System.out.println("r1 :" + equation.getRoot1(delta));
            System.out.println("r2 :" + equation.getRoot2(delta));
        } else if (delta == 0){
            System.out.println("r :" + equation.getRoot());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
