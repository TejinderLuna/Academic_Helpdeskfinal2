package model.to;

public class Bulletin 
{
String srno;
String info;
public Bulletin() {
	super();
}
public Bulletin(String srno, String info) {
	super();
	this.srno = srno;
	this.info = info;
}
public String getSrno() {
	return srno;
}
public void setSrno(String srno) {
	this.srno = srno;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}

}
