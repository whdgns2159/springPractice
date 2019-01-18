package ex11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	//Emp를 빈으로 등록하는 메소드 구성
	@Bean
	public Emp empBean() {
		Emp e=new Emp();
		e.setName("강인겸");
		e.setDept("SALES");
		e.setSalary(3800);
		
		return e;
	}
	
	@Bean
	public Emp empBean2() {
		Emp e=new Emp();
		e.setName("홍만식");
		e.setDept("MANAGE");
		e.setSalary(6500);
		
		return e;
	}
	//Member를 빈으로 등록하는 메소드 구성
	@Bean
	public Member memberBean() {
		Member m=new Member();
		
		return m;
	}
	
	//ServiceImpl을 빈으로 등록하는 메소드 구성
	@Bean
	public ServiceImpl siBean() {
		return new ServiceImpl();
	}
}
