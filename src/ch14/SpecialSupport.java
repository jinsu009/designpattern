package ch14;

public class SpecialSupport extends Support{
	
	private int number; // 해당 번호만 해결 할 수 있다.

	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
		// TODO Auto-generated constructor stub
	}

	// 해결용 메소드
	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		if(trouble.getNumber() == number) {
			return true;
		}else {
			return false;
		}
	}

}
