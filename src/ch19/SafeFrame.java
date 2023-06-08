package ch19;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SafeFrame extends Frame implements ActionListener,Context{
	
	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10,60);
	private Button btnUse = new Button("금고 사용");
	private Button btnAlarm = new Button("비상벨");
	private Button btnPhone = new Button("일반통화");
	private Button btnExit = new Button("종료");
	
	private State state = DayState.getInstance();
	
	// 생성자 
	public SafeFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		add(textScreen,BorderLayout.CENTER);
		textScreen.setEditable(false);
		Panel panel = new Panel();
		panel.add(btnUse);
		panel.add(btnAlarm);
		panel.add(btnPhone);
		panel.add(btnExit);
		add(panel, BorderLayout.SOUTH);
		pack();
		show();
		btnUse.addActionListener(this);
		btnAlarm.addActionListener(this);
		btnPhone.addActionListener(this);
		btnExit.addActionListener(this);
	}

	@Override
	public void setClock(int hour) {
		// TODO Auto-generated method stub
		String clockStr = " 현재 시간 : ";
		if(hour < 10 ) {
			clockStr += "0" + hour + ":00";
		}else {
			clockStr += hour +":00";
		}
		System.out.println(clockStr);
		textClock.setText(clockStr);
		state.doClock(this, hour);
	}

	@Override
	public void changeState(State state) {
		// TODO Auto-generated method stub
		System.out.println(this.state +" 에서 "+state+" 로 상태가 변화했습니다. ");
		this.state = state;
	}

	@Override
	public void callSecurity(String msg) {
		// TODO Auto-generated method stub
		textScreen.append(" call "+msg+"\n");
	}

	@Override
	public void recordLog(String msg) {
		// TODO Auto-generated method stub
		textScreen.append(" record "+msg+"\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		
		if(e.getSource() == btnUse) {
			state.doUse(this);
		}else if(e.getSource() == btnAlarm) {
			state.doAlarm(this);
		}else if(e.getSource() == btnPhone) {
			state.doPhone(this);
		}else if(e.getSource() == btnExit) {
			System.exit(0);
		}else {
			System.out.println("?");
		}
	}
	
}
