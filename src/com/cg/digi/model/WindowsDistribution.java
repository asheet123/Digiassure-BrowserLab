package com.cg.digi.model;

public class WindowsDistribution {
private String windowsdistributiondetailsid;
private String windowsid;
private String version;
private String rate;
private String status;
private String createdby;
private String creationtime;
private String modifiedby;
private String modifiedtime;
public WindowsDistribution() {
	super();
}
public WindowsDistribution(String windowsdistributiondetailsid, String windowsid, String version, String rate, String status,
		String createdby, String creationtime, String modifiedby, String modifiedtime) {
	super();
	this.windowsdistributiondetailsid = windowsdistributiondetailsid;
	this.windowsid = windowsid;
	this.version = version;
	this.rate = rate;
	this.status = status;
	this.createdby = createdby;
	this.creationtime = creationtime;
	this.modifiedby = modifiedby;
	this.modifiedtime = modifiedtime;
}
public String getWindowsdistributiondetailsid() {
	return windowsdistributiondetailsid;
}
public void setWindowsdistributiondetailsid(String windowsdistributiondetailsid) {
	this.windowsdistributiondetailsid = windowsdistributiondetailsid;
}
public String getWindowsid() {
	return windowsid;
}
public void setWindowsid(String windowsid) {
	this.windowsid = windowsid;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public String getRate() {
	return rate;
}
public void setRate(String rate) {
	this.rate = rate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getCreatedby() {
	return createdby;
}
public void setCreatedby(String createdby) {
	this.createdby = createdby;
}
public String getCreationtime() {
	return creationtime;
}
public void setCreationtime(String creationtime) {
	this.creationtime = creationtime;
}
public String getModifiedby() {
	return modifiedby;
}
public void setModifiedby(String modifiedby) {
	this.modifiedby = modifiedby;
}
public String getModifiedtime() {
	return modifiedtime;
}
public void setModifiedtime(String modifiedtime) {
	this.modifiedtime = modifiedtime;
}
@Override
public String toString() {
	return "WindowsDistribution [windowsdistributiondetailsid=" + windowsdistributiondetailsid + ", windowsid=" + windowsid + ", version="
			+ version + ", rate=" + rate + ", status=" + status + ", createdby=" + createdby + ", creationtime="
			+ creationtime + ", modifiedby=" + modifiedby + ", modifiedtime=" + modifiedtime + "]";
}




}
