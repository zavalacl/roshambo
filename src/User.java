

public class User extends Player{

	@Override
	public String getName(){
		return this.name;
	}

	@Override
	public Roshambo generateRoshambo() {

		if (response == "r" || response == "p" || response == "s") {
			switch (response) {
			case "r":
				return Roshambo.ROCK;
			case "p":
				return Roshambo.PAPER;
			case "s":
				return Roshambo.SCISSORS;
			}
		}
		return generateRoshambo();
	}


}

