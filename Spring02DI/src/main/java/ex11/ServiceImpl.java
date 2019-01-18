package ex11;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/*Annotation으로 주입 방법
 * [1] @Autowired => 참조형 주입시 사용
 * 					by Type으로 주입함(자료유형으로)
 * [2] @Resource => 참조형 주입시 사용
 * 					by Name으로 주입함(Bean 이름으로 주입)
 * [3] @Value =>주로 기본자료형일때사용
 * [4] @Inject => javax.inject 라이브러리를 pom.xml에 등록 해야 사용가능
 * */
public class ServiceImpl implements Service {

	@Autowired
	@Qualifier("empBean2")
	private Emp emp; // Emp와 Member는 객체라서 @Value로는 등록이 안됨
	// 만약 Emp타입의 객체가 2개 이상이라면 @Qualifier(Bean이름)으로 
	//정확히 어떤 객체를 사용할것인지 지정해주면된다.

	@Resource(name="memberBean")
	private Member user;

	@Value("A001")
	private String svcId;

	@Override
	public void test1() {
		System.out.println(emp.toString());
	}

	@Override
	public void test2() {
		System.out.println(user.toString());
	}
}
