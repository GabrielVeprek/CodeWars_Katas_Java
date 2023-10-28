package task.goodVersusEvil;

public class BattleCalculator {

    private static int getAmountInt(String troopStrength, int troopAmount, int team) {
        int multiplier = 1;

        String[] evilUnit = troopStrength.split(" ");

        for (int i = 0; i < evilUnit.length; i++) {
            var string = evilUnit[i];
            var currentUnit = Integer.parseInt(string);
            multiplier = getMultiplier(i, multiplier, team);
            troopAmount = troopAmount + (currentUnit * multiplier);
        }
        return troopAmount;
    }

    private static int getMultiplier(int i, int multiplier, int team) {

        if (team == 0) {
            switch (i) {
                case 1 -> multiplier = 2;
                case 2 -> multiplier = 3;
                case 4 -> multiplier = 4;
                case 5 -> multiplier = 10;
            }
        }
        if (team == 1) {
            switch (i) {
                case 1 -> multiplier = 2;
                case 4 -> multiplier = 3;
                case 5 -> multiplier = 5;
                case 6 -> multiplier = 10;
            }
        }
        return multiplier;
    }

    public String predictWinner(String goodAmount, String evilAmount) {
        var evilAmountInt = 0;
        var goodAmountInt = 0;

        goodAmountInt = getAmountInt(goodAmount, goodAmountInt, 0);

        evilAmountInt = getAmountInt(evilAmount, evilAmountInt, 1);

        return goodAmountInt == evilAmountInt ? "Battle Result: No victor on this battle field" :
                evilAmountInt > goodAmountInt ? "Battle Result: Evil eradicates all trace of Good" : "Battle Result: Good triumphs over Evil";
    }

}
