
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        ArrayList<Game> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);

                list.add(new Game(team1, team2, score1, score2));

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team: ");
        String team = scan.nextLine();

        int totalGamesTeam = 0;
        int totalGamesWon = 0;
        int totalGamesLost = 0;
        for (Game game : list) {
            if (game.getHomeTeam().equals(team) || game.getAwayTeam().equals(team)) {
                totalGamesTeam++;
            }
        }

        for (Game game : list) {
            if (game.getHomeTeam().equals(team) && game.winningTeam().equals(team)
                    || game.getAwayTeam().equals(team) && game.winningTeam().equals(team)) {
                totalGamesWon++;
            } else if (game.getHomeTeam().equals(team) && game.losingTeam().equals(team)
                    || game.getAwayTeam().equals(team) && game.losingTeam().equals(team)){
                totalGamesLost++;
            }
        }

        System.out.println("Games: " + totalGamesTeam);
        System.out.println("Wins: " + totalGamesWon);
        System.out.println("Losses: " + totalGamesLost);

    }

}
