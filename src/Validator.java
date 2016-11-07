import java.util.Scanner;

public class Validator {
	
	public static String getString(String prompt){
        
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.print(prompt);
        name = sc.next();
        while (name == ""){ 

	        System.out.print(prompt);
	        name = sc.next();
	        
        }
        
        return name;
	}
	
	public static String getYesNo(String prompt){
		Scanner sc = new Scanner(System.in);
		String s = "";
		
		System.out.print("Continue? (y/n)");
        s = sc.next();
        if (s != "y" && s != "n"){
        	
            System.out.println("Please enter y or n: ");
            s = sc.next();

        }
        return s;
 }
}
