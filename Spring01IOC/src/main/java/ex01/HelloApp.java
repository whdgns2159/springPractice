package ex01;

public class HelloApp {

	public static void main(String[] args) {
		//HelloApp은 MessageBean에 의존성을 갖는다 라고 표현할 수 있다.
		
		//MessageBean mb1=new MessageBean();
		MessageBeanKo mb1=new MessageBeanKo();
		mb1.sayHello("tom");

	}

}
