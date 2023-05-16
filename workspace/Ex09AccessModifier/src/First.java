
public class First {
	
	//접근제한자가 부여된 멤버변수
	private int a;
	int b;
	protected int c;
	public int d;
	
	//멤버메소드안에서는 어떤 접근 제한자의 멤버든 무조건 사용가능
	void aaa() {
		a=100;//class안에서는 private도 당연히 사용가능함.
		//당연히 다른 접근 제한자는 모두 사용 가능
		b=200;
		c=300;
		d=400;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println();
	}
	
}
