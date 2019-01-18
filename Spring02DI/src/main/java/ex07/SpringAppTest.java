package ex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		String config="ex07/application.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
		
		Service s2=ctx.getBean("svc2", Service.class);
		s2.test();
	}
}
