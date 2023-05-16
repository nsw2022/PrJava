
public class Person {
	
	private String name;	//기본값 : null
	private int age;		//기본값 : 0
	
	//생성자 - 객채생성(new)할때 한번 자동으로 발동하는 메소드
	
	public Person(){
		this.name="";
		this.age=0;
		
	}
	
	//파라미터(이름, 나이)를 받는 생성자 오버로딩
	public Person(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	
	
	//출력기능
	public void show() {
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
		
	}
	
	
	
}
