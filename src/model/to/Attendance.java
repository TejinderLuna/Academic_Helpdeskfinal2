package model.to;

public class Attendance {
	int total;
	String subject;
	String regno;
	String name;
	String branch;
	String sem;
	String present;
	double per;
	public Attendance() {
		super();
	}
	public Attendance(int total,String subject, String regno, String name, String branch,
			String sem, String present,double per) {
		super();
		this.total = total;
		this.subject=subject;
		this.regno = regno;
		this.name = name;
		this.branch = branch;
		this.sem = sem;
		this.present = present;
		this.per=per;
	}
	public Attendance(String regno,String subject,int total,String present,double per) {
		super();
		this.regno = regno;
		this.subject=subject;
		this.total = total;
		this.present = present;
		this.per=per;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
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
	public String getPresent() {
		return present;
	}
	public void setPresent(String present) {
		this.present = present;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	

}
