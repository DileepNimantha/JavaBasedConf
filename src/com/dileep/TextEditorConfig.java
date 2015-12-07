package com.dileep;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(ConfigA.class)
public class TextEditorConfig {

	@Bean
	public TextEditor textEditor() {
		return new TextEditor(spellChecker());
	}

	@Bean	
	//@Bean(initMethod = "init", destroyMethod = "cleanup" )	// Lifecycle Callbacks
	//@Scope("prototype")	// Specifying Bean Scope
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
}
