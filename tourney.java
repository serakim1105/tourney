import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class tourney {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> players = inputPlayers(scanner);
        Collections.shuffle(players);
        System.out.println("\nWinner: " + players.get(0));
        scanner.close();
    }

    // Add player to the list of players
    private static List<String> inputPlayers(Scanner scanner) {
        List<String> players = new ArrayList<>();
        while (true) {
            System.out.print("Player Name: ");
            String player = scanner.nextLine();
            if (player.isEmpty()) {
                break;
            }
            players.add(player);
        }
        return players;
    }
}
