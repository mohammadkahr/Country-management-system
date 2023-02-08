package Main.Exception;

public class NoTerminal extends InvalidTrip{
    @Override
    public String toString() {
        return "There isn't terminal with this name ";
    }
}
