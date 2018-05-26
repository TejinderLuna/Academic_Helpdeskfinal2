package model.to;

public class Student 
{
	int regno;
	String name;
	String gender;
	String fname;
	String mname;
	String dob;
	String State;
	String city;
	String address;
	String contact;
	String email;
	String branch;
	String sem;
	String uname;
	String encpass;
	public Student() {
		super();
	}
	public Student(int regno, String name, String gender, String fname,
			String mname, String dob, String state, String city,
			String address, String contact, String email, String branch,String sem,
			String uname, String encpass) {
		super();
		this.regno = regno;
		this.name = name;
		this.gender = gender;
		this.fname = fname;
		this.mname = mname;
		this.dob = dob;
		State = state;
		this.city = city;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.branch = branch;
		this.sem = sem;
		this.uname = uname;
		this.encpass = encpass;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEncpass() {
		return encpass;
	}
	public void setEncpass(String encpass) {
		this.encpass = encpass;
	}
	
	}
