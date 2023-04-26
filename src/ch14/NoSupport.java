package ch14;

public class NoSupport extends Support{

	public NoSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	// 해결용 메소드로 자신은 아무것도 처리하지 않는다.
	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		return false;
	}

}
