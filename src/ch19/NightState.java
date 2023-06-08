package ch19;

public class NightState implements State{
	private static NightState singleton = new NightState();
	private NightState() {
		
	}
	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if(9<=hour && hour<17) {
			context.changeState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.callSecurity("야간금고사용!!!");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurity(" 비상벨 - 야간 ");
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.recordLog(" 야간통화 녹음 ");
	}
	
	public String toString() {
		return "[ 야간 ]";
	}

}
