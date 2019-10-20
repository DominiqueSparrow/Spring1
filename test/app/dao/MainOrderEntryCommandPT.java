package app.dao;

public class MainOrderEntryCommandPT {

	static public class Payment {
		String finactialEntityName;
		String preauthorisationNumber;

		public String getFinactialEntityName() {
			return finactialEntityName;
		}

		public String getPreauthorisationNumber() {
			return preauthorisationNumber;
		}

	}

	static class DebitCard {
		float amount;

		public float getAmount() {
			return amount;
		}

	}

	Payment payment;

	DebitCard debitCard;

	public DebitCard getDebitCard() {
		return debitCard;
	}

	public Payment getPayment() {
		return payment;
	}

}
