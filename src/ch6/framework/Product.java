package ch6.framework;

/**
 * Cloneable :
 * 	이 인터페이스를 구현하고 있는 클래스의 인스턴스는 
 * 	clone메소드를 사용해서 자동적으로 복제를 할 수 있다.
 * @author jinsu0107
 *
 */
public interface Product extends Cloneable{
	public abstract void use(String s);
	
	/**
	 * 자기 자신을 복제 하는 메소드 
	 * 복제를 생성할 때 인스턴스가 가지고 있는 필드의 값도 그대로 새로운 인스턴스에 복사
	 * @return
	 */
	public abstract Product createClone();
}
