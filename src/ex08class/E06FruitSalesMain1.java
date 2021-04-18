package ex08class;

//과일판매자를 추상화한 클래스 
class FruitSeller {
	int numOfMango = 100;//판매자의 망고 갯수
	int myMoney = 0;//판매자의 수익
	final int MANGO_PRICE = 1000;//망고의 단가(상수로 표현)
	/* 클래스에 상수로 선언하는 경우 반드시 선언과 동시에 초기화 해야 한다.
	 만약 선언과 초기화를 별도로 처리하면 에러난다. 
	 (테스트 시 초기화되는 1000 부분을 제거 후 확인해 볼 것)*/
	
	//판매자가 망고를 판매하는 행위를 표현한 멤버메소드
/*	 1. 금액을 전달받는다
	 2. 금액에 해당되는 판매될 망고의 갯수를 구한다
	 3. 보유한 재고에서 판매될 갯수만큼 차감한다
	 4. 판매수입이 증가한다 
	 5. 구매자에게 판매한 사과의 갯수를 반환한다*/
	public int saleMango(int money) {
		int num = money / MANGO_PRICE;
		numOfMango -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은 망고갯수"+ numOfMango);
		System.out.println("[판매자]판매수익"+ myMoney);		
	}
}
//구매자를 표현한 클래스
class FruitBuyer {
	int myMoney = 5000;//보유한 금액
	int numOfMango = 0;//구매한 사과의 갯수
	
	//구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메소드
	/*
	1. 판매자에게 금액지불한다.
	2. 판매자가 금액에 해당하는 사과의 갯수를 반환해준다
	  	반환한 갯수만큼 보유한 사과의 갯수가 증가한다
	3. 판매자에게 지불한 금액만큼 차감된다  	
	 */
	public void buyMango(FruitSeller seller, int money) {
		numOfMango += seller.saleMango(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]망고 갯수:"+ numOfMango);
	}
}

public class E06FruitSalesMain1 {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();//판매자 객체
		FruitBuyer buyer = new FruitBuyer();
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		/*
		 구매자가 판매자에게 5천원을 지불하고 망고를 구매한 행위를 코드로 표현함. 
		 */
		buyer.buyMango(seller, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();		
	}
}
