package ex05;

public class ServiceImpl implements Service{
	
	private Emp emp;

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.printf("Name: %s\nDept: %s\nSalary:%d\n",emp.getName(),emp.getDept(),emp.getSalary());
	}
	
	
	

}
