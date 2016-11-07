import java.util.Scanner;
public class User extends Player {
    static Scanner scan = new Scanner(System.in);
    static String name;
    static String opponent;
    public static void setName(){
        System.out.print("Enter your name: ");
        name = Validator.getString("Enter your name: ");
        /*name = scan.nextLine();*/
    }
    public static char setOpponent(){
        char firstLetter ='a';
        boolean isValid = false;
        while (isValid == false){
        System.out.print("\nWould you like to play against The Rock or Bob (r/b)?: ");
        opponent = scan.nextLine();
        opponent = opponent.toLowerCase();
        firstLetter = opponent.charAt(0);
        if (firstLetter != 'r' && firstLetter != 'b' && firstLetter != 't'){
            System.out.println("\n**Please enter The Rock or Bob.**");
        }
        else{
            isValid = true;}
        }
        return firstLetter;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public Roshambo generateRoshambo() {
        boolean isValid = false;
        while (isValid == false){
    System.out.print("\nRock, Paper, Scissors?: ");
    String input = scan.nextLine();
    input = input.toUpperCase();
    char firstLetter = input.charAt(0);
    if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
        switch (firstLetter) {
        case 'R':
            return Roshambo.ROCK;
        case 'P':
            return Roshambo.PAPER;
        case 'S':
            return Roshambo.SCISSORS;
        }}
        else if(firstLetter != 'R' || firstLetter != 'P' || firstLetter != 'S'){
            System.out.println("\n**Please enter rock, paper, or scissors.**");
        }
        else 
            isValid = true;
    }
    return generateRoshambo();
    }
}