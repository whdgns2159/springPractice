package ex05;

import java.io.FileWriter;
import java.io.IOException;

//문자열 내용을 파일로 출력하는 클래스
public class FileOutputter implements Outputter{

	private String path;//property
	
	@Override
	public void output(String str) throws IOException{
		FileWriter fw=new FileWriter(path, true);
		fw.write(str);
		
		fw.flush();
		fw.close();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}//////////////////////////////////////////////////
