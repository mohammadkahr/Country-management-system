package Main.Exception;

public class MyOutOfBand extends RuntimeException{
    public String toString(){
        return "the number that you choose is out of band";
    }
}
