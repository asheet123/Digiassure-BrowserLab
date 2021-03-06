package com.cg.digi.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BrowserMarketTrend implements Comparable<BrowserMarketTrend>{
	private String browserdistributionid;
	private String marketid;
	private String browsername;
	private String month;
	private String value;
	private String status;
	private String creationtime;
	private String createdby;
	private String modifiedby;
	private String modifiedtime;

	public BrowserMarketTrend() {
		super();
	}

	public BrowserMarketTrend(String browserdistributionid, String marketid,
			String browsername, String month, String value, String status,
			String creationtime, String createdby, String modifiedby,
			String modifiedtime) {
		super();
		this.browserdistributionid = browserdistributionid;
		this.marketid = marketid;
		this.browsername = browsername;
		this.month = month;
		this.value = value;
		this.status = status;
		this.creationtime = creationtime;
		this.createdby = createdby;
		this.modifiedby = modifiedby;
		this.modifiedtime = modifiedtime;
	}

	public String getBrowserdistributionid() {
		return browserdistributionid;
	}

	public void setBrowserdistributionid(String browserdistributionid) {
		this.browserdistributionid = browserdistributionid;
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

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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
		return "BrowserMarketTrend [browserdistributionid=" + browserdistributionid
				+ ", marketid=" + marketid + ", browsername=" + browsername
				+ ", month=" + month + ", value=" + value + ", status="
				+ status + ", creationtime=" + creationtime + ", createdby="
				+ createdby + ", modifiedby=" + modifiedby + ", modifiedtime="
				+ modifiedtime + "]";
	}

	@Override
	public int compareTo(BrowserMarketTrend arg0) {
		 Date date1 = null;
		 Date date2 = null;
		try {
			date1 = new SimpleDateFormat("yyyy-MM").parse(arg0.getMonth());
		
		 date2=new SimpleDateFormat("yyyy-MM").parse(getMonth());
		} catch (ParseException e) {
			e.printStackTrace();
		 
	}
		return date2.compareTo(date1);
	}

}
