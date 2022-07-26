package oop2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Logger logger = new DatabaseLogger();
		Logger logger2 = new CloudLogger();
		CustomerManager customerManager = new CustomerManager(logger);
		//customerManager.add(new Customer());
		List<Logger> loggers =new ArrayList<>();
		loggers.add(logger2);
		loggers.add(logger);
		
		
		EmployeeManager employeeManager = new EmployeeManager(loggers);
		employeeManager.add(new Employee());
	}

}
