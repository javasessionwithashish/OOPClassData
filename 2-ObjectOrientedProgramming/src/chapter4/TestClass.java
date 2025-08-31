package chapter4;

import chapter4.PrivateClass;

import chapter3.TestForChapter4;

public class TestClass {
	
	public static void main(String[] args) {
		PrivateClass p= new PrivateClass();
		
		p.id=4;//Instance variable of PrivateClass
		p.name="virinchi";
		
		System.out.println(p.id+p.name);
		
		
		TestForChapter4 t= new TestForChapter4();
		t.testName="virinchiTest";
		
		System.out.println(t.testName);
		t.roll=4;
		
		
	}

}
