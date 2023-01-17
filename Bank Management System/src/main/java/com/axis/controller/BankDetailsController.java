package com.axis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.axis.model.BankDetails;
import com.axis.repository.BankDetailsRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@Controller
@RestController
@RequestMapping("/api/v1")
public class BankDetailsController<PrimaryTransaction, User> {
	
	@Autowired
	private BankDetailsRepository bankdetailsRepository;
	
	// get all BankDetails
		@GetMapping("/get")
		public List<BankDetails> getAllBankDetails(){
			return this.bankdetailsRepository.findAll();
		}
		
		// get BankDetails by id
		@GetMapping("/{id}")
		public BankDetails getUserById1(@PathVariable (value = "id") long userId) {
			return this.bankdetailsRepository.findById(userId).orElseThrow();
		}
			// create user
			@PostMapping("/BankDetail")
			public BankDetails createUser(@RequestBody BankDetails bankdetails) {
				return this.bankdetailsRepository.save(bankdetails);
				
			}
			// update BankDetails
			@PutMapping("/{id}")
			public BankDetails updateUser(@RequestBody BankDetails bankdetails, @PathVariable ("id") long userId) {
				BankDetails existingUser = this.bankdetailsRepository.findById(userId).orElseThrow();
				existingUser.setBankName(bankdetails.getBankName());
				existingUser.setAccHolderName(bankdetails.getAccHolderName());
				existingUser.setAccNumber(bankdetails.getAccNumber());
				return this.bankdetailsRepository.save(existingUser);
			}
			
			// delete BankDetails by id
			@DeleteMapping("/{id}")
			public ResponseEntity<BankDetails> deleteBankDetails(@PathVariable ("id") long userId){
				BankDetails existingBankDetails = this.bankdetailsRepository.findById(userId).orElseThrow();
				this.bankdetailsRepository.delete(existingBankDetails);
				return ResponseEntity.ok().build();
			}  

		    @RequestMapping(value = "/create",method = RequestMethod.GET)
		    public String createAppointment(Model model) {
		    	BankDetails bankdetails = new BankDetails();
		        model.addAttribute("appointment", bankdetails);
		        model.addAttribute("dateString", "");

		        return "appointment";
		    }
		    
		    @RequestMapping(value = "/deposit", method = RequestMethod.GET)
		    public String deposit(Model model) {
		        model.addAttribute("accountType", "");
		        model.addAttribute("amount", "");

		        return "deposit";
		    }
		    
		    @RequestMapping(value = "/withdraw", method = RequestMethod.GET)
		    public String withdraw(Model model) {
		        model.addAttribute("accountType", "");
		        model.addAttribute("amount", "");

		        return "withdraw";
		    }
		    
		    @RequestMapping("/")
			public String home() {
				return "redirect:/index";
			}
		    
		    @RequestMapping("/index")
		    public String index() {
		        return "index";
		    }
		    
		    @RequestMapping(value = "/betweenAccounts", method = RequestMethod.GET)
		    public String betweenAccounts(Model model) {
		        model.addAttribute("transferFrom", "");
		        model.addAttribute("transferTo", "");
		        model.addAttribute("amount", "");

		        return "betweenAccounts";
		    }
		    @ResponseStatus(HttpStatus.BAD_REQUEST)
		    @ExceptionHandler(MethodArgumentNotValidException.class)
		    public Map<String, String> handleValidationExceptions(
		            MethodArgumentNotValidException ex) {
		        Map<String, String> errors = new HashMap<>();

		        ex.getBindingResult().getAllErrors().forEach((error) -> {
		            String fieldName = ((FieldError) error).getField();
		            String errorMessage = error.getDefaultMessage();
		            errors.put(fieldName, errorMessage);
		        });

		        return errors;
		    }

}
