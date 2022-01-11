package day40_exceptions;

public class RunnerCheckedException {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		String eMail="emre@gsamail.com";
		mailDogrula( eMail);
 
	}

	public static void mailDogrula(String eMail) throws InvalidEmailIdCheckedException {
		
		if(eMail.contains("@gmail.com") || eMail.contains("@hotmail.com")) {
			System.out.println(eMail);
		}else {
			throw new InvalidEmailIdCheckedException("e-mail uygun degil");
		}
		
	}

}
