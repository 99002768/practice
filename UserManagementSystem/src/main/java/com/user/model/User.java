package com.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="practice")
public class User {
	   String firstname ;
       String lastname;
       String middlename;
       @Id
       String emailid;
       String mobilenumber;
       String stat;
       String cityy;
       String pincodee ;
       String g;
       String aadhaar;
       String pann;
       String password ;
       String confirm;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstname, String lastname, String middlename, String emailid, String mobilenumber, String stat,
			String cityy, String pincodee, String g, String aadhaar, String pann, String password, String confirm) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
		this.emailid = emailid;
		this.mobilenumber = mobilenumber;
		this.stat = stat;
		this.cityy = cityy;
		this.pincodee = pincodee;
		this.g = g;
		this.aadhaar = aadhaar;
		this.pann = pann;
		this.password = password;
		this.confirm = confirm;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getCityy() {
		return cityy;
	}
	public void setCityy(String cityy) {
		this.cityy = cityy;
	}
	public String getPincodee() {
		return pincodee;
	}
	public void setPincodee(String pincodee) {
		this.pincodee = pincodee;
	}
	public String getG() {
		return g;
	}
	public void setG(String g) {
		this.g = g;
	}
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	public String getPann() {
		return pann;
	}
	public void setPann(String pann) {
		this.pann = pann;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", middlename=" + middlename + ", emailid="
				+ emailid + ", mobilenumber=" + mobilenumber + ", stat=" + stat + ", cityy=" + cityy + ", pincodee="
				+ pincodee + ", g=" + g + ", aadhaar=" + aadhaar + ", pann=" + pann + ", password=" + password
				+ ", confirm=" + confirm + "]";
	}
	
       
}
