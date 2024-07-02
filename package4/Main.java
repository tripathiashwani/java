package package4;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Outputs: Woof
        dog.sleep();      // Outputs: Zzz...
        System.out.println(dog.val);
    }
}