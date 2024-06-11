package Lesson13;

public class Dog extends Pet implements Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void saySomething() {
        System.out.println("I'm dog");
    }

    @Override
    public void eat() {
        System.out.println("i'm eat meet");
    }
}
