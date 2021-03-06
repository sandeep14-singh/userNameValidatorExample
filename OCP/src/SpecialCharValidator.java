
public class SpecialCharValidator  implements Validator{
	public boolean performValidation(String userName){
		String[] specialChars = {"@", "!", ".", "&"};
		for(String specialChar : specialChars){
			if(userName != null && userName.contains(specialChar))
				return false;
		}
		return true;
	}
}
