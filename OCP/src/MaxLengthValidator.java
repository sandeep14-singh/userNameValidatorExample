
public class MaxLengthValidator implements Validator{
	public boolean performValidation(String userName){
		return userName.length() < 20;
	}
}
