
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다형성이 사용되는 예 - 여러 타입의 객체를 한번에 제어하고 싶을때
		// 예) 앱에 동물캐릭터 3종류(Dog, Cat, Pig)
		
		Dog d=new Dog();
		Cat c=new Cat();
		Pig p=new Pig();
		
		d.say();
		c.say();
		p.say();
		System.out.println();
		
		//만약 이런 동물객체들이 여러마리면?
		//Dog 5마리, Cat 10마리, Pig4마리..
		//이런식이면.
		//배열로 처리하면 반복문을 적용
		Dog[] dogs=new Dog[5]; 
		Cat[] cats=new Cat[10]; 
		Pig[] pigs=new Pig[4]; 
		
		for(int i=0;i<dogs.length;i++) {
			dogs[i]=new Dog();
		
		}
		
		for(Dog dog : dogs) {	
			dog.say();
		}
		System.out.println();
		//이런식으로 Cat, Pig도 프로그래밍을 해야 하는데..
		//결국 동물종류(캐릭터)마다 별도의 그룹화(배열) 하여 제어함.
		//3개의 동물캐릭터가 서로 다른 클래스 자료형이어서..
		//한번에 동물들을 묶어서 제어할 수 없음..
		//앱을 만들다 보면 이 동물캐릭터들을 모두 그룹화하여 한번에 제어하고자 하는
		//경우가 생각보다 많음.
		
		//하나의 자료형 참조변수로 여러객체를 참조할 수 있다면.. 그룹화 가능할것임.
		//즉, Dog, Cat, Pig가 어떤 Animal이라는 클래스의 자식들이라면...
		//Animal클래스 참조변수로 Dog,Cat,Pig객체를 모두 참조할수 있겠죠!!
		
		//부모참조변수로 자식객체를 제어할 수 있음.
		Animal ani= new Dog(); //업 캐스팅
		Animal ani2= new Cat();
		Animal ani3= new Pig();
		
		ani.say();//override된 Dog의 say()가 실행됨
		ani2.say();
		ani3.say();
		System.out.println();
		//Animal참조변수를 여러개 가지는 배열을 만들면..
		//그 배열요소의 개수만큼. Dog, Cat, Pig 종류 상관없이 참조가 가능함
		
		Animal[] anis=new Animal[5];//Animal참조변수 5개짜리 배열객체 1개
		anis[0]=new Dog();//up casting
		anis[1]=new Cat();
		anis[2]=new Pig();
		anis[3]=new Dog();
		anis[4]=new Cat();
		
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		//반복문을 이요하여 여러객체들의 say()기능을 쉽게 사용할 수 있겠죠.
		for(int i=0;i<anis.length;i++) {
			anis[i].say();
		}
		System.out.println();
		
		//향상된 for문법(for each문법)
		for( Animal t: anis   ) {
			t.say();
		}
		System.out.println();
		
		//다형성은 위 처럼 배열로 묶기위해서만 사용되는 것은 아님.
		//메소드의 파라미터(매개변수)나 리턴타입에도 업캐스팅이 많이 활용됨
		//다음프로젝트에서 소개..
		
		
	}

}
