package com.example.demo.chapter03.used;

import org.springframework.stereotype.Component;

// 夜の挨拶
@Component
public class EveningGreet implements Greet {

	@Override
	public void greeting() {
		System.out.println("こんばんは");
	}

}
