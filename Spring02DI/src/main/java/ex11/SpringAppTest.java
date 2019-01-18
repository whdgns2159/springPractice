package ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Service s=ctx.getBean("siBean",Service.class);
		
		s.test1();
		s.test2();
	}

}
