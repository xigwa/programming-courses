package Lesson13;

public class Cat extends Pet implements Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void saySomething() {
        System.out.println("I'm cat");
    }

    @Override
    public void eat() {
        System.out.println("i'm eat fish");
    }
}
