package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloAppSpring {

	public static void main(String[] args) {
		//DL (dependency Lookup)
		String config="classpath:applicationContext.xml";
		//classpath: => 클래스 파일이 있는 경로를 찾는다.
		//src/main/resources=> 리소스파일들을 두는데 
		//해당 리소스 파일들은 클래스 파일이 있는곳에 카피되어 위치한다.
		//C:\MYJAVA\SpringWorkspace\Spring01IOC\target\classes
		
		ApplicationContext ctx=new GenericXmlApplicationContext(config);
		
		MessageBean mb=(MessageBean)ctx.getBean("mb1");
		mb.sayHello("Spring");
		
		
	}

}
