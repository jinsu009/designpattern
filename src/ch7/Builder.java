package ch7;

/**
 * 추상 클래스 이므로 인스턴스를 생성 할 수 없다.
 * @author jinsu0107
 *
 */
public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
