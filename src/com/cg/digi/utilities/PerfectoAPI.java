/******************************************************************************
Copyright � 2016 Capgemini Group of companies. All rights reserved
(Subject to Limited Distribution and Restricted Disclosure Only.)
THIS SOURCE FILE MAY CONTAIN INFORMATION WHICH IS THE PROPRIETARY
INFORMATION OF Capgemini GROUP OF COMPANIES AND IS INTENDED FOR USE
ONLY BY THE ENTITY WHO IS ENTITLED TO AND MAY CONTAIN
INFORMATION THAT IS PRIVILEGED, CONFIDENTIAL, OR EXEMPT FROM
DISCLOSURE UNDER APPLICABLE LAW.
YOUR ACCESS TO THIS SOURCE FILE IS GOVERNED BY THE TERMS AND
CONDITIONS OF AN AGREEMENT BETWEEN YOU AND Capgemini GROUP OF COMPANIES.
The USE, DISCLOSURE REPRODUCTION OR TRANSFER OF THIS PROGRAM IS
RESTRICTED AS SET FORTH THEREIN.
******************************************************************************/

package com.cg.digi.utilities;

import java.util.List;

import com.cg.digi.model.Handset;

public class PerfectoAPI {
	
		public static void main(String[] args) {
			
			RESTAPICall rest = new RESTAPICall();
			
			String username="mobileapplicationtestinglab.in@capgemini.com";
			String password="asdf123";
			//https://partners.perfectomobile.com/services/handsets?operation=list&user=anuja.saraf@capgemini.com&password=April@2017
			String URL ="https://partners.perfectomobile.com/services/handsets?operation=list&user="+username+"&password="+password;
			String xmlString=rest.callRESTAPI(URL);
			//List<Handset> handsetDetailList= new XMLParser().getDeviceList(xmlString);
		/*	for(Handset s: handsetDetailList){
				System.out.println(s.getSrNo()+" "+s.getDeviceName()+" "+s.getDeviceId()+" "+s.getOs()+" "+s.getVersion()+" "+s.getStatus()+" "+s.getReservationId() );
			}*/
		}
		
		public  List<Handset> getDeviceList(String username , String password){
			String URL ="https://partners.perfectomobile.com/services/handsets?operation=list&user="+username+"&password="+password;
			String xmlString=new RESTAPICall().callRESTAPI(URL);
			List<Handset> handsetDetailList= new XMLParser().getDeviceList(xmlString);
			return handsetDetailList;
		}
		
		public  String reserveDevice(String deviceId){
			String username="mobileapplicationtestinglab.in@capgemini.com";
			String password="asdf123";
			// https://partners.perfectomobile.com/services/reservations?operation=create&user=anuja.saraf@capgemini.com&password=April@2017&resourceIds=30EDD233,0E6FBDEEF6C5EECEF71F66904FC4EFDA3F803682&startTime=-1&endTime=1481710827000
			long unixTime = System.currentTimeMillis() + ((90 * 60)*1000);
			String URL ="https://partners.perfectomobile.com/services/reservations?operation=create&user="+username+"&password="+password+"&resourceIds="+deviceId+"&startTime=-1&endTime="+unixTime+"&responseFormat=XML";
			String xmlString=new RESTAPICall().callRESTAPI(URL);
			//String xmlString="<response><reservationIds><reservationId>26520</reservationId><reservationId>26522</reservationId></reservationIds><info><creationTime><formatted>2016-12-14T10:58:27Z</formatted><millis>1481713107178</millis></creationTime><items>2</items><modelVersion>2.6.0.0</modelVersion><productVersion>9.4</productVersion><time>2016-12-14T10:58:27Z</time></info></response>";
			String reservationId= new XMLParser().getreserveId(xmlString);	
			
			return reservationId;
		}
		
		public  void releaseDevice(String reservationId){
			//String username="anuja.saraf@capgemini.com";
		//String password="April@2017";
			//long unixTime = System.currentTimeMillis() + ((90 * 60)*1000);
			//String URL ="https://partners.perfectomobile.com/services/reservations/"+reservationId+"?operation=delete&user="+username+"&password="+password;
			//String xmlString=new RESTAPICall().callRESTAPI(URL);
			
		}
		
}
