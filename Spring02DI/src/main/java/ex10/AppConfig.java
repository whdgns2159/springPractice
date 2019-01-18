package ex10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration

public class AppConfig {
	
	//admin.properties에 기술된adminId키에 해당하는 value값을 주입해준다.
	
	@Value("${adminId}")
	private String adminId;
	
	@Value("${adminPwd}")
	private String adminPwd;
	
	@Value("scott")
	private String subAdminId;
	
	@Value("tiger")
	private String subAdminPwd;
	
	//외부파일(properties)의 데이터 얻어오기
	@Bean
	//
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer config
		=new PropertySourcesPlaceholderConfigurer();
		
		Resource res=new ClassPathResource("ex10/admin.properties");
		
		config.setLocation(res);
		
		return config;
	}
	
	@Bean
	@Scope("prototype")
	public AdminInfo admin3() {
		AdminInfo a=new AdminInfo();
		a.setAdminId(adminId);
		a.setAdminPwd(adminPwd);
		
		return a;
	}
	
	@Bean
	public AdminInfo admin4() {
		AdminInfo b=admin3();
		b.setAdminId(subAdminId);
		b.setAdminPwd(subAdminPwd);
		
		return b;
	}
}
