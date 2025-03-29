package application;



import java.util.*;



//Player Class

class Player {

 private String name;

 private String team;

 private int runs;

 private int wickets;



 public Player(String name, String team, int runs, int wickets) {

     this.name = name;

     this.team = team;

     this.runs = runs;

     this.wickets = wickets;

 }



 public String getName() { return name; }

 public String getTeam() { return team; }

 public int getRuns() { return runs; }

 public int getWickets() { return wickets; }



 public void displayPlayerInfo() {

     System.out.println("Player: " + name + ", Team: " + team + ", Runs: " + runs + ", Wickets: " + wickets);

 }

}



//IPL Management Class

class IPLManagement {

 private List<Player> playerList = new ArrayList<>();



 public void addPlayer(String name, String team, int runs, int wickets) {

     playerList.add(new Player(name, team, runs, wickets));

     System.out.println("Player added successfully!");

 }



 public void displayPlayers() {

     if (playerList.isEmpty()) {

         System.out.println("No players available.");

         return;

     }

     System.out.println("\nPlayer List:");

     for (Player player : playerList) {

         player.displayPlayerInfo();

     }

 }



 public void displayTopScorer() {

     if (playerList.isEmpty()) {

         System.out.println("No players to evaluate.");

         return;

     }

     Player topScorer = Collections.max(playerList, Comparator.comparingInt(Player::getRuns));

     System.out.println("\nTop Scorer: ");

     topScorer.displayPlayerInfo();

 }



 public void displayTopWicketTaker() {

     if (playerList.isEmpty()) {

         System.out.println("No players to evaluate.");

         return;

     }

     Player topWicketTaker = Collections.max(playerList, Comparator.comparingInt(Player::getWickets));

     System.out.println("Top Wicket Taker: ");

     topWicketTaker.displayPlayerInfo();

 }

}



//Main Class

public class IPLConsoleApp {

 public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     IPLManagement management = new IPLManagement();



     while (true) {

         System.out.println("1. Add Player");

         System.out.println("2. Display All Players");

         System.out.println("3. Show Top Scorer");

         System.out.println("4. Show Top Wicket Taker");

         System.out.println("5. Exit");

         System.out.print("Enter your choice: ");



         int choice = scanner.nextInt();

         scanner.nextLine();



         switch (choice) {

             case 1:

                 System.out.print("Enter Player Name: ");

                 String name = scanner.nextLine();

                 System.out.print("Enter Team Name: ");

                 String team = scanner.nextLine();

                 System.out.print("Enter Runs Scored: ");

                 int runs = scanner.nextInt();

                 System.out.print("Enter Wickets Taken: ");

                 int wickets = scanner.nextInt();

                 management.addPlayer(name, team, runs, wickets);

                 break;

             case 2:

                 management.displayPlayers();

                 break;

             case 3:

                 management.displayTopScorer();

                 break;

             case 4:

                 management.displayTopWicketTaker();

                 break;

             case 5:

                 System.out.println("Exiting... Thank you!");

                 System.exit(0);

             default:

                 System.out.println("Invalid choice. Please try again.");

         }

     }

 }

}