import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Vehicle> vehicleList;

    public Inventory(){
        vehicleList = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    public void removeVehicleName(String name){
        for(Vehicle v: vehicleList){
            if(v.name.equals(name)){
                vehicleList.remove(v);
            }
        }
    }

    public void removeVehicleVin(String vinNumber){
        for(Vehicle v: vehicleList){
            if(v.vinNumber.equals(vinNumber)){
                vehicleList.remove(v);
            }
        }
    }
    public void printAll(){
        for(Vehicle v: vehicleList){
            System.out.println(v);
        }
    }
}
