package assignment3.banking;

public class AxisBank extends BankInfo {
    //Class     :BankInfo
    //Methods    :saving(),fixed(),deposit()

     //Class     :AxisBank
     //Methods :deposit()
	
	  public void deposit() {
	         System.out.println("Deposit Amount is 750000");	
		}
	  
	//Description:
	//You have to override the method deposit in AxisBank.
	  
	  public static void main(String[] args) {
		  
		  //BankInfo obj = new AxisBank();
		  //obj.saving();
		  
		  //BankInfo obj1 = new AxisBank();
		  //obj.fixed();
		  
		   // override
		  // parent class obj = new child class
		  
		  BankInfo obj2 = new AxisBank();
		  obj2.deposit();
		  

	  }
}

