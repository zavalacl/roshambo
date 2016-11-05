

public class RoshamboApp {

	public static void main(String[] args) {
		ComputerPlayer cp = new ComputerPlayer();
		RockPlayer rp = new RockPlayer();
		User up = new User();
		
		up.getName();
		up.generateRoshambo();
		
		cp.getName();
		cp.generateRoshambo();
		
		rp.getName();
		rp.generateRoshambo();
		

		
		
		

	}

}
