public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Pace Bus", "j23568", 60000, 15);
        PassengerCar pc = new PassengerCar("mercury", "j23569", 60000, true);
        Truck truck = new Truck("Pace Bus", "j23570", 60000, 16);

        bus.move();
        pc.move();
        truck.move();

        Inventory inv = new Inventory();
        inv.addVehicle(bus);
        inv.addVehicle(pc);
        inv.addVehicle(truck);
        System.out.println();
        inv.printAll();

        System.out.println();
        inv.removeVehicleVin("j23569");
        inv.printAll();

    }
}
