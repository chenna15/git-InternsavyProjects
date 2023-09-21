package Demo;
	// TODO Auto-generated method stub
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

public  class User {
 private String name;
 private int RollNo;
 private int Marks;
 
 public User(String name, int age, int Marks) {
	this.name = name;
	this.RollNo= RollNo;
	this.Marks= Marks;
 }
 public String getName() {
	 return name;
 }
 
 public int getRollNo() {
	 return RollNo;
 }
 
 public int getMarks() {
	 return Marks;
 }
 
 public  void setName(String name) {
	 this.name= name;
 }
 
 public void setRollNo(int RollNo) {
	 this.RollNo= RollNo;
 }
 
 public void setMarks(int Marks) {
	 this.Marks=Marks;
 }
 
 @Override
 public String toString() {
	 return "Name: "+name+ ",RollNo: "+ RollNo +",Marks: "+Marks;
 }

}
 class  Crud_Methods{
private static ArrayList<User> S = new ArrayList<User>();
private static Scanner sc= new Scanner(System.in);

public static void  main(String[] args) {
  int options;
  
  do {
	  System.out.println("\n CRUD Operations:");
	  System.out.println("1. Create Student");
	  System.out.println("2. Read Student");
	  System.out.println("3. Update Student");
	  System.out.println("4. Delete Student");
	  System.out.println("5. Exit");
	  options=sc.nextInt();
	  sc.nextLine();// takes new line
	  
	  switch(options) {
	  
	  case 1:
		  createStudent();
		  break;
	  
	  case 2:
		  readStudent();
		  break;
	  
	  case 3:
		  updateStudent();
	      break;
	      
	  case 4:
		  deleteStudent();
		  break;
	  
	  case 5:
		  System.out.println("Exit");
		  break;
	  
	default:
		System.out.println("Please select valid option");
	  
	  }
  }while(options!=5);
  sc.close();
}

private static void createStudent() {
System.out.println("Enter user name:");
String name= sc.nextLine();

System.out.println("Enter RollNo:");
int RollNo=sc.nextInt();

System.out.println("Enter MArks:");
int Marks=sc.nextInt();

User user= new User(name, RollNo,Marks);
	S.add(user);
	System.out.println("User added Successfully");
	
}


private static void readStudent() {
if(S.isEmpty()) {
	System.out.println("No Student found");

}else {
	
	System.out.println("StudentList:");
     for(User student:S){
    	 System.out.println(S);
     }
}
}

private static void updateStudent() {
	System.out.println("Enter name of the user to update:");
	String nameToUpdate = sc.nextLine();
	
	for(User student:S) {
		if(student.getName().equalsIgnoreCase(nameToUpdate)) {
			System.out.println("Enter new user name:");
			String newName=sc.nextLine();
			System.out.println("Enter  new user RollNo:");
			int RollNo=sc.nextInt();
			System.out.println("Enter new  user marks:");
			int Marks= sc.nextInt();
			
			sc.nextLine();
			
			student.setName(newName);
			student.setRollNo(RollNo);
			student.setMarks(Marks);
			System.out.println("New user details updated Successfuly");
            return;
            
		}
	}
System.out.println("User not found with name: "+ nameToUpdate);
}
private static void deleteStudent() {

System.out.println("Enter User name to delete:");
String nameToDelete=  sc.nextLine();

for(User student:S) {
	if(student.getName().equalsIgnoreCase(nameToDelete)) {
S.remove(student);
System.out.println("User deleted Successfully ");
return;
}

}
System.out.println("User not found with name: " + nameToDelete);
}
}



