package ex03;

public class MessageBeanKo implements MessageBean{
	//인터페이스를 상속받은 자식 클래스에서는 추상메소드를 강제로 재정의 해야 함
	
	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요~"+name+"님!");
	}
}
