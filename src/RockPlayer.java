
public class RockPlayer extends Player {

	@Override
	public String getName() {
		return "The Jets";
	}
	
	
	@Override
	public Roshambo generateRoshambo() {
		Roshambo[] roshambo = Roshambo.values();
		System.out.println(roshambo[0]);
		return roshambo[0];
		
	}


	

}
