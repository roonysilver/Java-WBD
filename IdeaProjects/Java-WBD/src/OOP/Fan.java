package OOP;

public class Fan {
    final int SLOW = 1;
    final int MEDIuM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "Blue";
    public Fan(){}

    public Fan(int speed, double radius, String color, boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }


    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public boolean isOn() {

        return on;
    }

    public void setOn(boolean on) {

        this.on = on;
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

    public String toString(){
        if(this.on){
            return "Fan is on," + " speed : " + getSpeed() + " Color : " + getColor() + ", radius : " + getRadius();
        }
        return "Fan is off," + " Color : " + getColor() + ", radius : " + getRadius();
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(1);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setColor("Blue");
        fan2.setRadius(5);
        fan2.setOn(false);

        System.out.println(fan1);
        System.out.println(fan2);
    }



}
