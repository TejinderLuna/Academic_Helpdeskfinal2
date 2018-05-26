package model.to;

public class HOD 
{
	String hid;
	String hname;
	String fname;
	String type;
	String dob;
	String gender;
	String hqual;
	String kskills;
	String hdept;
	String contact;
	String email;
	String address;
	String uname;
	String encpass;
	
	
	public HOD(String hid, String hname, String fname, String dob,
			String gender, String hqual, String kskills, String hdept,
			String contact, String email, String address, String uname) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.fname = fname;
		this.dob = dob;
		this.gender = gender;
		this.hqual = hqual;
		this.kskills = kskills;
		this.hdept = hdept;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.uname = uname;
	}
	public HOD(String hname) {
		super();
		this.hname = hname;
	}
	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
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
	public String getHqual() {
		return hqual;
	}
	public void setHqual(String hqual) {
		this.hqual = hqual;
	}
	public String getKskills() {
		return kskills;
	}
	public void setKskills(String kskills) {
		this.kskills = kskills;
	}
	public String getHdept() {
		return hdept;
	}
	public void setHdept(String hdept) {
		this.hdept = hdept;
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
	public HOD(String hid, String hname, String fname, String type, String dob,
			String gender, String hqual, String kskills, String hdept,
			String contact, String email, String address, String uname,
			String encpass) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.fname = fname;
		this.type = type;
		this.dob = dob;
		this.gender = gender;
		this.hqual = hqual;
		this.kskills = kskills;
		this.hdept = hdept;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.uname = uname;
		this.encpass = encpass;
	}
	public HOD() {
		super();
	}
	
	
}
