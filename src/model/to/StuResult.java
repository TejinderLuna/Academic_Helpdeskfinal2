package model.to;

public class StuResult 
{
String regno;
String name;
String branch;
String sem;
String mst;
String subject;
String mm;
String pm;
String om;
public StuResult(String regno, String name, String branch, String sem,
		String mst, String subject, String mm, String pm, String om) {
	super();
	this.regno = regno;
	this.name = name;
	this.branch = branch;
	this.sem = sem;
	this.mst = mst;
	this.subject = subject;
	this.mm = mm;
	this.pm = pm;
	this.om = om;
}
public StuResult(String regno,String subject, String mm, String pm, String om) {
	super();
	this.regno = regno;
	this.subject = subject;
	this.mm = mm;
	this.pm = pm;
	this.om = om;
}
public StuResult() {
	super();
}
public String getRegno() {
	return regno;
}
public void setRegno(String regno) {
	this.regno = regno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public String getMst() {
	return mst;
}
public void setMst(String mst) {
	this.mst = mst;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMm() {
	return mm;
}
public void setMm(String mm) {
	this.mm = mm;
}
public String getPm() {
	return pm;
}
public void setPm(String pm) {
	this.pm = pm;
}
public String getOm() {
	return om;
}
public void setOm(String om) {
	this.om = om;
}
}
