package ex05;

import java.io.IOException;

//문자열 내용을 콘솔에 출력하는 클래스
public class ConsoleOutputter implements Outputter{

	private String path;//property
	
	@Override
	public void output(String str) throws IOException{
		System.out.println(path);
		System.out.println(str);
		
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}//////////////////////////////////////////////////
