import java.util.HashSet;

public class SetPet
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Felidae", "Smoky", "Nora");
        Cat cat2 = new Cat("Felidae", "Purple", "Melissa");
        Cat cat3 = new Cat("Felidae", "Blue", "Kassandra");
        Dog dog1 = new Dog("Canidae", "Dalmatian", "Weiss");
        Dog dog2 = new Dog("Canidae", "Black", "Berg");
        Dog dog3 = new Dog("Canidae", "Brown", "Rich");

        HashSet<String> pets = new HashSet<>();
        pets.add(String.valueOf(cat1));
        pets.add(String.valueOf(cat2));
        pets.add(String.valueOf(cat3));
        pets.add(String.valueOf(dog1));
        pets.add(String.valueOf(dog2));
        pets.add(String.valueOf(dog3));

        pets.forEach(System.out::println);
    }
}
