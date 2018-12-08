package com.cg.digi.model;

public class WindowsDetails {

private String idwindowsdetails;
private String windowsname;
private String windowsdetails;
private String status;
private String creationtime;
private String createdby;
private String modificationtime;
private String modifiedby;
public WindowsDetails() {
	super();
}
public WindowsDetails(String idwindowsdetails, String windowsname, String windowsdetails, String status, String creationtime,
		String createdby, String modificationtime, String modifiedby) {
	super();
	this.idwindowsdetails = idwindowsdetails;
	this.windowsname = windowsname;
	this.windowsdetails = windowsdetails;
	this.status = status;
	this.creationtime = creationtime;
	this.createdby = createdby;
	this.modificationtime = modificationtime;
	this.modifiedby = modifiedby;
}
public String getIdwindowsdetails() {
	return idwindowsdetails;
}
public void setIdwindowsdetails(String idwindowsdetails) {
	this.idwindowsdetails = idwindowsdetails;
}
public String getWindowsname() {
	return windowsname;
}
public void setWindowsname(String windowsname) {
	this.windowsname = windowsname;
}
public String getWindowsdetails() {
	return windowsdetails;
}
public void setWindowsdetails(String windowsdetails) {
	this.windowsdetails = windowsdetails;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getCreationtime() {
	return creationtime;
}
public void setCreationtime(String creationtime) {
	this.creationtime = creationtime;
}
public String getCreatedby() {
	return createdby;
}
public void setCreatedby(String createdby) {
	this.createdby = createdby;
}
public String getModificationtime() {
	return modificationtime;
}
public void setModificationtime(String modificationtime) {
	this.modificationtime = modificationtime;
}
public String getModifiedby() {
	return modifiedby;
}
public void setModifiedby(String modifiedby) {
	this.modifiedby = modifiedby;
}
@Override
public String toString() {
	return "WindowsDetails [idwindowsdetails=" + idwindowsdetails + ", windowsname=" + windowsname + ", windowsdetails=" + windowsdetails + ", status="
			+ status + ", creationtime=" + creationtime + ", createdby=" + createdby + ", modificationtime="
			+ modificationtime + ", modifiedby=" + modifiedby + "]";
}
	

	
}
