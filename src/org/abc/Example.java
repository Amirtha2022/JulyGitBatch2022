package org.abc;

public class Example {

	static int a = 500;

	private void m1() {
		a = 100;
		System.out.println(a);
		System.out.println("Anu created m1");
	}

	private void m2() {
		System.out.println("Sri created m2");
	}

	private void m3() {
		System.out.println("Dev craeted m3");
	}

	public static void main(String[] args) {

		System.out.println(a);
	}
}
