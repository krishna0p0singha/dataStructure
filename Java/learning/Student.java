class Student{
	String name;
	int age;
	double marks;
	
	public static void main(String [] args){

		Student s1=new Student();
		Student s2=new Student();
		
		s1.name="Krishna";
		s2.name="Prasad";
		s2.age=23;
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.marks);
		System.out.println("--------------");
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.marks);


	}
}