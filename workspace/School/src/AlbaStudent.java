
public class AlbaStudent extends Student{
	private String task="";
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("task : "+ task);
	}

	public AlbaStudent() {
		// TODO Auto-generated constructor stub
		super();
		task="";
	}
	
	public AlbaStudent(String name, int age, String major, String task) {
		// TODO Auto-generated constructor stub
		super(name,age,major);
		this.task=task;
	}
	
}
