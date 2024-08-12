class Employee{

int id;
String name;
double sal;
public static void main(String [] args){
Employee e = new Employee();
System.out.println(e.id);
System.out.println(e.name);
System.out.println(e.sal);
 e.id=23;
e.name="Krishna";
e.sal=30000.0;
System.out.println("After Initialization");
System.out.println(e.id);
System.out.println(e.name);
System.out.println(e.sal);

}
}