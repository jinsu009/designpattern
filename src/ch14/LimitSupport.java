package ch14;

public class LimitSupport  extends Support {
	
	private int limit; // 해당 번호 미만이면 해결 가능
	
	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
		// TODO Auto-generated constructor stub
	}

	// 해결용 메소드
	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		if(trouble.getNumber() < limit) {
			return true;
		}else {
			return false;
		}
	}

	
	
}
