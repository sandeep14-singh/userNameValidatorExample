import java.util.Set;

public class UsernameValidator {

	private Set<Validator> validators;
	
	public UsernameValidator(Set<Validator> validators){
		this.validators = validators;
	}	
	
	public boolean validate(String userName){
		boolean isValidUser = true;
		for(Validator validator : validators){
			if(!validator.performValidation(userName)){
				isValidUser = false;	
				break;
			}
		}
		return isValidUser;		
	}

}
