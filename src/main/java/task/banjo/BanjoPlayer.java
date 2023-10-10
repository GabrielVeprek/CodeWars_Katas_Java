package task.banjo;


//Create a function which answers the question "Are you playing banjo?".
//If your name starts with the letter "R" or lower case "r", you are playing banjo!
public class BanjoPlayer {
    public String areYouPlayingBanjo(String name) {
        if (name.toLowerCase().charAt(0) == 'r') {
            return "Yes " + name + " plays banjo";
        }
        return "Nope " + name + " does not play banjo";
    }
}
