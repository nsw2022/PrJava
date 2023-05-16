import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	
	// java언어에서 배열은 객체임!!
	
	//int형 3칸짜리 배열객체 생성
	//객체는 heap메모리에만 만들어짐. new 키워드로 생성
	int[] arr = new int[3];//배열요소들의 기봉값은 0에 해당하는 값으로 초기화
	
	//사용하는 모습은 C언어와 유사함 [ 참조변수의 이름을 마치 배열의 이름처럼 사용
	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	//System.out.println(arr[2]);//error - 인덱스범위를 ㅂ서어나면 에러
	System.out.println(arr);//배열의 참조변수명을 출력하면 자동 toString()이 발동-->객체 정보가 출력됨(배열값이 아님!)
	
	//배열요소에 값 대입
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	
	//배열은 만들때만 한ㅂ번에 여러개를 다루고 사용할때(출력,대입)는 배열요소별로 사용해야만 함.
	
	//배열객체는 본인의 요소개수(길이)를 알수 있도록 길이값을 저장하고 있습니다
	System.out.println("요소개수 : "+ arr.length);
	
	//배열요소값들을 출력해보기 - 반복문
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	
	//배열의 초기화
	int[] arr2 = new int[] {100,200,300};
	System.out.println(arr2[0]);
	System.out.println(arr2[1]);
	System.out.println(arr2[2]);
	
	//배열의 초기화를 축약표현
	int[] arr3= {1000,2000,3000}; //자동 new int[]
	for(int i=0;i<arr3.length;i++) {
		System.out.println(arr3[i]);
	}
	
	//당연하게.. 배열을 만들때 초기화없이 개수를 명시하지 않으면 에러
	//int[] arr2 = new int[];//error
	
	//배열객체를 만들때 배열 요소의 갯수를 지ㅣ정ㅎㄹ수 있음[C는 안됨
	int k=5;
	int[]aaa=new int[k];
	System.out.println("aaa배열의 길이 : " + aaa.length);
	
	//배열의 개수를 변수로 지정할 수 있으므로.. 당연히 키보드 입력을 통해
	//배열의 길이를 지정할 수 있음.
	
	Scanner scan=new Scanner(System.in);
//	int h=scan.nextInt();
//	int[] bbb=new int[h];
//	System.out.println("bbb배열의 길이 : " + bbb.length);

	//초기화할때 값을 변수로 지정하는 것도 당연히 가능함
	int n=10;
	int[] ccc=new int[] {n,n+1,n+2};
	System.out.println(ccc[0]);
	System.out.println(ccc[1]);
	System.out.println(ccc[2]);
	
	//배열참조변수끼리의 대입 [객체 공유]
	double[] ddd=new double[] {1.1, 2.2, 3.3};
	double[] eee=ddd;//주소를 대입 - 같은 주소를 가짐 [ 같은 객체를 공유하는 모습 ]
	
	for(int i=0;i<ddd.length;i++) {
		System.out.println(ddd[i]);
	}
	System.out.println();
	
	for(int i=0;i<eee.length;i++) {
		System.out.println(eee[i]);
	}
	System.out.println();
	
	//객체를 복사한게 아니라 공유하고 있기에..
	//하나의 참조변수로 배열요소값을 변경하면..
	//다른 참조변수도 영향을 받음
	eee[1]=3.14;
	for(int i=0;i<ddd.length;i++) {
		System.out.println(ddd[i]);
	}
	System.out.println();
	
	//만약, 배열객체가 복사되는 것처럼 구현하고 싶다면.
	int[] fff=new int[] {5,6,7};
	int[] ggg=new int[fff.length];
	
	//요소값들을 하나씩 1:1로 대입해줘야 함.
//	ggg[0]=fff[0];
//	ggg[1]=fff[1];
//	ggg[2]=fff[2];
	for(int i=0;i<fff.length;i++) {
		ggg[i]=fff[i];
	}
	////////////////////////////////////////////////////////////////////
	
	//기본형 자료형의 배열객체
	int a,b,c;
	a=10;
	
	int[] hhh=new int[3];
	hhh[0]=10;
	
	//참조형 자료형들의 배열객체 다루기.
	String s1= null,s2,s3;
	s1= new String("aaa");
	s2= new String("bbb");
	s3= "ccc";//자동 new String()
	System.out.println( s1.toString() );
	System.out.println( s1 );//참조변수명만 쓰면 자동 toString()
	System.out.println(s3.toUpperCase());
	
	//당연히 참조형 변수도 배열로 만들수 있음.
	String[] sss= new String[3]; //String 참조변수가 3개짜리 배열객체 1개 생성
	System.out.println(sss[0]);
	System.out.println(sss[1]);
	System.out.println(sss[2]);
	
	//각 배열요소(String참조변수)들에 객체생성하여 주소대입(참조시키기)
	sss[0]=new String("Hello");
	sss[1]=new String("Nice");
	sss[2]="android";
	
	//요소값 출력
	System.out.println(sss[0].toString());
	System.out.println(sss[1]);//자동 tostring()
	System.out.println(sss[2]);
	
	//요소들(참조변수들)을 이용하여 참조하는 String객체의 기능을 사용해보기
	System.out.println(sss[0].length());
	System.out.println(sss[1].toUpperCase());
	System.out.println(sss[2].contains("an") );
	
	char ch=sss[0].charAt(3);//3번방 인덱스요소의 char값을 리턴해줌.
	System.out.println(ch);
	System.out.println(sss[2].charAt(3) );
	
	//참조형 배열도 초기화 가능함
	int[] xxx= new int[] {10,20,30};
	int[] yyy= {10,20,30};//축약표현 자동 new int[]
	
	String[] ssss= new String[] {new String("Hello"), new String("Nice"),new String("android")};
	String[] ssss2= new String[] {"Hello","Nice","android"};//String 축약표현
	String[] ssss3= {"Hello","Nice","android"};//축약표현 자동 new String[]
	
	// 반복문 중에 새로운 for문이 등장. [향상된 for 문법 - for each 문법]
	int [] nums= new int [3];
	nums[0]=10;
	nums[1]=20;
	nums[2]=30;


	//요소값 출력
	System.out.println(nums[0]);
	System.out.println(nums[1]);
	System.out.println(nums[2]);
	System.out.println();
	
	//반복문으로 요소값 출력
	for(int i=0;i<nums.length;i++) {
		int t=nums[i];
		System.out.println(t);
	}
	System.out.println();
	
	//반복문으로 조금더 쉽게 사용하기 위해.. 특히 배열에서..향상된 for 문법을 제공
	for(int t : nums) {
		System.out.println(t);
	}
	System.out.println();
	
	String[] names= new String[3];
	names[0]=new String("sam");
	names[1]=new String("robin");
	names[2]="hong";
	

	System.out.println(names[0]);
	System.out.println(names[1]);
	System.out.println(names[2]);
	
	//향상된 for문법
	for(String t:names) {
		System.out.println(t);
		System.out.println(t.length());
		System.out.println("----");
	}
	
}
}
