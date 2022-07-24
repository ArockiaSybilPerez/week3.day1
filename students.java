package assignment4.students;

//Class: Students
//Methods: getStudentInfo()
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber

public class students {
	
		public void getStudentInfo(int id) {
			System.out.println("The Student id is "+ id);
		}
		public void getStudentInfo(int id, String name) {
			System.out.println("The Student id and name is " + id + " and " + name);
		}
		public void getStudentInfo(int id, String name, String emailid, String phoneNumber) {
			System.out.println("The Student id, name, email-id and Phonenumber is " + id + " and " + name +" and "+ emailid +" and "+phoneNumber);
		}

		public static void main(String[] args) {
			students obj = new students();
			obj.getStudentInfo(1307);
			
			students obj1 = new students();
			obj1.getStudentInfo(1307 ,"Sybil Perez");
			
			students obj2 = new students();
			obj2.getStudentInfo(1307, "Sybil Perez", "sybilremigiousperez7@gmail.com", "9487025147");
		}

}