package assignment5.abstraction;

//Interface :Language
//Methods   :Java()
//Interface :TestTool
//Methods   :Selenium()
//AbstractClass :MultipleLangauge
//Methods   :python() and un implemented method as ruby()
//Execution class: Automation 
//mplement all the methods of interface and abstract class in Automation class

public abstract class MultipleLanguage {
	
	public void python() {
		System.out.println("Multiple language Abstract Class - python");
	}
	public abstract void ruby();
}
