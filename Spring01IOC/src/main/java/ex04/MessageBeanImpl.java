package ex04;

import java.util.Date;

public class MessageBeanImpl implements MessageBean{
	
	private String greeting; //property, instance variable
	private String name;
	
	private String msg; //이 둘은 setter, getter를 만들지 않고
	private int money; // 생성자를 통해 주입하도록 해보자
	
	private Date today; //실습 setter방식 혹은 constructor방식으로 입력해보자
	
	public MessageBeanImpl() {
		
	}
	
	public MessageBeanImpl(String msg, int money) {
		this.money=money;
		this.msg=msg;
	}
	
	public MessageBeanImpl(String greeting, String name, Date today) {
		this.greeting=greeting;
		this.name=name;
		this.today=today;
	}
	//기본생성자를 엉망으로 만들어버려서 Bean설정이 안된다. 
	//그러므로 꼭 기본생성자를 만들어두도록 하자.
	//-------------------------------------------------
	
	@Override
	public void sayHello() {
		if(today!=null) {
			System.out.println("----["+today.toString()+"]----");
		}
		System.out.println(greeting+" "+name+"님~~");
	}
	@Override
	public void sayHi(String ... args) {
		if(args!=null) {
			for(String name:args) {
				System.out.println(name+"님 ~"+msg+">>"+money+"원만 주세요");
			}
		}
	}
	
//------------------------------------------------------
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
