package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloAppSpring {

	public static void main(String[] args) {
		
		/*MessageBean mb=new MessageBeanImpl();
		((MessageBeanImpl)mb).setGreeting("hi");
		((MessageBeanImpl)mb).setName("tom");
		mb.sayHello();
		이렇게 복잡하게하면 IOC를 쓰는 이유가 없음
		*/

		//스프링 컨테이너에서 MessageBeanImpl객체를 Lookup해서
		//sayHello()호출하세요 ==> DL(Dependency Lookup)
		
		String config="classpath:appContext2.xml";
		ApplicationContext ctx=new GenericXmlApplicationContext(config);	
		
		
		MessageBean mb=(MessageBean)ctx.getBean("mb1");
		mb.sayHello();
		
		/*MessageBean mb2=ctx.getBean("mb2", MessageBean.class);
		mb2.sayHello();
		mb2.sayHi("길동", "길양", "길춘", "길만");
		*/
		MessageBean mb3=ctx.getBean("mb3", MessageBean.class);
		mb3.sayHello();
	}

}
