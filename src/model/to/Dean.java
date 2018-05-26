package model.to;

public class Dean 
{
	String did;
	String dname;
	String fname;
	String type;
	String dob;
	String gender;
	String dqual;
	String exp;
	String contact;
	String email;
	String address;
	String uname;
	String encpass;
	
	public Dean(String did, String dname, String fname, String type,
			String dob, String gender, String dqual, String exp,
			String contact, String email, String address, String uname,
			String encpass) {
		super();
		this.did = did;
		this.dname = dname;
		this.fname = fname;
		this.type = type;
		this.dob = dob;
		this.gender = gender;
		this.dqual = dqual;
		this.exp = exp;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.uname = uname;
		this.encpass = encpass;
	}
		public Dean(String dname) {
		super();
		this.dname = dname;
	}


	public Dean() {
		super();
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDqual() {
		return dqual;
	}

	public void setDqual(String dqual) {
		this.dqual = dqual;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
