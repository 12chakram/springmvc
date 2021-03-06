package dw.spring3.rest.services;

import java.util.List;

import dw.spring3.rest.bean.Employee;
import dw.spring3.rest.managers.EmployeeManager;

public class EmployeeService {
	
	private EmployeeManager employeeManager;

	/*private static Map<Long, Employee> allEmployees;
	static {
		allEmployees = new HashMap<Long, Employee>();
		Employee e1 = new Employee(1L, "Huang Yi Ming", "huangyim@cn.ibm.com");
		Employee e2 = new Employee(2L, "Wu Dong Fei", "wudongf@cn.ibm.com");
		allEmployees.put(e1.getId(), e1);
		allEmployees.put(e2.getId(), e2);
	}
	
	public void add(Employee e) {
		allEmployees.put(e.getId(), e);
	}

	public Employee get(long id) {
		return allEmployees.get(id);
	}*/

	/*public List<Employee> getAll() {
		List<Employee> employees = new ArrayList<Employee>();
		for( Iterator<Employee> it = allEmployees.values().iterator(); it.hasNext(); ) {
			Employee e = it.next();
			employees.add(e);
		}
		return employees;
	}*/
	

	/*public void remove(long id) {
		allEmployees.remove(id);
	}

	public void update(Employee e) {
		allEmployees.put(e.getId(), e);
	}*/
	
	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}

	public List<Employee> getAll() {
		return employeeManager.getAllEmployees();
	}

}
