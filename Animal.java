public class Animal {
    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void makeSound() {
        System.out.println(name + " the " + species + " makes a sound.");
    }
}



