
public abstract class Player {

	public String name;
	public String response;
	
	
	/*public String getName(){
		return name;
	}
	
	public String getResponse(){
		return response;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setResponse(String response){
		this.response = response;
	}*/
	
	public abstract String getName();
	public abstract Roshambo generateRoshambo();
	

	
}


