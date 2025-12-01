import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        PlayerStack playerStack = new PlayerStack();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Valorant agent names
        String[] valorantAgents = {
                "Jett", "Raze", "Phoenix", "Neon", "Yoru",
                "Reyna", "Chamber", "Killjoy", "Cypher", "Sova",
                "Fade", "Skye", "Breach", "Viper", "Astra",
                "Omen", "Brimstone", "Harbor", "Iso", "Clove",
                "Gekko", "Sage", "Deadlock", "Kay/O"
        };

        int gameCount = 0;

        System.out.println("=== STACK-BASED MATCHMAKING (VALORANT AGENTS ONLY) ===");
        System.out.println("Press ENTER to simulate each turn.");

        while (gameCount < 10) {
            scanner.nextLine(); // wait for ENTER

            int newPlayers = rand.nextInt(7) + 1; // 1–7 players
            System.out.println("\n--- NEW TURN ---");
            System.out.println(newPlayers + " agents joined the stack.");


            for (int i = 0; i < newPlayers; i++) {
                String randomAgent = valorantAgents[rand.nextInt(valorantAgents.length)];
                playerStack.push(randomAgent);
            }

            System.out.println("Agents in stack: " + playerStack.size());
            System.out.println(playerStack.getStack());


            if (playerStack.size() >= 5) {
                System.out.println("\n>>> A GAME HAS STARTED");

                System.out.print("Agents in this match: ");

                for (int i = 0; i < 5; i++) {
                    System.out.print(playerStack.pop() + " ");
                }

                System.out.println("\nGame Created Successfully!");
                gameCount++;
                System.out.println("Total Games Created: " + gameCount);
            }

            System.out.println("------------------------------");
        }

        System.out.println("\n=== MATCHMAKING COMPLETE: 10 GAMES MADE ===");
    }
}
