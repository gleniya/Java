package JavaAccentureFinal.module10.activity3;

public class InvalidInputException extends Exception{

    @Override
    public String getMessage() {
        return ("Invalid inputs: ");
    }
}
