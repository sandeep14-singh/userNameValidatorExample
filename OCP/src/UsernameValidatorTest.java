import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class UsernameValidatorTest {

	@Test
	public void testUserName(){
		String userName = "test user name";		
		int numOfValidatorsToMock = new Random().nextInt(100) + 1;
		Set<Validator> validators = new HashSet<>();
		boolean expectedValidationsOutcome = true;
		
		for(int i = 0; i < numOfValidatorsToMock; i++){
			Validator validator = Mockito.mock(Validator.class);
			boolean mockedValidatorOutCome = new Random().nextBoolean();
			Mockito.when(validator.performValidation(userName)).thenReturn(mockedValidatorOutCome);
			validators.add(validator);
			expectedValidationsOutcome = mockedValidatorOutCome ? expectedValidationsOutcome : false;
		}
		UsernameValidator usernameValidator = new UsernameValidator(validators);
		boolean actualValidationsOutcome = usernameValidator.validate(userName);
		assertEquals(expectedValidationsOutcome, actualValidationsOutcome);		
	}	
}
