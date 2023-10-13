package task.validatePin;

public class PinValidator {
    public boolean validator(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
