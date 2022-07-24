package assignment5.abstraction;

//Interface :Language
//Methods   :Java()
//Interface :TestTool
//Methods   :Selenium()
//AbstractClass :MultipleLangauge
//Methods   :python() and un implemented method as ruby()
//Execution class: Automation 
//mplement all the methods of interface and abstract class in Automation class

public class Automation extends MultipleLanguage implements language, TestTool{

	public void Java() {
		System.out.println("Language Interface - Java");
		
	}
	
	public void Selenium() {
		System.out.println("Testtool Interface - Selenium ");
		
	}
	@Override
	public void ruby() {
		System.out.println("Multiple Language Abstract Class - Ruby");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation obj= new Automation();
		obj.Java();		
		obj.Selenium();	
		obj.python();
		obj.ruby();

	}
}
