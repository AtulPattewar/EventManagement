package ExceptionHandling;
//atul
public class BankMain {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account a=new Account(1111,10,"jack","sa");
		
			
			a.withdrawMoney(500);
			a.getBalance();
			CheckingAccount p2 = new CheckingAccount(2222 , 100000 , "sparrow", "CA");
			
			p2.withdrawMoney(600000000);
		    p2.getBalance();
	

		}


}
