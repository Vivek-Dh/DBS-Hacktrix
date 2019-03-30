package dbs.hackathon.team13.remorides.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dbs.hackathon.team13.remorides.wrappers.LoanDetails;

@RestController
public class MainController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private LoanService loanService;
	@GetMapping("/users/name/{name}")
	public List<Customer> getCustomers(@PathVariable("name") String name) {
		return customerService.findCustomers(name);
	}
	@GetMapping("/users/id/{userid}")
	public Customer getCustomer(@PathVariable("userid") String userId) {
		return customerService.findCustomer(userId);
	}
	@GetMapping("/loan/checkEligibility/{userid}")
	public boolean checkEligibility(@PathVariable("userid") String userId) {
		return customerService.checkEligibility(userId);
	}
	@PostMapping(value="/createLoan/{userid}" ,consumes = {"application/json"})
	public void createLoan(@PathVariable("userid") String userId,@RequestBody LoanDetails loanDetails) {
		loanService.createLoan(loanDetails);
	}
}
