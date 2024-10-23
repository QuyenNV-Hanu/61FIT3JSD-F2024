package jsd.metaprogramming.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GenericLogger implements InvocationHandler {
	private Object target;

	public GenericLogger(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		System.out.println("Generic Logger Entry: Invoking " + m.getName());
		return m.invoke(target, args);
	}

}
