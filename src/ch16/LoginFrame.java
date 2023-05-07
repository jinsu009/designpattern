package ch16;

import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends Frame implements ActionListener, Mediator{

	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;
	
	// 생성자 - Colleague들을 새성하고 배치 후 표시
	public LoginFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		setLayout(new GridLayout(4,2));
		createColleagues();
		add(checkGuest);
		add(checkLogin);
		add(new Label("username : "));
		add(textUser);
		add(new Label("password : "));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		colleagueChanged();
		pack();
		show();
	}
	
	@Override
	public void createColleagues() {
		// TODO Auto-generated method stub
		// 생성
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		textUser = new ColleagueTextField(" ",10);
		textPass = new ColleagueTextField(" ",10);
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		// mediator
		checkGuest.setMeditor(this);
		checkLogin.setMeditor(this);
		textUser.setMeditor(this);
		textPass.setMeditor(this);
		buttonOk.setMeditor(this);
		buttonCancel.setMeditor(this);
		
		// listener
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	@Override
	public void colleagueChanged() {
		// TODO Auto-generated method stub
		if(checkGuest.getState()) {
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(true);
		}else {
			textUser.setColleagueEnabled(true);
			userpassChanged();
		}		
	}

	private void userpassChanged() {
		if(textUser.getText().length() > 0) {
			textPass.setColleagueEnabled(true);
			if(textPass.getText().length() > 0) {
				buttonOk.setColleagueEnabled(true);
			}else {
				buttonOk.setColleagueEnabled(false);
			}
		}else {
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		System.exit(0);
	}

	
	
}
