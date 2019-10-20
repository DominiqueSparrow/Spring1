package app.dao;

public class LoanEntryDAO {
	static public class LoanEntity {
		String bankName;
		Long codeLength;

		public LoanEntity(String bankName, Long codeLength) {
			super();
			this.bankName = bankName;
			this.codeLength = codeLength;
		}

	}

	LoanEntity getLoanEntryDoeBank(String bank) {
		return new LoanEntity(bank, (long) bank.length() / 2 + 3);
	}

}
