public class Cat extends Animal{
    protected String Color;
    Cat (String food, String location, String breed){
        this.food = food;
        this.location = location;
        this.Color = Color;
    }
    @Override
    public void makeNoise(){
        System.out.println("Кошка мяукает");
    }
    @Override
    public void eat(){
        System.out.println("Кошка питается");
    }
}
