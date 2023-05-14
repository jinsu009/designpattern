package ch17;

// 상태가 변함을 보고받음
public interface Observer {

	public abstract void update(NumberGenerator generator);
	
}
