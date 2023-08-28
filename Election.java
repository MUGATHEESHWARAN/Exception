package customException;

public class Election {
	public static void main(String[]args) throws AgeException {
		try {
		
		int age = 12;
		if(age<18) {
			throw new AgeException("age is not Eligible");
		}
		else {
			System.out.println("eligible");
		}
	
		System.out.println("Election end");
	}
		catch(AgeException ec) {
			
			System.out.println(ec.getMessage());
			System.out.println(ec);
		}
		System.out.println("Election End");
		System.out.println("Finished Election");
	}
}