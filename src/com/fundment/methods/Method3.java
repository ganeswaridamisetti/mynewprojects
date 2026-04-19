package com.fundment.methods;

public class Method3 {
	static int a() {
		return 2345;
	}

	static byte b() {
		return (byte) 129;
	}

	static short s() {
		return 2345;
	}

	static long l() {
		return 2345555555555l;
	}

	static float f() {
		return 2345f;
	}

	static double d() {
		return 2345;
	}

	static char c() {
		return 65;
	}

	static boolean b1() {
		return false;
	}

	static void show() {
		System.out.println(a());
		System.out.println(b());
		System.out.println(s());
		System.out.println(l());
		System.out.println(d());
		System.out.println(f());
		System.out.println(c());
		System.out.println(b1());
	}

	public static void main(String[] args) {

		show();
	}

}
