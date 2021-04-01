
public class Student {
	
 Integer id;
 String name;
 String rollno;
 

	public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getRollno() {
	return rollno;
}


public void setRollno(String rollno) {
	this.rollno = rollno;
}


	public Student(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}


	public static void main(String[] args) {
		Student s1= new Student(1,"Ankush");
		Student s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
		s1=null;
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		
		

	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
