package com.nt.vo;

public class CustomerVO {
private String cname;
private String cadd;
private String pAmt;
private String rate;
private String time;
//getter and setter method
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public String getpAmt() {
	return pAmt;
}
public void setpAmt(String pAmt) {
	this.pAmt = pAmt;
}
public String getRate() {
	return rate;
}
public void setRate(String rate) {
	this.rate = rate;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
//toString method
@Override
public String toString() {
	return "CustomerVO [cname=" + cname + ", cadd=" + cadd + ", pAmt=" + pAmt + ", rate=" + rate + ", time=" + time
			+ "]";
}


}
