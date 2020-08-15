
public class MinLengthValidator  implements Validator{
	public boolean performValidation(String userName){
		return  userName.length() > 5;
	}
}
