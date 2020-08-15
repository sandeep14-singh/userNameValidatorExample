import static org.junit.Assert.*;

import org.junit.Test;

public class MaxLengthValidatorTest {
	@Test
	public void testMaxLength(){
		String userName = "sandy14.singh";
		MaxLengthValidator maxLengthValidator = new MaxLengthValidator();
		boolean isValid = maxLengthValidator.performValidation(userName);
		assertTrue(isValid);
		
	}
}
