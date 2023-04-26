package ch14;

public abstract class Support {

	private String name; // 해결자 이름
	private Support next; // 떠넘기는 곳
	
	// 트러블 해결자 생성
	public Support(String name) {
		this.name = name;
	}
	
	// 떠넘기는 곳 설정
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	
	// 트러블 해결 
	// final : override 제한, 상속받은 클래스에서 수정 못하도록 함 	
	public final void support(Trouble trouble) {
		if(resolve(trouble)) {
			done(trouble);
		}else if( next != null) {
			next.support(trouble);
		}else {
			fail(trouble);
		}
	}
	
	public String toString() {
		return " [ " + name + " ] ";
	}
	
	// 해결용 메소드
	// protected : 같은 패키지에선는 접근 제한이 없지만 다른 패키지는 자식 클래스만 접근 가능 
	protected abstract boolean resolve(Trouble trouble);
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by "+this);
	}
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved ");
	}
	
}
