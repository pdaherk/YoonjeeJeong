package ex05method;
/*
 메소드: 
 	객체지향 프로그램에서 행동또는 동작을 의미한다
 	즉 어떤 하나의 업무를 처리하는 모듈(부속품)이라 정의할 수 있다
 	
 규칙 :
 	-메소드는 반드시 class안에 정의해야 한다
 	-메소드안에 다른 메소드를 정의할 수 없다
 	-반환타입이 없더라도 반드시 void를 명시해야 한다
 	-이름의 규칙은 변수명과 동일. (ex: addCalculate())
 
 Java에서의 Naming Rule 이름의 규칙
 	-클래스명: SimpleFunc ->대문자로 시작하는 CamelCase
 	-메소드나 변수명: simpleFunc(), simpleFunc 
 		소문자로 시작하는 변형된 camelCase
 	-상수: SIMPLE_FUNC -> 전체를 대문자로 표현하고 
 						연결된 단어가 있는경우 _(언더바) 사용 
 	-패키지명:simplefunc -> 전체 소문자임. 연결된 단어가 있더라고
 							언더바 사용 안 함. 언더바 대신 .(닷)
 							으로 표현한다 -> simple.func
 	
 */
public class E02MethodType01 {
	/*
	 메소드형식 1]
	 해당 형식은 주로 출력을 담당하는 기능으로 사용됨
	 반환타입은 반드시 void로 기술해야 함
	 */

	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("================");
	}
	
	static void noParamNoReturn2() {
		//경우에 따라 함수의 몸체가 없기도 함
	}
	static void noParamNoReturn(int a) {
		//동일한 이름의 함수가 선언되었음. 단 매개변수의 갯수가 다름

	}	
	
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Return문 이전]");
		
		//return;
		/*
		 위와같이 함수 중간에 return을 쓰게 되면 함수가 종료되므로
		 아래 문장은 실행되지 않는 쓰레기 코드가 된다.
		 따라서  return을 사용할 때는 반드시 조건문과 같이 사용해야 함.
		 단 함수의 마지막 부분에 있는 경우는 상관없다.
		 */
		if(returnValue%2==0) {
			System.out.println(returnValue +"는 짝수");
		
			return;
		}
		
		System.out.println(returnValue +"는 홀수");
		System.out.println("[return문 이후]");
	}
	public static void main(String[] args) {
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
		
	}////end of main

}////end of class
