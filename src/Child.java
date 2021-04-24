//Child class
public class Child extends Parent{
	
	public Child() {
		System.out.println("This inside cons of Child:"+this);
	}
	/*public void run() {
		//super.run();
		System.out.println("Child run"+this);
	}*/

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		c.start();
		p.start();
		

	}

}
