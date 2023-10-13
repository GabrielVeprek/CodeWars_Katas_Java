package task.tenMinutesWalk;

public class TenMinutesWalkImpl {

    public boolean isValid(char[] input) {
        if (input.length != 10) {
            return false;
        }
        var verticalSteps = 0;
        var horizontalSteps = 0;

        for (char direction : input) {
            switch (direction) {
                case 'n' -> verticalSteps++;
                case 's' -> verticalSteps--;
                case 'w' -> horizontalSteps++;
                case 'e' -> horizontalSteps--;
                default -> {
                    return false;
                }
            }
        }
        return verticalSteps == 0 && horizontalSteps == 0;
    }
}

