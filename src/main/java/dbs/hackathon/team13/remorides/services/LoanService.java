package dbs.hackathon.team13.remorides.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dbs.hackathon.team13.remorides.wrappers.LoanDetails;

@Service
public class LoanService {
	
	@Autowired
	LoanRepository loanRepository;
	public void createLoan(LoanDetails loanDetails) {
		loanRepository.createLoan(loanDetails);
	}
}
