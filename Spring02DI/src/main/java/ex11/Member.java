package ex11;

import org.springframework.beans.factory.annotation.Value;

public class Member {

	@Value("홍길동")
	private String name;
	
	@Value("010-2222-2222")
	private String tel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", tel=" + tel + "]";
	}
	
	
}
