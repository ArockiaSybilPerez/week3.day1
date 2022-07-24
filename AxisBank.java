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
		  
		  AxisBank obj = new AxisBank();
		  obj.saving();
		  
		  AxisBank obj1 = new AxisBank();
		  obj.fixed();
		  
		  AxisBank obj2 = new AxisBank();
		  obj2.deposit();
		  
    // override
		  
		  AxisBank obj3 = new AxisBank();
		  obj3.deposit();
		  
	  }
}
