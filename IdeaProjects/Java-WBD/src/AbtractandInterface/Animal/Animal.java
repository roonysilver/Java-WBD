package AbtractandInterface.Animal;

public abstract class Animal {
    public abstract String makeSound();
}

class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: Roarrrrrr";
    }
}

class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cluck-cluck";
    }

    @Override
    public String howToEat(){
        return "Could be Fried";
    }
}

interface Edible {
    String howToEat();
}

abstract class Fruit implements Edible{}

class Apple extends Fruit{
    @Override
    public String howToEat(){
        return "Apple could be sliced";
    }
}

class Orange extends Fruit{
    @Override
    public String howToEat(){
        return "Orange could be juiced";
    }
}


class AbtractInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken)animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
