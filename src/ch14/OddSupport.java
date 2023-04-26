package ch14;

public class OddSupport extends Support{

	public OddSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	// 해결용 메소드
	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		if(trouble.getNumber() % 2 == 1) {
			return true;
		}else {
			return false;
		}
	}

}
