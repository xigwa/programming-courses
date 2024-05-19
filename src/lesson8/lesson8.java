package lesson8;

public class lesson8 {
    public static void main(String[] args) {
        Dog hasky = new Dog();
        Owner xigwa = new Owner();
        hasky.name = "Hasky";
        xigwa.dog = hasky;

        xigwa.setNewName("shark");

    }
}
