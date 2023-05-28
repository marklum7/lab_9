public class Main {
    public static void main(String[] args) {
        Dog Dog = new Dog("meat","yard","beagle");
        Cat Cat = new Cat("fish","city","ginger");
        Horse Horse = new Horse("grass","field","thoroughbred");
        vet vet = new vet();
        vet.treatAnimal(Dog);
        vet vet2 = new vet();
        vet2.treatAnimal(Cat);
        vet vet3 = new vet();
        vet3.treatAnimal(Horse);
    }
}