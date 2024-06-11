package Lesson13;

public class Bird extends Pet implements Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void saySomething() {
        System.out.println("I'm bird");
    }

    @Override
    public void eat() {
        System.out.println("I'm eat grain");
    }
}
