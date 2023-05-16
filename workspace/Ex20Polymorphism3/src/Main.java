import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 애니멀(Dog, Cat, Pig) 객체 만들어내는 능력을 가진
		// 애니멀공장 객체 생성.
		AnimalFactory af=new AnimalFactory();
		
		Dog d=(Dog)af.makeAnimal(1);//리턴된 객체가 Animal인줄 알아서 오류남 - Animal이 아니라 Dog라고 명시해주면..됨 down casting..
		d.say();
		d.guardHouse(); //고유기능
		
		Cat c=(Cat)af.makeAnimal(2);
		c.say();
		c.handleDeacon();
		
		Pig p=(Pig)af.makeAnimal(3);
		p.say();
		p.eatAndEat();
		System.out.println();
		
		//Animal참조변수 1개로 여러객체 제어하는 것도 가능
		Animal ani=null;
		
		ani=af.makeAnimal(1); //Dog객체 리턴됨
		ani.say();
		//ani.guardHouse();//error = Animal 참조변수에 없는 기능
		//Dog 참조변수가 필요함
		Dog dog=(Dog)ani;//다운캐스팅
		dog.guardHouse();
		
		ani=af.makeAnimal(2);
		ani.say();
		Cat cat=(Cat)ani;
		cat.handleDeacon();
		
		
		ani=af.makeAnimal(3);
		ani.say();
		((Pig)ani).eatAndEat();
		
		System.out.println();
		
		//응용해보기...
		//랜덤하게 동물들이 만들어 졌으면...
		
		//먼저, 랜덤값을 만드는 능력을 가진 객체 생성
		Random rnd=new Random();
		int n=rnd.nextInt(3)+1;
		
		ani=af.makeAnimal(n);
		ani.say();
		System.out.println();
		
		//여러마리.. 랜덤하게
		Animal[] anis=new Animal[5];
		for(int i=0; i<anis.length;i++) {
			int k=rnd.nextInt(3)+1;
			anis[i]=af.makeAnimal(k);
		}
		
		
		//각 객체들의 기능 사용해보기.. 메소드 호출
		for(int i=0; i<anis.length;i++) {
			//모든 동물객체들의 동일한 기능메소드
			anis[i].say();
			anis[i].sleep();
			
			//각 동물객체만의 고유기능 실행해보기
			//각 동물클래스로 형변환 해야하는데..
			//현재번째 anis[i]가 참조하는 객체가 
			//어떤 클래스인지 모르겠는게.. 문제
			if(anis[i] instanceof Dog) {
				Dog dd=(Dog)anis[i];
				dd.guardHouse();
				
				
			}else if(anis[i] instanceof Cat) {
				((Cat)anis[i]).handleDeacon();
				
				
			}else if(anis[i] instanceof Pig) {
				((Pig)anis[i]).eatAndEat();
			}
			
			
			
		}
		
	
		
		
		
	}

}
