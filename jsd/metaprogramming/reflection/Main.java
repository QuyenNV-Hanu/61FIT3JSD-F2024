package jsd.metaprogramming.reflection;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		User user = new FreeUser();
		ClassLoader c = User.class.getClassLoader();
		User u = (User) Proxy.newProxyInstance(c, new Class[] { User.class }, new GenericLogger(c));
		System.out.println(u.getClass().isInterface());
	}
}
