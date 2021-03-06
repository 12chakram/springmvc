package dw.spring3.rest.controller;

import java.io.StringReader;
import java.util.List;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dw.spring3.rest.bean.Employee;
import dw.spring3.rest.bean.EmployeeList;
import dw.spring3.rest.services.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	private Jaxb2Marshaller jaxb2Mashaller;
	
	public void setJaxb2Mashaller(Jaxb2Marshaller jaxb2Mashaller) {
		this.jaxb2Mashaller = jaxb2Mashaller;
	}

	private static final String XML_VIEW_NAME = "employees";
	
	/*@RequestMapping(method=RequestMethod.GET, value="/employee/{id}")
	public ModelAndView getEmployee(@PathVariable String id) {
		Employee e = employeeService.get(Long.parseLong(id));
		return new ModelAndView(XML_VIEW_NAME, "object", e);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
	public ModelAndView updateEmployee(@RequestBody String body) {
		Source source = new StreamSource(new StringReader(body));
		Employee e = (Employee) jaxb2Mashaller.unmarshal(source);
		employeeService.update(e);
		return new ModelAndView(XML_VIEW_NAME, "object", e);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employee")
	public ModelAndView addEmployee(@RequestBody String body) {
		Source source = new StreamSource(new StringReader(body));
		Employee e = (Employee) jaxb2Mashaller.unmarshal(source);
		employeeService.add(e);
		return new ModelAndView(XML_VIEW_NAME, "object", e);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employee/{id}")
	public ModelAndView removeEmployee(@PathVariable String id) {
		employeeService.remove(Long.parseLong(id));
		List<Employee> employees = employeeService.getAll();
		EmployeeList list = new EmployeeList(employees);
		return new ModelAndView(XML_VIEW_NAME, "employees", list);
	}*/
	
	@RequestMapping(method=RequestMethod.GET, value="/employees")
	public ModelAndView getEmployees() {
		List<Employee> employees = employeeService.getAll();
		EmployeeList list = new EmployeeList(employees);
		return new ModelAndView(XML_VIEW_NAME, "employees", list);
	}
	
}
