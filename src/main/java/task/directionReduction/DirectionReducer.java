package task.directionReduction;

public class DirectionReducer {
//stack
    public String[] dirReduc(String[] arr) {
        int newSize = 0;
        String[] reducedArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String opposite = getOpposite(arr[i]);
            boolean pairFound = false;

            if (i + 1 < arr.length && arr[i + 1].equals(opposite)) {
                i++;
                pairFound = true;
            }

            if (!pairFound) {
                reducedArr[newSize] = arr[i];
                newSize++;
            }
        }

        String[] result = new String[newSize];
        System.arraycopy(reducedArr, 0, result, 0, newSize);

        if (newSize < arr.length) {
            return dirReduc(result);
        }

        return result;
    }



    private String getOpposite(String word) {
        switch (word) {
            case "NORTH" -> {
                return "SOUTH";
            }
            case "EAST" -> {
                return "WEST";
            }
            case "SOUTH" -> {
                return "NORTH";
            }
            case "WEST" -> {
                return "EAST";
            }
            default -> {
                return word;
            }
        }

    }
}
