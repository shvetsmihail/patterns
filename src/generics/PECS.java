package generics;

import java.util.ArrayList;
import java.util.List;

public class PECS {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        List<Object> list = new ArrayList<>();

        producer(dogs);
        producer(cats);
        producer(pets);

        consumer(animals);
        consumer(pets);
        consumer(list);

    }

    private static void producer(List<? extends Pet> pets) {
        Pet pet = pets.get(0);


    }

    private static void consumer(List<? super Pet> pets) {
        pets.add(new Pet());
        pets.add(new Cat());
        pets.add(new Dog());
    }




    private static class Animal {

    }

    private static class Pet extends Animal {

    }

    private static class Cat extends Pet {

    }

    private static class Dog extends Pet {

    }
}
