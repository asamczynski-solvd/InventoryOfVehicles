public class PassengerCar extends Vehicle{
    private boolean hasTrunk;

    public PassengerCar(String name, String vinNumber, int mileage, boolean hasTrunk){
        super(name, vinNumber, mileage);
        this.hasTrunk = hasTrunk;
    }
    @Override
    public void move(){
        System.out.println("Passenger car is moving!");
    }
}
