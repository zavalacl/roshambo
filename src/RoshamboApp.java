import java.util.Scanner;
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userScore = 0;
        int compScore = 0;
        int draws = 0;
        String cont = "y";
        System.out.println("Welcome to Rock Paper Scissors!\n");
        User.setName();
        char firstLetter = User.setOpponent();
        
        while (cont.equalsIgnoreCase("y")) {
            Player user = new User();
            Player rock = new RockPlayer();
            Player comp = new ComputerPlayer();
            Roshambo usermove = user.generateRoshambo();
            Roshambo opponentMove;
            String opponent;
            if (firstLetter == 'b') {
                opponent = comp.getName();
                opponentMove = comp.generateRoshambo();
            } else {
                opponent = rock.getName();
                opponentMove = rock.generateRoshambo();
            }
            System.out.println("\n" + user.getName() + ": " + usermove);
            System.out.println(opponent + ": " + opponentMove + "\n");
            
            if (usermove == opponentMove) {
                System.out.println("Draw!");draws++;
            } else if (usermove == Roshambo.PAPER && opponentMove == Roshambo.SCISSORS) {
                System.out.println(opponent + " Wins");
                compScore++;
            } else if (usermove == Roshambo.PAPER && opponentMove == Roshambo.ROCK) {
                System.out.println(user.getName() + " Wins");
                userScore++;
            } else if (usermove == Roshambo.SCISSORS && opponentMove == Roshambo.ROCK) {
                System.out.println(opponent + " Wins!");
                compScore++;
            } else if (usermove == Roshambo.SCISSORS && opponentMove == Roshambo.PAPER) {
                System.out.println(user.getName() + " Wins!");
                userScore++;
            } else if (usermove == Roshambo.ROCK && opponentMove == Roshambo.PAPER) {
                System.out.println(opponent + " Wins");
                compScore++;
            } else if (usermove == Roshambo.ROCK && opponentMove == Roshambo.SCISSORS) {
                System.out.println(user.getName() + " Wins");
                userScore++;
            }
            cont = Validator.getYesNo("\nPlay again? (y/n): ");
            /*System.out.print("\nPlay again? (y/n): ");
            cont = scan.nextLine();*/
        }
        
        if(firstLetter == 't' || firstLetter == 'r'){
        System.out.println("\nYou won " + userScore + " time(s)!");
        System.out.println("The Rock won " + compScore + " times(s)!");
        System.out.println("There were "+draws+"draw(s)!");
        }
        else{
            System.out.println("\nYou won " + userScore + " time(s)!");
            System.out.println("Bob won " + compScore + " times(s)!");
            System.out.println("There were "+draws+" draw(s)!");
        }
        scan.close();
    }
}