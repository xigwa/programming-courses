package Lesson13;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(6, 3);
        Shape triangle = new Triangle(6, 5);

        System.out.println("Площа кола: " + circle.calculateArea());
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());
        System.out.println("Площа трикутника: " + triangle.calculateArea());

        Pet dog = new Dog("Dog", 5);
        Pet cat = new Cat("Cat", 3);
        Pet bird = new Bird("Bird", 2);

        dog.showInfo();
        dog.saySomething();
        dog.eat();
        cat.showInfo();
        cat.saySomething();
        cat.eat();
        bird.showInfo();
        bird.saySomething();
        bird.eat();

    }
}
