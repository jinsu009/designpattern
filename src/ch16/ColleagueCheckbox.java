package ch16;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague{

	private Mediator mediator;
	
	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state){
		super(caption, group, state);
	}
	
	@Override
	public void setMeditor(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		mediator.colleagueChanged();
	}

}
