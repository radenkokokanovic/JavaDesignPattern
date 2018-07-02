package com.example.SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		SingleObject object=SingleObject.getInstance();
		
		//show message
		object.showMessage();
	}
}
