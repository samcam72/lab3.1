public class Lion extends Animal {

    public Lion(String name) {
        super(name, "Lion");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Lion says: Roar!");
    }
}
