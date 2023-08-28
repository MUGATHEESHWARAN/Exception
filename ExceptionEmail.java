package customException;

public class ExceptionEmail {
	public static void main(String[]args) throws EmailException {
		try {
		String mail = "mugatheeshwaran@ymail.com";
		if(mail.endsWith("@gmail.com")) {
			throw new EmailException("is Gmail");
		}
		else {
			System.out.println("is not Gmail");
		}
			
		}
		catch(EmailException ec) {
			ec.printStackTrace();
		}
		}
	}


