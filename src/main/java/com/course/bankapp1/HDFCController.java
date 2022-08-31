package com.course.bankapp1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	@RequestMapping(value="/hdfc") //http://localhost:8080/hdfc
	 public class HDFCController {

		@RequestMapping(value="/savings") //http://localhost:8080/hdfc/savings
		//http://localhost:8080/hdfc/savings ==> hdfcObj.getSavingsAccount();
		public String getSavingsAccount() {
			return "HDFC Savings Account";
		}


		@RequestMapping(value="/current") //http://localhost:8080/hdfc/current

		//http://localhost:8080/hdfc/current==> hdfcObj.getCurrentAccount();
		public String getCurrentAccount() {
			return "HDFC Current Account";
		}

		@RequestMapping(value="/homeloan") //http://localhost:8080/hdfc/homeloan
		////http://localhost:8080/hdfc/homeloan==>hdfcObj.getHomeLoan();
		public String getHomeLoan() {
			return "HDFC Home Loan";
		}

		@RequestMapping(value="/personal") //http://localhost:8080/hdfc/personal
		////http://localhost:8080/hdfc/personal==>hdfcObj.getPersonalLoan();
		public String getPersonalLoan() {
			return "HDFC Personal Loan";
		}
	}



