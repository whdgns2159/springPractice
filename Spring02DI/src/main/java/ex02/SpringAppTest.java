package ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		String config="ex02/empBean.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
		
		ctx.getBean("n",Emp.class).info1();
		ctx.getBean("ns",Emp.class).info2();
		ctx.getBean("nsd",Emp.class).info3();
		ctx.getBean("r",Emp.class).info4();
		
	}

}
