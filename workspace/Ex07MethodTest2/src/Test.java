
public class Test {
	
	//1) 리턴 X, 파라미터 X
	void aaa() {
		System.out.println("aaa");
	}
	
	
	//2) 리턴 X, 파라미터 O
	void bbb( int n ) {
		System.out.println("n "+n);
	}
	
	//3) 리턴 O, 파라미터 X
	int ccc() {
		return 10;
	}
	
	//4) 리턴 O, 파라미터 O
	double ddd(double x, double y) {
		return x+y;
	}
}
