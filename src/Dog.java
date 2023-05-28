public class Dog extends Animal{
    protected String breed;
    Dog (String food, String location, String breed){
        this.food = food;
        this.location = location;
        this.breed = breed;
    }
    @Override
    public void makeNoise(){
        System.out.println("Собака лаит");
    }
    @Override
    public void eat(){
        System.out.println("Собака кушает");
    }
}
