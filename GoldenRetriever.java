public class GoldenRetriever extends Dog {
    public GoldenRetriever(String name, String description, double price) {
        super(name, description, price);

    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public String getBreed() {
        return ("Golden Retriever");
    }
}
