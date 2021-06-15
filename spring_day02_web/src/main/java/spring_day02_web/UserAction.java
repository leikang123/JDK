package spring_day02_web;

import java.awt.event.ActionEvent;

public class UserAction extends ActionEvent {
	
      public UserAction(Object source, int id, String command, int modifiers) {
		super(source, id, command, modifiers);
		
	}

	public String execute() {
		return null;
		
	}

}
