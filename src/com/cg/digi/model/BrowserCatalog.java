package com.cg.digi.model;

public class BrowserCatalog implements Comparable<BrowserCatalog>{

	private String browsercatalogid;
	private String marketid;
	private String browsername;
	private String os;
	private String version;
	private String devicetype;
	@Override
	public int compareTo(BrowserCatalog arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getBrowsercatalogid() {
		return browsercatalogid;
	}
	public void setBrowsercatalogid(String browsercatalogid) {
		this.browsercatalogid = browsercatalogid;
	}
	public String getMarketid() {
		return marketid;
	}
	public void setMarketid(String marketid) {
		this.marketid = marketid;
	}
	public String getBrowsername() {
		return browsername;
	}
	public void setBrowsername(String browsername) {
		this.browsername = browsername;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getDevicetype() {
		return devicetype;
	}
	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}


	public BrowserCatalog(String browsercatalogid, String marketid, String browsername, String os, String version,
			String devicetype) {
		super();
		this.browsercatalogid = browsercatalogid;
		this.marketid = marketid;
		this.browsername = browsername;
		this.os = os;
		this.version = version;
		this.devicetype = devicetype;
	}
	@Override
	public String toString() {
		return "BrowserCatalog [browsercatalogid=" + browsercatalogid + ", marketid=" + marketid + ", browsername="
				+ browsername + ", os=" + os + ", version=" + version + ", devicetype=" + devicetype + "]";
	}
	public BrowserCatalog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	