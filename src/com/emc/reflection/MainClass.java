package com.emc.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
	IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, 
	InvocationTargetException {
		// TODO Auto-generated method stub
		Class<?> helloWorldClass = Class
				.forName("com.emc.reflection.HelloWorld");
		System.out.println(helloWorldClass);
		Class<?> noparams[] = {};
		Object helloWorld = helloWorldClass.newInstance();
		Method methodSayHello = helloWorldClass.getDeclaredMethod("sayHello",noparams);
		methodSayHello.invoke(helloWorld, (Object[]) null);
		
		Method methodSayHelloWithParam = helloWorldClass.getDeclaredMethod("sayHello",String.class);
		methodSayHelloWithParam.invoke(helloWorld, new String("Toni"));
		
		
		
	}
}