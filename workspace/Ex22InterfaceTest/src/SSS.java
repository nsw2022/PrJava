
// 다른 인터페이스의 추상메소드를 상속받을 때는 extends키워드 사용
public interface SSS extends KKK{
	
	//보이지 않지만 이미 aaa(),bbb() 추상메소드를 보유한 상태
	
	public abstract void ccc();

}
