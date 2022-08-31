package com.course.bankapp2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

	@RequestMapping(value="/icici")
	public class ICICIController {

		@RequestMapping(value="/savings") //http://localhost:8088/icici/savings
		//http://localhost:8088/icici/savings ==> iciciObj.getSavingsAccount();
		public String getSavingsAccount() {
			return "ICICI Savings Account";
		}

		@RequestMapping(value="/current") //http://localhost:8088/icici/current

		//http://localhost:8088/icici/current==> iciciObj.getCurrentAccount();
		public String getCurrentAccount() {
			return "ICICI Current Account";
		}

		
}
