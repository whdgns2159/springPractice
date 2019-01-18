package ex02;

import java.util.Random;

public class EmpImpl implements Emp {
	
	//property
	private String name;
	private int sal;
	private String dept;
	private Random ran;
	
	//이름 급여 부서
	public EmpImpl(String name, int sal, String dept) {
		super();
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	
	//이름과 급여
	public EmpImpl(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	//이름만
	public EmpImpl(String name) {
		super();
		this.name = name;
	}
	
	//랜덤만
	public EmpImpl(Random ran) {
		super();
		this.ran = ran;
	}

	//기본생성자
	public EmpImpl() {
		
	}
	
	@Override
	public void info1() {
		System.out.println("Name: "+name);

	}

	@Override
	public void info2() {
		info1();
		System.out.println("Salary: "+sal);
	}

	@Override
	public void info3() {
		info2();
		System.out.println("Dept: "+dept);

	}

	@Override
	public void info4() {
		System.out.println("난수:"+ran.nextInt(100));

	}

}
