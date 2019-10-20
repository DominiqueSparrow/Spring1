package app.dao;

import org.junit.Assert;

import app.dao.LoanEntryDAO.LoanEntity;

public class PreudoValidator {

	LoanEntryDAO loanEntryDAO = new LoanEntryDAO();

	public void validate(MainOrderEntryCommandPT command) {
		Assert.assertNotNull(command.getPayment());
		Assert.assertNotNull(command.getPayment().getPreauthorisationNumber());
		Assert.assertNotNull(command.getPayment().getFinactialEntityName());

		String bank = command.getPayment().getFinactialEntityName();
		Assert.assertTrue(command.getDebitCard().getAmount() > 1000);
		LoanEntity loanEntity = loanEntryDAO.getLoanEntryDoeBank(bank);
		Assert.assertNotNull(loanEntity);
		Assert.assertTrue(loanEntity.codeLength == command.getPayment().getPreauthorisationNumber().length());
	}
}
