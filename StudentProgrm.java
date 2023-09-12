class Student {
	
	String name;
	String id;
	int age;

	Student(String n, String i, int a){
		name = n;
		id = i;
		age = a;
	}
	
	//Method to display details
	void display() {
		System.out.println("\nName : "+ name);
		System.out.println("id : "+ id);
		System.out.println("age : "+age);
	}
}
	class StudentProgrm {

	public static void main(String[] args)
	{
		Student std1 = new Student("Mrinabh Sarmah", "CSE-32/20", 22);
		std1.display();
		
		Student std2 = new Student("Samiron Saikia", "CSE-19/20", 22);
		std2.display();

	}

}
