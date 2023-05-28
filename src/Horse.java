public class Horse extends Animal{
    protected String origin;
    Horse (String food, String location, String breed){
        this.food = food;
        this.location = location;
        this.origin = origin;
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
