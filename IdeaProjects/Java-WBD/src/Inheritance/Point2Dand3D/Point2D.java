package Inheritance.Point2Dand3D;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point2D(){}
    public Point2D(float x, float y){
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
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = {x,y};
        return arr;
    }

    @Override
    public String toString(){
        return "(" + x +","+ y+")";
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.5f,5.5f);
        System.out.println(point2D);
    }
}

class Point3D extends Point2D{
    private float z;
    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.z = y;
        this.z = z;
    }

    public void getXYZ(){
        float[] arr1 = {x, y, z};
    }

    @Override
    public String toString(){
        return "( " +super.getX()+", " + super.getY()+", " + z + " )";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(2.5f, 5.5f, 8.5f);
        System.out.println(point3D);

    }
}
