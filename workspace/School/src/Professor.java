
public class Professor extends Person{
	
	private String subject="";
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("subject :" + subject);
	}
	
	public Professor() {
		super();
		this.subject="";
	}
	
	public Professor(String name, int age, String subject) {
		super(name,age);
		this.subject=subject;
	}
	

}
