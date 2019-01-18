package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/* 스프링 컨테이너 : 빈을 관리한다.
 * 			     스프링 컨테이너는 빈 객체를 저장하고 있으며, 각 객체간의 의존 관계를 관리해준다.
               BeanFactory와 ApplicationContext가 컨테이너 역할을 수행하는 인터페이스
 * 1 BeanFactory (인터페이스)
 * 2 ApplicationContext (BeanFactory 를 상속받은 하위 인터페이스.)
 3. ApplicationContext를 구현할 클래스들: ClassPathXmlApplicationContext, FileSystemXmlApplicationContext,
									AnnotationConfigApplicationContext,GenericXmlApplicationContext
 * 3 WebApplicationContext (인터페이스. 웹 어플리케이션을 위한 ApplicationContext다.
         하나의 웹어플(즉, 하나의ServletContext) 마다 한 개 이상의 WebApplicationContext를 가질 수 있다).
		 -구현 클래스: XmlWebApplicationContext,AnnotationConfigWebApplicationContext

 * 
 * DI(dependency Injection) : 의존성 주입
 * 1 객체 간의 관계를 느슨하게 연결하도록 해주는 기능 중의 하나.
 * 2 참조되는 객체를 직접적으로 참조하는 객체에서 생성하지 않고 
 * 컨테이너에서 생성을 해서 사용하는 방법이다. 
 */
public class SpringAppTest_배포 {

	public static void main(String[] args) {

		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/ex04/Service.xml");
		
		ctx.getBean("s1",ServiceImpl.class).test1();
		ctx.getBean("s2",ServiceImpl.class).test2();
		ctx.getBean("s3",ServiceImpl.class).test3();
		ctx.getBean("s4",ServiceImpl.class).test4();
	}

}

