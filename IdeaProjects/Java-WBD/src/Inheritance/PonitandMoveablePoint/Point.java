package Inheritance.PonitandMoveablePoint;

public class Point {
    public float x;
    public float y;

    public Point(){}

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
    }

    public float[] getXY(){
        float[] arr = {x, y};
        return arr;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y +")";
    }
}

class MoveablePoint extends Point {
    public float xspeed = 0.0f;
    public float yspeed = 0.0f;

    public MoveablePoint(){
    }

    public MoveablePoint(float xspeed, float yspeed){
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MoveablePoint(float x, float y, float xspeed, float yspeed){
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public void setSpeed(float xspeed, float yspeed){
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float[] getSpeed(){
        float[] arr = {xspeed, yspeed};
        return arr;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")" + "speed=" + "("+ xspeed + "," + yspeed+")";
    }

    public MoveablePoint move() {
        x += xspeed;
        y += yspeed;
        return  this;
    }
}

class Tester {
    public static void main(String[] args) {
        Point point = new Point(2.5f,3.5f);
        System.out.println(point);

        MoveablePoint moveablepoint = new MoveablePoint(2.5f,3.5f,1.5f, 2.5f);
        System.out.println(moveablepoint);
        System.out.println(moveablepoint.move());
        System.out.println(moveablepoint.move());
    }
}