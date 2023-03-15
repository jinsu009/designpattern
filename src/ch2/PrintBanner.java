package ch2;

/**
 * extends : 상속
 * 	- 부모의 메소드와 변수를 그대로 사용할 수 있으며 오버라이딩 할 필요가 없다.
 * 
 * implements : 상속
 * 	- 부모객체는 선언만 하고 자식은 오버라이딩(재정의)하여 사용해야 한다.
 * 	- interface
 * 
 *  super 
 *  - 부모 클래스로부터 상속받은 필드나 메소드를 자식클래스에서 참조하는데 사용하는 참조 변수
 *  
 * @author jinsu0107
 *
 */
public class PrintBanner extends Banner implements Print{
	public PrintBanner(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		showWithParen();		
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		showWithAster();
	}

}
