package ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		
		Emp e4=ctx.getBean("e4", Emp.class);
		
		System.out.println(e4.getName()+"/"+e4.getDept()+"/"+e4.getSalary());
		
		Emp exml=ctx.getBean("exmlBean",Emp.class);
		System.out.println(exml.getName()+"/"+exml.getDept()+"/"+exml.getSalary());
	}

}
