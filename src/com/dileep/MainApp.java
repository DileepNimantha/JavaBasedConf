package com.dileep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor te = context.getBean(TextEditor.class);
		
		te.spellCheck();
	}
}
