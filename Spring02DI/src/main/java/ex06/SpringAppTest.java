package ex06;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		//class로 설정한 빈을 찾아서 써보자
		//AnnotationConfigApplicationContext에 설정에사용한 Class를 넣어주자
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		
		Emp e1=ctx.getBean("e1",Emp.class);
		System.out.println(e1); //해쉬코드값이 항상 같다. 이를 싱글톤이라고 한다.
		System.out.println(e1.getName()+"/"+e1.getDept()+"/"+e1.getSalary());
		
		Emp e2=ctx.getBean("e1",Emp.class);
		System.out.println(e2);
		
		Emp e3=ctx.getBean("e3",Emp.class);
		System.out.println(e3);
		
		/*Emp e4=ctx.getBean("empInfo3()",Emp.class);
		System.out.println(e4);*/
		
		Date d=ctx.getBean("today", Date.class);
		System.out.println(d);
		
		Service s=ctx.getBean("svc",Service.class);
		s.test();
	}

}
