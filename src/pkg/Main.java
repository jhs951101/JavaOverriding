package pkg;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.함수1(); // 인스턴스 A를 대입하였으므로 A에 있는 함수 실행 (오버라이딩 X)
		b.함수1(); // 인스턴스 B를 대입하였으므로 B에서 재구현된 함수 실행
		c.함수1(); // 인스턴스 C를 대입하였으므로 C에서 재구현된 함수 실행
		
	}
}
