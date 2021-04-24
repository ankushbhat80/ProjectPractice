
public class Parent {
	//Parent constructor
	Parent(){
		
		System.out.println("THis inside const of parent:"+this);
	}
	//Method overloading
	public void start() {
		run();
	}public void run() {
		System.out.println("This inside run of parent:"+this);
		
	}

}
