package Example;

public class WeightCheckingException extends Exception {

    public WeightCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào cân nặng: " + super.getMessage();
    }
}
