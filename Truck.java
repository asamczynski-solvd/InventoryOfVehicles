public class Truck extends Vehicle{
    private int numberOfWheels;
    public Truck(String name, String vinNumber, int mileage, int numberOfWheels){
        super(name, vinNumber, mileage);
        this.numberOfWheels = numberOfWheels;

    }
    @Override
    public void move(){
        System.out.println("Truck is moving!");
    }
}
