package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAppTest {

	public static void main(String args[]) {
		
		/*String config="src/main/java/ex03/appContext.xml";*/
		String config="src/main/java/ex03/appContext2.xml";
		ApplicationContext ctx=new FileSystemXmlApplicationContext(config);
		
		ctx.getBean("em1",Emp.class).info1();
		ctx.getBean("em2",Emp.class).info2();
		ctx.getBean("em3",Emp.class).info3();
	}
}
