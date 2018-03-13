package android.rezkyaulia.com.robusta.data.model;

import android.rezkyaulia.com.robusta.data.local.database.entity.BranchTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.CityTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.ClientTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.CompetitorProductTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.CompetitorTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.CustomerTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.DeviceTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.ProductTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.ProvinceTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.RoomTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.SalesScheduleTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.SalesVisitTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.SalesVisitTypeTbl;
import android.rezkyaulia.com.robusta.data.local.database.entity.UserSalesTbl;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */

public class LoginResponse {
    @SerializedName(value = "UserSales")
    private UserSalesTbl UserSales;

    @SerializedName(value = "UserClients")
    private List<ClientTbl> Clients;

    @SerializedName(value = "Customers")
    private List<CustomerTbl> Customers;

    @SerializedName(value = "Products")
    private List<ProductTbl> Products;

    @SerializedName(value = "Schedules")
    private List<SalesScheduleTbl> Schedules;

    @SerializedName(value = "Devices")
    private DeviceTbl Device;

    @SerializedName(value = "Activities")
    private List<SalesVisitTbl> Activities;

    @SerializedName(value = "Branchs")
    private List<BranchTbl> Branchs;

    @SerializedName(value = "Provinces")
    private List<ProvinceTbl> Provinces;

    @SerializedName(value = "Cities")
    private List<CityTbl> Cities;

    @SerializedName(value = "Rooms")
    private List<RoomTbl> Rooms;

    @SerializedName(value = "Competitors")
    private List<CompetitorTbl> Competitors;

    @SerializedName(value = "Activitytypes")
    private List<SalesVisitTypeTbl> Activitytypes;

    @SerializedName(value = "Competitorproducts")
    private List<CompetitorProductTbl> Competitorproducts;


    @SerializedName(value = "token")
    private String Token;


    public LoginResponse() {
    }

    public UserSalesTbl getUserSales() {
        return UserSales;
    }

    public void setUserSales(UserSalesTbl userSales) {
        UserSales = userSales;
    }

    public List<ClientTbl> getClients() {
        return Clients;
    }

    public void setClients(List<ClientTbl> clients) {
        Clients = clients;
    }

    public List<CustomerTbl> getCustomers() {
        return Customers;
    }

    public void setCustomers(List<CustomerTbl> customers) {
        Customers = customers;
    }

    public List<ProductTbl> getProducts() {
        return Products;
    }

    public void setProducts(List<ProductTbl> products) {
        Products = products;
    }

    public DeviceTbl getDevice() {
        return Device;
    }

    public void setDevice(DeviceTbl device) {
        Device = device;
    }

    public List<SalesVisitTbl> getActivities() {
        return Activities;
    }

    public void setActivities(List<SalesVisitTbl> activities) {
        Activities = activities;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public List<SalesScheduleTbl> getSchedules() {
        return Schedules;
    }

    public void setSchedules(List<SalesScheduleTbl> schedules) {
        Schedules = schedules;
    }

    public List<BranchTbl> getBranchs() {
        return Branchs;
    }

    public void setBranchs(List<BranchTbl> branchs) {
        Branchs = branchs;
    }

    public List<ProvinceTbl> getProvinces() {
        return Provinces;
    }

    public void setProvinces(List<ProvinceTbl> provinces) {
        Provinces = provinces;
    }

    public List<CityTbl> getCities() {
        return Cities;
    }

    public void setCities(List<CityTbl> cities) {
        Cities = cities;
    }

    public List<RoomTbl> getRooms() {
        return Rooms;
    }

    public void setRooms(List<RoomTbl> rooms) {
        Rooms = rooms;
    }

    public List<CompetitorTbl> getCompetitors() {
        return Competitors;
    }

    public void setCompetitors(List<CompetitorTbl> competitors) {
        Competitors = competitors;
    }

    public List<SalesVisitTypeTbl> getActivitytypes() {
        return Activitytypes;
    }

    public void setActivitytypes(List<SalesVisitTypeTbl> activitytypes) {
        Activitytypes = activitytypes;
    }

    public List<CompetitorProductTbl> getCompetitorproducts() {
        return Competitorproducts;
    }

    public void setCompetitorproducts(List<CompetitorProductTbl> competitorproducts) {
        Competitorproducts = competitorproducts;
    }
}
