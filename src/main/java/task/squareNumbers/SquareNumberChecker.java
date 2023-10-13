package task.squareNumbers;

public class SquareNumberChecker {
    public boolean isSquare(int number) {

        var sqrtNumber = Math.sqrt(number);
        return 0 == (sqrtNumber - Math.floor(sqrtNumber));
    }
}
