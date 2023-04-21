public abstract class Vehicle implements IDrive{
    protected String name;
    protected String vinNumber;

    protected int mileage;
    public static final boolean HAS_TRANSMISSION = true;


    public Vehicle(String name, String vinNumber, int mileage) {
        this.name = name;
        this.vinNumber = vinNumber;
        this.mileage = mileage;
    }

    public void updateMileage(int milesTravelled){
        mileage += milesTravelled;
    }

    @Override
    public String toString() {
        return ("name: " + name +
                ", vinNumber: " + vinNumber +
                ", mileage: " + mileage);
    }
    @Override
    public abstract void move();
}
