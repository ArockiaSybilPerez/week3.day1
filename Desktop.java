package org.system;

//Package   :org.system
//Class        :Computer
//Methods   :computerModel()

//Class        :Desktop
//Methods   :desktopSize()

//Description:
//create above 2 class and call all your class methods into the Desktop using single inheritance.
public class Desktop extends Computer {
	
	public void DesktopSize(){
		System.out.println("Desktop Size is 7");
		
	}

	public static void main(String[] args) {
		
		Desktop obj1 = new Desktop();
		obj1.DesktopSize();
		obj1.computerModel();
		
	}
}
