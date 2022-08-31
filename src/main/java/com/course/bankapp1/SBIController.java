package com.course.bankapp1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	//RestController is registering SBIController to IOC with the name as /sbi
	//RestController is updating dispatchservelet with /sbi
	//http://localhost:8080/sbi ==>SBIController sbiObj=ioc.getSBIController();
	//Every RequestMapping should be unique in the java project
	//RequestMapping at Class level+ RequestMapping at API level Should be unique
	@RequestMapping(value="/sbi")
	public class SBIController {

		@RequestMapping(value="/savings") //http://localhost:8080/sbi/savings
		//http://localhost:8080/sbi/savings ==> sbiObj.getSavingsAccount();
		public String getSavingsAccount() {
			return "SBI Savings Account";
		}

		@RequestMapping(value="/current") //http://localhost:8080/sbi/current

		//http://localhost:8080/sbi/current==> sbiObj.getCurrentAccount();
		public String getCurrentAccount() {
			return "SBI Current Account";
		}

		@RequestMapping(value="/homeloan") //http://localhost:8080/sbi/homeloan
		////http://localhost:8080/sbi/homeloan==>sbiObj.getHomeLoan();
		public String getHomeLoan() {
			return "SBI Home Loan";
		}

		@RequestMapping(value="/personal") //http://localhost:8080/sbi/personal
		////http://localhost:8080/sbi/personal==>sbiObj.getPersonalLoan();
		public String getPersonalLoan() {
			return "SBI Personal Loan";
		}


		@RequestMapping(value="/carloan") //http://localhost:8080/sbi/carloan
		////http://localhost:8080/sbi/carloan==>sbiObj.getCarloan();
		public String getCarLoan() {
			return "SBI Car Loan";
		}

	}



