package ex03;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ex03/appContext.xml");

		UserDAO mybatis=ctx.getBean("userDAOMyBatis",UserDAO.class);
		
		int n=mybatis.getUserCount();
		System.out.println("현재 등록 회원수:"+n);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("이름=>");
		String name=sc.next();
		System.out.println("아이디=>");
		String userid=sc.next();
		System.out.println("비밀번호=>");
		String pwd=sc.next();
		
		System.out.println(name+"/"+userid+"/"+pwd);
		
		UserVO user=new UserVO(0, name, userid, pwd, null);
		
		int m=mybatis.createUser(user);
		System.out.println((m>0)?"등록 성공":"등록 실패");
		 
		System.out.println("등록후 회원수: "+mybatis.getUserCount());
	}

}
