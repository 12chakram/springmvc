package dw.spring3.rest.managers.impl;

import java.util.List;
import org.hibernate.Session;
import com.springmvc.common.EntityManagerFactory;
import dw.spring3.rest.bean.Employee;
import dw.spring3.rest.managers.EmployeeManager;

public class JpaEmployeeManager implements EmployeeManager {

	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		try{
		Session em =  EntityManagerFactory.get();
		   // StringBuffer queryString = new StringBuffer("select bu from BusinessUser bu where bu.userId='"+userId+"'");
			StringBuffer queryString = new StringBuffer("from Employee");
			em.getTransaction().begin();
			org.hibernate.Query q =  em.createQuery(queryString.toString());
			List<Employee> employees= q.list();
			em.getTransaction().commit();
			return employees;
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println(ex.getLocalizedMessage());
		}
		return null;
		
	}

}
