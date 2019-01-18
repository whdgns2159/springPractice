package ex09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		String loc="classpath:ex09/application.xml";
		
		ApplicationContext ctx=new GenericXmlApplicationContext(loc);
		
		AdminInfo a1=ctx.getBean("admin2",AdminInfo.class);
		a1.printInfo();

	}

}
