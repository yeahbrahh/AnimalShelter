// the "main" class for the program
public class Main {
    public static void main(String args[]) {
        AdoptableAnimal[] animals = new AdoptableAnimal[] {
                new Cat("Billy", "He sucks", 200000),
                new Cat("Not Billy", "Way better than billy", 2),
                new GoldenRetriever("Jimbo", "Wow!", 200),
                new Pitbull("Rough", "The best", 20)
        };

        for (AdoptableAnimal animal : animals) {
            String animalType;
            if (animal instanceof Cat) {
                animalType = "cat";
            } else {
                animalType = "dog";
            }
            System.out.println("Adopting out a " + animalType
                    + "\nTheir name is " + animal.getName()
                    + "\nThey cost " + animal.getPrice()
                    + "\nOur staff describes them as: " + animal.getDescription());

            if (animal instanceof Dog) {
                System.out.println("The dog's breed is " + ((Dog) animal).getBreed());
            }
        }
    }
}
