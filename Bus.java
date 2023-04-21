public class Bus extends Vehicle{
    private int seatNumber;
    public Bus(String name, String vinNumber, int mileage, int seatNumber){
        super(name, vinNumber, mileage);
        this.seatNumber = seatNumber;

    }
    @Override
    public void move(){
        System.out.println("Bus is moving!");
    }
}
