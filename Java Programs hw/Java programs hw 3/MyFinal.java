class BankAccount{
	final int accountNo = 1313131313;
	final String accountName = "Raj";
	final int debitNo = 1212121212;
	final int phoneNo = 1414141414;
	
	final void details(){
		System.out.println("Account no. " + accountNo);
		System.out.println("Account name. " + accountName);
		System.out.println("Debit card no. " + debitNo);
		System.out.println("Phone no. " + phoneNo);
	}
}
class MyFinal{
	public static void main(String[] args){
		BankAccount acc1 = new BankAccount();
		acc1.details();
	}
}