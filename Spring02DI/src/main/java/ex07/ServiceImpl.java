package ex07;

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
		System.out.printf("Name: %s\nDept: %s\nSalary:%d\n"
				,emp.getName(),emp.getDept(),emp.getSalary());
	}
	
	
	

}
