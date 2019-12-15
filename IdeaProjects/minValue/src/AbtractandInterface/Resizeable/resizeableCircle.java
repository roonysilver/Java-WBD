package AbtractandInterface.Resizeable;

import Inheritance.Circle.Circle;

public class resizeableCircle extends Circle implements Resizeable {

    public resizeableCircle(){};

    public resizeableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(double percent) {
        radius = radius + radius*(percent/100) ;
    }
}
