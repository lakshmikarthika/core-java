package com.tulasi.streamPractise;

class Test implements Cloneable{
	int i;
	int j;
	@Override
	public String toString() {
		return "Test [i=" + i + ", j=" + j + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Test t1 = new Test();
		t1.i=10;
		t1.j=20;
		Test t2 = (Test) t1.clone();      // Test t2 = t1; this is shallow copy, t2.i = t1.i this is deep copy but gets difficult if there are lot of variables
		t2.j = 30;
		System.out.println(t1);
		System.out.println(t2);
	}
}
