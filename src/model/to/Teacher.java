package model.to;


public class Teacher 
{
	int tid;
	String tname;
	String type;
	String fname;
	String dob;
	String gender;
	String tqual;
	String kskills;
	String desig;
	String tdept;
	String contact;
	String email;
	String address;
	String uname;
	String encpass;
	
	public Teacher(int tid, String tname, String type, String fname,
			String dob, String gender, String tqual, String kskills,
			String desig, String tdept, String contact, String email,
			String address, String uname, String encpass) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.type = type;
		this.fname = fname;
		this.dob = dob;
		this.gender = gender;
		this.tqual = tqual;
		this.kskills = kskills;
		this.desig = desig;
		this.tdept = tdept;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.uname = uname;
		this.encpass = encpass;
	}
	public Teacher(int tid, String tname, String type, String fname,
			String dob, String gender, String tqual, String kskills,
			String desig, String tdept, String contact, String email,
			String address, String uname) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.type = type;
		this.fname = fname;
		this.dob = dob;
		this.gender = gender;
		this.tqual = tqual;
		this.kskills = kskills;
		this.desig = desig;
		this.tdept = tdept;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.uname = uname;
	}
	public Teacher(String tname) {
		super();
	this.tname=tname;
	}
	public Teacher() {
		super();
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
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

	public String getTqual() {
		return tqual;
	}

	public void setTqual(String tqual) {
		this.tqual = tqual;
	}

	public String getKskills() {
		return kskills;
	}

	public void setKskills(String kskills) {
		this.kskills = kskills;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getTdept() {
		return tdept;
	}

	public void setTdept(String tdept) {
		this.tdept = tdept;
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
