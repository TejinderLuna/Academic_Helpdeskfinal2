package model.to;

public class Placement 
{
String srno;
String cname;
String cdesc;
String eligibility;
String skills;
String loc;
String post;
String pkg;
String nor;
String round;
String doa;
String rtime;
String nov;
String status;

public Placement(String srno,String cname, String cdesc, String eligibility, String skills,
		String loc, String post, String pkg, String nor, String round,
		String doa, String rtime, String nov, String status) {
	super();
	this.srno=srno;
	this.cname = cname;
	this.cdesc = cdesc;
	this.eligibility = eligibility;
	this.skills = skills;
	this.loc = loc;
	this.post = post;
	this.pkg = pkg;
	this.nor = nor;
	this.round = round;
	this.doa = doa;
	this.rtime = rtime;
	this.nov = nov;
	this.status = status;
}

public Placement() {
	super();
}

public String getSrno() {
	return srno;
}

public void setSrno(String srno) {
	this.srno = srno;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getCdesc() {
	return cdesc;
}

public void setCdesc(String cdesc) {
	this.cdesc = cdesc;
}

public String getEligibility() {
	return eligibility;
}

public void setEligibility(String eligibility) {
	this.eligibility = eligibility;
}

public String getSkills() {
	return skills;
}

public void setSkills(String skills) {
	this.skills = skills;
}

public String getLoc() {
	return loc;
}

public void setLoc(String loc) {
	this.loc = loc;
}

public String getPost() {
	return post;
}

public void setPost(String post) {
	this.post = post;
}

public String getPkg() {
	return pkg;
}

public void setPkg(String pkg) {
	this.pkg = pkg;
}

public String getNor() {
	return nor;
}

public void setNor(String nor) {
	this.nor = nor;
}

public String getRound() {
	return round;
}

public void setRound(String round) {
	this.round = round;
}

public String getDoa() {
	return doa;
}

public void setDoa(String doa) {
	this.doa = doa;
}

public String getRtime() {
	return rtime;
}

public void setRtime(String rtime) {
	this.rtime = rtime;
}

public String getNov() {
	return nov;
}

public void setNov(String nov) {
	this.nov = nov;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

}
