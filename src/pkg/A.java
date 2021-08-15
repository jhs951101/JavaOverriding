package pkg;

class A {

	public void 함수1() {
		System.out.println("A 실행");
	}
}

class B extends A {
	
	public void 함수1() {
		System.out.println("B 실행");
	}
}

class C extends B {
	
	public void 함수1() {
		System.out.println("C 실행");
	}
}