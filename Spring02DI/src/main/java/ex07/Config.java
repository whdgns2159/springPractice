package ex07;
//자바로 스프링빈을 설정하는 방법

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//annotation을 통해 현재 Config클래스가 IOC컨테이너임을 명시
@Configuration //현재 클래스를 환경설정으로 사용함을 의미한다.
public class Config {
	//Emp빈을 생성하고자 한다면 annotation으로 prop을 설정한다.
	
	@Bean(name="e1")
	//@Scope(value="prototype") //디폴트값은 singleton이다.
	//스프링은 기본적으로 빈의 범위를 싱글톤으로 설정한다.
	//만일 싱글톤이 아니라 매번 다른 객체로 생성하고 싶다면 prototype으로
	//값을 주자
	public Emp empInfo() {
		Emp e=new Emp("King","Sales",5000);
		return e;
	}
	
	//Emp빈 생성해보자 e3 => 이름, 부서, 연봉 지정해서 반환
	@Bean(name="e3")
	public Emp empInfo2() {
		return new Emp("Maven", "Sales", 4500);
	}
	
	//bean에 이름을 지정해주지 않으면 어떻게될까
	@Bean
	public Emp empInfo3() {
		return new Emp("stive", "Sales", 3700);
	}
	
	//Date객체를 반환하는 메소드 구성하고 빈으로 등록하세요
	//date객제 찾아서 출력해보기
	@Bean
	public Date today() {
		return new Date();
	}
	
	//ServiceImpl빈을 반환하는 메소드 구성하고 빈으로 등록하세요
	//ServieImpl빈에선 Emp빈을 주입받아야한다. Wilson emp빈을 주입해보세요
	
	@Bean(name="svc")
	public ServiceImpl testImpl() {
		ServiceImpl s=new ServiceImpl();
		s.setEmp(empInfo3());
		
		return s;
	}
}














