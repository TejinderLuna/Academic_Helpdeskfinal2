package model.to;

public class StuLeave 
{
String regno;
String lid;
String tdept;
String tname;
String sem;
String hostel;
String subject;
String to;
String from;
String cd;
String status;

public StuLeave(String regno, String lid, String tdept, String tname,
		String sem, String hostel, String subject, String to, String from,
		String cd, String status) {
	super();
	this.regno = regno;
	this.lid = lid;
	this.tdept = tdept;
	this.tname = tname;
	this.sem = sem;
	this.hostel = hostel;
	this.subject = subject;
	this.to = to;
	this.from = from;
	this.cd = cd;
	this.status = status;
}
public StuLeave() {
	super();
}
public String getRegno() {
	return regno;
}
public void setRegno(String regno) {
	this.regno = regno;
}
public String getLid() {
	return lid;
}
public void setLid(String lid) {
	this.lid = lid;
}
public String getTdept() {
	return tdept;
}
public void setTdept(String tdept) {
	this.tdept = tdept;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getSem() {
	return sem;
}
public void setSem(String sem) {
	this.sem = sem;
}
public String getHostel() {
	return hostel;
}
public void setHostel(String hostel) {
	this.hostel = hostel;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getCd() {
	return cd;
}
public void setCd(String cd) {
	this.cd = cd;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
