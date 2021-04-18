package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2;
/*
 접근지정자(접근제어 지시자):
 		클래스와 클래스 사이에 멤버간의 접근을 제어하는 키워드이다.
 		접근범위비교:
 		private < default(생략형) < protected <public
 		
 		접근지정하는 붙일수 있는 곳
 		클래스, 멤버변수, 멤버메소드 모두 가능하나 class명 앞에서는 
 		public과 default만 붙일 수 있다

 */
public class E01AccessModifierMain {

	public static void main(String[] args) {

		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		/*
		 private으로 선언된 멤버는 동일한 패키지라 할지라도 접근이 불가능하다
		 해당 멤버는 동일 클래스 내에서만 접근을 허용한다.
		 ※private으로 선언된 멤버를 외부클래스에서 접근할 때는 주로 public으로 
		 선언된 멤버메소드를 통해 간접적으로 접근한다.
		 */
		E01AccessModifier1 one = new E01AccessModifier1();
		
		//System.out.println("one.privateVar="+ one.privateVar);[에러]
		System.out.println("one.privateVar="+ one.defaultVar);
		System.out.println("one.privateVar="+ one.publicVar);

		//one.privateMethod();//[에러]
		one.defaultMethod();
		one.publicMethod();
		/*
		 동일한 패키지에 선언된 클래스이므로 import없이 객체 생성 및 접근이 가능하다 
		 */
		System.out.println("DefaultClass객체 생성 및 접근");
		
		////////////////////////////////////////////////////////
		
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");	
		/*
		 다른패키지에 선어된 클래스이므로 객체생성을 위해서는 import가 필요하다
		 import - cntrl+shift+알파벳 o
		 */
		/*
		 패키지가 다른 경우 private, default멤버에 접근을 허용하지 않는다.
		 */
		E01AccessModifier2 two = new E01AccessModifier2();
		
		//System.out.println("two.privateVar="+ two.privateVar);//에러
		//System.out.println("two.privateVar="+ two.defaultVar);//에러
		System.out.println("two.privateVar="+ two.publicVar);		
		
		//two.privateMethod();//에러
		//two.defaultMethod();//에러
		two.publicMethod();
		/*
		 다른 패키지에 정의된 디폴트 클래스이므로 객체생성이 불가능하다.
		 import도 불가능하므로 아예 사용 할 수 없는 클래스다.
		 */
		System.out.println("DefaultClass 객체 생성 및 접근");
		//new DefaultClass2().myFunc();
	}

}
