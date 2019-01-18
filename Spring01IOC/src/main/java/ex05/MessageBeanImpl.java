package ex05;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean{
	
	private String msg;
	private int money;
	
	private Outputter out; //참조형 property
	
	public void MessageBeanImpl(){
		
	}//기본생성자
	
	//setter, getter
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	public Outputter getOut() {
		return out;
	}
	public void setOut(Outputter out) {
		this.out = out;
	}




	@Override
	public void sayHi(String ... args) {
		if(args!=null) {
			for(String a:args) {
				try {
					out.output(a+"님아~~"+msg+">>"+money+"원만~");
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}//for
		}//if
	}//sayHi
}/////////////////////////////////////////////////////////
