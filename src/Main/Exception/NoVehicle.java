package Main.Exception;

public class NoVehicle extends InvalidTrip{
    @Override
    public String toString() {
        return "There isn't any vehicles with this id ";
    }
}
