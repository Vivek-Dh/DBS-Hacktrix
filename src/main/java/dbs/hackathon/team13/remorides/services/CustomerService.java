package dbs.hackathon.team13.remorides.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import dbs.hackathon.team13.remorides.controller.Customer;

import dbs.hackathon.team13.remorides.wrappers.LoanDetails;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private LoanRepository loanRepository;
	
	public List<Customer> getCustomers(String name) {
		return customerRepository.findCustomers(name);
	}
	
	public Customer getCustomer(String userId) {
		return customerRepository.findCustomer(userId);
	}

	public boolean checkEligibility(String userId) {
		return customerRepository.checkEligibility(userId);
	}

	public void createLoan(@RequestBody LoanDetails loanDetails) {
		loanRepository.createLoan(loanDetails);
	}
}
