public abstract class Dog implements AdoptableAnimal {
    String breed;
    String name;
    String description;
    double price;


    public Dog(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


    public abstract String getBreed();

    public String getName() {
        return this.name;


    }

    public String getDescription() {
        return this.description;

    }

    public double getPrice() {
        return this.price;

    }
}
