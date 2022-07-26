package oop2;

import java.util.List;

public class EmployeeManager {
	private List<Logger> loggers;
		
		public EmployeeManager(List<Logger> loggers) {
		super();
		this.loggers = loggers;
	}
		public void log(String mesaj) {
			for(Logger logs: this.loggers) {
				logs.log("Loglandı: asfas");
			}
		}
		

		public void add(Employee employee) {
			System.out.println("employee added");
		     log(employee.getFirstName());

			
		}
			public void update(Employee employee) {
				System.out.println("Customer updated");
				log(employee.getFirstName());
		
		
			}
			
			
	

}
//çoklu loglama imkani getiriniz 