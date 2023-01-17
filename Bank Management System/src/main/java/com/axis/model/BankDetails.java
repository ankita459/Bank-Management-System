package com.axis.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BankDetails")

public class BankDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	
	@Column(name = "bank_name")
	private String bankName;  
	
	@Column(name = "name")
    private String name; 
	
    private long accNumber;
    
    //Appointments
    private Date date;
	private String location;
	private String description;
	private boolean confirmed;
    
	//PrimaryAccount
    private BigDecimal accountBalance;
    
    //PrimaryTransaction
    private String type;
	private String status;
	
	//Recipient
	private String email;
	private String phone;
	
	//User
	private String username;
	private String password;
	
	
    @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "BankDetails [id=" + id + ", bankName=" + bankName + ", accHolderName=" + name + ", accNumber="
				+ accNumber + ", date=" + date + ", location=" + location + ", description=" + description
				+ ", confirmed=" + confirmed + ", accountBalance=" + accountBalance + ", type=" + type + ", status="
				+ status + ", email=" + email + ", phone=" + phone + ", username=" + username + ", password=" + password
				+ ", hashCode()=" + hashCode() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone() + ", getType()=" + getType()
				+ ", getStatus()=" + getStatus() + ", getAccountBalance()=" + getAccountBalance() + ", getDate()="
				+ getDate() + ", getLocation()=" + getLocation() + ", getDescription()=" + getDescription()
				+ ", isConfirmed()=" + isConfirmed() + ", getBankName()=" + getBankName() + ", getId()=" + getId()
				+ ", getAccHolderName()=" + getAccHolderName() + ", getAccNumber()=" + getAccNumber() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	
	/**
	 * 
	 */
	public BankDetails() {
		super();
	}

	/**
	 * @param id
	 * @param bankName
	 * @param accHolderName
	 * @param accNumber
	 * @param date
	 * @param location
	 * @param description
	 * @param confirmed
	 * @param accountBalance
	 * @param type
	 * @param status
	 * @param email
	 * @param phone
	 * @param username
	 * @param password
	 */
	public BankDetails(long id, String bankName, String accHolderName, long accNumber, Date date, String location,
			String description, boolean confirmed, BigDecimal accountBalance, String type, String status, String email,
			String phone, String username, String password) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.name = name;
		this.accNumber = accNumber;
		this.date = date;
		this.location = location;
		this.description = description;
		this.confirmed = confirmed;
		this.accountBalance = accountBalance;
		this.type = type;
		this.status = status;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param username
	 * @param password
	 */
	

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @param email
	 * @param phone
	 */
	public BankDetails(String email, String phone) {
		super();
		this.email = email;
		this.phone = phone;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param type
	 * @param status
	 */
	

	/**
	 * @return the accountBalance
	 */
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * @param accountBalance
	 */
	public BankDetails(BigDecimal accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	/**
	 * 
	 */
	
	/**
	 * @param date
	 * @param location
	 * @param description
	 * @param confirmed
	 */
	public BankDetails(Date date, String location, String description, boolean confirmed) {
		super();
		this.date = date;
		this.location = location;
		this.description = description;
		this.confirmed = confirmed;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the confirmed
	 */
	public boolean isConfirmed() {
		return confirmed;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param confirmed the confirmed to set
	 */
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	
    

	/**
	 * 
	 */
	

	/**
	 * @param bankName
	 * @param accHolderName
	 * @param accNumber
	 */
	public BankDetails(String bankName, String accHolderName, long accNumber,long id ) {
		super();
		this.bankName = bankName;
		this.name = accHolderName;
		this.accNumber = accNumber;
		this.id = id;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the accHolderName
	 */
	public String getAccHolderName() {
		return name;
	}

	/**
	 * @param accHolderName the accHolderName to set
	 */
	public void setAccHolderName(String accHolderName) {
		this.name = accHolderName;
	}

	/**
	 * @return the accNumber
	 */
	public long getAccNumber() {
		return accNumber;
	}

	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	
    

}
