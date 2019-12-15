package AbtractandInterface.Resizeable;

import Inheritance.Circle.Circle;

public class TestResizeableCircle {
    public static void main(String[] args) {
        resizeableCircle[] circle = new resizeableCircle[3];
        circle[0] = new resizeableCircle(50);
        circle[1] = new resizeableCircle(50);
        circle[2] = new resizeableCircle(50);

        System.out.println("Random circle:");
        for (Circle circles : circle){
            System.out.println(circles);
        }

        circle[0].resize(Math.random()*100);
        circle[1].resize(Math.random()*100);
        circle[2].resize(Math.random()*100);
        System.out.println("After");
        for (Circle circles : circle) {
            System.out.println(circles);
        }

    }

}
