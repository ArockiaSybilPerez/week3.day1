package assignment4.students;


//Class: Students
//Methods: getStudentInfo()
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber

public class Students {
	
		public void getStudentInfo(int id) {
			System.out.println("The Student id is "+ id);
		}
		public void getStudentInfo(int id, String name) {
			System.out.println("The Student id and name is " + id + " and " + name);
		}
		public void getStudentInfo(String emailid, String phoneNumber) {
			System.out.println("The Student email-id :" + emailid +" and Phonenumber is :"+phoneNumber);
		}

		public static void main(String[] args) {
			Students obj = new Students();
			obj.getStudentInfo(1307);
			obj.getStudentInfo(1307 ,"Sybil Perez");
			obj.getStudentInfo("sybi@gmail.com", "9898989898");
		}

}
