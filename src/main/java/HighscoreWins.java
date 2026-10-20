import java.util.Scanner;

public class HighscoreWins {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the game score: ");
        String userInputScore = read.nextLine();
        String winningTeamName = getWinningTeamName(userInputScore);
        System.out.println("Winner: " + winningTeamName);

    }

    public static String getWinningTeamName (String userInputScore) {

        // Get the individual scores and store in variables.
        String[] scoreNumbersSplit = userInputScore.split("\\|");
        // scoreNumbersSplit[0] = "Home:Visitor"
        // scoreNumbersSplit[1] = "21:9"
        String[] scoreNumbers = scoreNumbersSplit[1].split(":");
        // scoreNumbers = ["21", "9"]
        int homeScore = Integer.parseInt(scoreNumbers[0]);
        int visitorScore = Integer.parseInt(scoreNumbers[1]);

        // Get the individual team names and store in variables.
        String[] scoreNames = scoreNumbersSplit[0].split(":");
        // scoreNames = ["Home", "Visitor"]
        String homeTeamName = scoreNames[0];
        String visitorTeamName = scoreNames[1];

        // Declare winning team name variable.
        String winningTeamName;

        if (homeScore > visitorScore) {
            winningTeamName = homeTeamName;
        } else if ( visitorScore > homeScore) {
            winningTeamName = visitorTeamName;
        }
        else {
           winningTeamName = "Tie!";
        }

        return winningTeamName;
    }
}
