package Lesson13;

abstract class Pet implements Animal {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
