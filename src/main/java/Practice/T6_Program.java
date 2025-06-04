package Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
	int empId;
	String empName;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Tests.Employee{" +
				       "empId=" + empId +
				       ", empName='" + empName + '\'' +
				       '}';
	}
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
}
	
	public class T6_Program implements Comparator {
		public void test(List<Employee> list) {
		
		
		}
		public static void main(String[] args) {
			List<Employee> list = new ArrayList<>();
			list.add(new Employee(1, "A"));
			list.add(new Employee(1, "B"));
		}
		
		@Override
		public int compare(Object o1, Object o2) {
				return 1;
		}
	}
	

