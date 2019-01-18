package ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloAppSpring {

	public static void main(String[] args) {
		
		String config="classpath:appContext3.xml";
		ApplicationContext ctx=new GenericXmlApplicationContext(config);
		
		MessageBean mb=(MessageBean)ctx.getBean("mb");
		mb.sayHi("박만수","김철수","강민식");
		

	}

}
