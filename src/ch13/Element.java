package ch13;

/**
 * 방문자를 받아들이는 인터페이스 
 * @author jinsu0107
 *
 */
public interface Element {
	public abstract void accept (Visitor v);	
}
