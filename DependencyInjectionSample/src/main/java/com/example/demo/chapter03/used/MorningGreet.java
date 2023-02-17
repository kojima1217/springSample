package com.example.demo.chapter03.used;

import org.springframework.stereotype.Component;

// 朝の挨拶
@Component
public class MorningGreet implements Greet {

	@Override
	public void greeting() {
		System.out.println("おはようございます");
	}

}
