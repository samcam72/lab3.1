public class ZooTest {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Mystery", "Unknown");
        Lion simba = new Lion("Simba");
        Elephant dumbo = new Elephant("Dumbo");

        genericAnimal.makeSound();
        simba.makeSound();
        dumbo.makeSound();
    }
}
