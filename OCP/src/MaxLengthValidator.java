
public class MaxLengthValidator implements Validator{
	public boolean performValidation(String userName){
		return userName != null && userName.length() < 20;
	}
}
