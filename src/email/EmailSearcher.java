package email;

public class EmailSearcher {
	String[] emails =  { 
			"example@yahoo.com", 
			"example@google.com",
			"user@domain.com", 
			"user@domain.co.in", 
			"user.name1@domain.com", 
			"user_name1@domain.com", 
			"user@yahoo.corporate.in"
	};


	public boolean SearchEmail(String emailToSearch) {

		for (String email : emails) {
			if (email.contentEquals(emailToSearch)) {
				return true;
			}
		}
		return false;
	}
}