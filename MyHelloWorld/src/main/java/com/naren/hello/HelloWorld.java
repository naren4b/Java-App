package com.naren.hello;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		Greet greet = new Greet();
		System.out.println(greet.sayHello(Arrays.toString(args)));
	}

}
