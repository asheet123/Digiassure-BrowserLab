package com.cg.digi.dao;

import java.time.LocalDate;
import java.util.List;

import org.json.simple.JSONArray;

import com.cg.digi.model.Account;
import com.cg.digi.model.BrowserCatalog;
import com.cg.digi.model.BrowserMarket;
import com.cg.digi.model.BrowserMarketTrend;
import com.cg.digi.model.BrowserOsDetails;
import com.cg.digi.model.BrowserOsDistribution;
import com.cg.digi.model.BrowserVendorMarketTrend;
import com.cg.digi.model.Dashboard;
import com.cg.digi.model.DeviceCatalog;
import com.cg.digi.model.Market;
import com.cg.digi.model.MobileLabCatalog;
import com.cg.digi.model.OsDetails;
import com.cg.digi.model.OsDistribution;
import com.cg.digi.model.Project;
import com.cg.digi.model.Reservation;
import com.cg.digi.model.User;
import com.cg.digi.model.UserMarket;
import com.cg.digi.model.UserOsDetails;
import com.cg.digi.model.UserOsDistribution;
import com.cg.digi.model.UserVendorMarketTrend;
import com.cg.digi.model.VendorMarketTrend;
import com.cg.digi.model.Vendor_MarketShare;
import com.cg.digi.model.WindowsDetails;
import com.cg.digi.model.WindowsDistribution;

public interface IDeviceSelectionMatrixDao {	public List<Market> getMarkets();

//Asheet - 12/7
public List<UserMarket> getUserMarkets();
public List<BrowserMarket> getBrowserMarkets();

public List<DeviceCatalog> getDevices();

//Adding for Market selection
//public List<DeviceCatalog> getPopularDevices(String market, String count);

public List<Vendor_MarketShare> getHighestMarket(String market);

public boolean addReservationDetails(Reservation reserve);

public boolean updateDeviceCatalog(String devicecatalogid,String status);

public boolean updateReservationDetails(String deviceid);


boolean updateDeviceCatalog(JSONArray seetsetDevices, String vendor);
public String getPerfectoReserveIdDao(String deviceId);

public List<Reservation> getReservations(List<String> deviceId, String startDate,
		String endDate);

public DeviceCatalog getDeviceDetails(String devicecatalogid);

public List<MobileLabCatalog> getdeviceRequests();


public boolean updateDeviceReservations(String reservationid, String status,
		String comment);

public List<DeviceCatalog> getDevices(String vendor);

public boolean addDeviceDetails(DeviceCatalog device,String vendor);

public boolean deleteDevice(String devicecatalogid);

public boolean updateDeviceCatalog(DeviceCatalog device);

//ALL REQUESTS
public List<MobileLabCatalog> getAllRequestsDao();
public List<MobileLabCatalog> getAllRequestsDao(String createdby);

//REQUESTED BOOKINGS

public List<MobileLabCatalog> getUserRequestedBookingsDao(String createdby);

public List<MobileLabCatalog> getAllRequestedBookingsDao();

//USERS
public List<User> viewUsersDao();
boolean addUserDao(User user);

/////////PROJECTS////////

public List<Project> viewProjectsDao();
public boolean deleteProjectDao(String projectId);
public boolean checkProjectDao(String projectname);
public boolean addProjectDao(Project project);
public boolean editProjectDao(Project project);
public List<Account> getAccountsDao();

public List<Dashboard> getDeviceUsage();

public List<Dashboard> getUserUsage();

public List<String> getVendors();

List<Reservation> getReservations(String userid, String deviceId,
		String startDate);

List<Reservation> getReservationCount();

List<Dashboard> getDeviceUsage(LocalDate start, LocalDate end);

List<Dashboard> getUserUsage(LocalDate start, LocalDate end);

public List<Reservation> getReservationCount(LocalDate start, LocalDate end);

public List<Reservation> getCurrentOfflinrDeviceReservations();

List<VendorMarketTrend> getVendorMarketShare(String marketid);

//Asheet - 12/7
List<UserVendorMarketTrend> getUserVendorMarketShare(String marketid);
List<BrowserVendorMarketTrend> getBrowserVendorMarketShare(String marketid);

Market getMarket(String marketid);

//Asheet - 12/7
UserMarket getUserMarket(String marketid);
BrowserMarket getBrowserMarket(String marketid);

boolean addMarketVendorData(VendorMarketTrend marketTrend);

boolean addMarketOSData(VendorMarketTrend marketTrend);

List<VendorMarketTrend> getOsMarketShare(String marketid);

//Asheet - 12/7
List<UserVendorMarketTrend> getUserOsMarketShare(String marketid);
List<BrowserVendorMarketTrend> getBrowserOsMarketShare(String marketid);

public List<OsDistribution> getOsDistribution(String osid);

//Asheet - 12/7
public List<UserOsDistribution> getUserOsDistribution(String osid);
public List<BrowserOsDistribution> getBrowserOsDistribution(String osid);

public OsDetails getOsDetails(String osName);

//Asheet - 12/7
public UserOsDetails getUserOsDetails(String osName);
public BrowserOsDetails getBrowserOsDetails(String osName);

boolean updateMarketVendorData(String status, String marketId);

public boolean removeMarketVendorOldData(String market);

public boolean updateMarketOSStatus(String status, String marketid);

public boolean removeOSOldData(String market);

List<BrowserMarketTrend> getBrowserMarketShare(String marketid);

List<BrowserMarketTrend> getBrowserMarketShareMobile(String marketid);

boolean addMarketBrowserData(BrowserMarketTrend browserMarketTrend);

boolean addMarketMobileBrowserData(BrowserMarketTrend browserMarketTrend);

boolean updateMarketBrowserData(String status, String marketId);

boolean updateMarketMobileBrowserStatus(String status, String marketid);

public boolean removeMarketMobileBrowserOldData(String market);

public boolean removeMarketBrowserOldData(String market);

public WindowsDetails getWindowsDetails(String windowsName);

public List<WindowsDistribution> getWindowsDistribution(String windowsid, String market);

//public List<BrowserCatalog> getBrowser();

public List<BrowserCatalog> getBrowser(String market, String count);
}
