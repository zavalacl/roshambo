import java.util.Random;

public class ComputerPlayer extends Player{

	
	@Override
	public String getName() {
		return "The Sharks";
	}
	
	@Override
	public Roshambo generateRoshambo() {
		Roshambo[] roshambo = Roshambo.values();
		Random random = new Random();
		int index = random.nextInt(roshambo.length);
		System.out.println(roshambo[index]);
		return roshambo[index];
		
	}

	





}
