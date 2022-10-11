package com.bilgeadam.course04.lesson07;

public class TestGreeting {

	public static void main(String[] args) {
		ConsoleGreeting greeting = new ConsoleGreeting();
		greeting.talk();
		
		GUIGreeting guiGreeting = new GUIGreeting();
		guiGreeting.talk();
		
		AngryGreeting 	angry = new AngryGreeting();
		angry.talk();
	}

}
