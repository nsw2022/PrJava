
public class Dog extends Animal{
	
	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!!");
	}
	
	//Dog만 가지고 있는 고유한 기능
	void guardHouse() {
		System.out.println("겁나 잘지켜!!");
	}
	
}
