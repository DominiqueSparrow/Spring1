package app.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
	
	@Mock
	MainOrderEntryCommandPT form;
	
	@Mock 
	MainOrderEntryCommandPT.Payment p;
	
	@Mock
	MainOrderEntryCommandPT.DebitCard debit;
	
	PreudoValidator validator = new PreudoValidator();
	
	
	@Test
	public void test() {
		System.out.println("OK");
		Mockito.when(debit.getAmount()).thenReturn(1300f);
		
		Mockito.when(p.getFinactialEntityName()).thenReturn("BZ WBK");
		Mockito.when(p.getPreauthorisationNumber()).thenReturn("12111x");
		
		Mockito.when(form.getPayment()).thenReturn(p);
		Mockito.when(form.getDebitCard()).thenReturn(debit);
		
		validator.validate(form);
	}

}
