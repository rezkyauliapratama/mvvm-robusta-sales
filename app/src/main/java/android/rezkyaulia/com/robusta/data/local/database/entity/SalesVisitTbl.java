package android.rezkyaulia.com.robusta.data.local.database.entity;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;

import java.util.List;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "SalesVisitTbl",indexes = {
        @Index(value = "_id", unique = true)
})
public class SalesVisitTbl {
    @Id
    @Property(nameInDb = "_id")
    @SerializedName("_id")
    private Long _id;

    @Property(nameInDb = "SalesVisitId")
    @SerializedName("ActivityId")
    private Long SalesVisitId;

    @Property(nameInDb = "SalesVisitSalesId")
    @SerializedName("ActivitySalesId")
    private Long SalesVisitSalesId;

    @Property(nameInDb = "SalesVisitCustId")
    @SerializedName("ActivityCustId")
    private Long SalesVisitCustId;

    @Property(nameInDb = "SalesVisitUserclientId")
    @SerializedName("ActivityUserclientId")
    private Long SalesVisitUserclientId;

    @Property(nameInDb = "SalesVisitLatitude")
    @SerializedName("ActivityLatitude")
    private double SalesVisitLatitude;

    @Property(nameInDb = "SalesVisitLongitude")
    @SerializedName("ActivityLongitude")
    private double SalesVisitLongitude;

    @Property(nameInDb = "SalesVisitIn")
    @SerializedName("ActivityIn")
    private String SalesVisitIn;

    @Property(nameInDb = "SalesVisitOut")
    @SerializedName("ActivityOut")
    private String SalesVisitOut;

    @Property(nameInDb = "SalesVisitNotes")
    @SerializedName("ActivityNotes")
    private String SalesVisitNotes;

    @Property(nameInDb = "SalesVisitCreated")
    @SerializedName("ActivityCreated")
    private String SalesVisitCreated;

    @Property(nameInDb = "SalesVisitSignCust")
    @SerializedName("ActivitySignCust")
    private String SalesVisitSignCust;

    @Property(nameInDb = "SalesVisitSignSales")
    @SerializedName("ActivitySignSales")
    private String SalesVisitSignSales;

    @Property(nameInDb = "SalesVisitGuid")
    @SerializedName("ActivityGuid")
    private String SalesVisitGuid;

    @Property(nameInDb = "SalesVisitPoImg")
    @SerializedName("ActivityPoImg")
    private String SalesVisitPoImg;

    @Property(nameInDb = "SalesVisitFlagPo")
    @SerializedName("ActivityFlagPo")
    private Boolean SalesVisitFlagPo;

    @Property(nameInDb = "SalesVisitBranchId")
    @SerializedName("ActivityBranchId")
    private Long SalesVisitBranchId;

    @Property(nameInDb = "SalesVisitDesc")
    @SerializedName("ActivityDesc")
    private String SalesVisitDesc;

    @Property(nameInDb = "SalesVisitHiddenImg")
    @SerializedName("ActivityHiddenImg")
    private String SalesVisitHiddenImg;


    @Property(nameInDb = "ActiveFlag")
    @SerializedName("ActiveFlag")
    private int ActiveFlag;

    @Property(nameInDb = "SyncFlag")
    @SerializedName("SyncFlag")
    private int SyncFlag;

    @Property(nameInDb = "SalesVisitCreatedDate")
    @SerializedName("SalesVisitCreatedDate")
    private String SalesVisitCreatedDate;


    @Transient
    @SerializedName("ActivityDetails")
    private List<SalesVisitDetTbl> ActivityDetails;



    @Generated(hash = 258978069)
    public SalesVisitTbl(Long _id, Long SalesVisitId, Long SalesVisitSalesId,
            Long SalesVisitCustId, Long SalesVisitUserclientId,
            double SalesVisitLatitude, double SalesVisitLongitude,
            String SalesVisitIn, String SalesVisitOut, String SalesVisitNotes,
            String SalesVisitCreated, String SalesVisitSignCust,
            String SalesVisitSignSales, String SalesVisitGuid,
            String SalesVisitPoImg, Boolean SalesVisitFlagPo,
            Long SalesVisitBranchId, String SalesVisitDesc,
            String SalesVisitHiddenImg, int ActiveFlag, int SyncFlag,
            String SalesVisitCreatedDate) {
        this._id = _id;
        this.SalesVisitId = SalesVisitId;
        this.SalesVisitSalesId = SalesVisitSalesId;
        this.SalesVisitCustId = SalesVisitCustId;
        this.SalesVisitUserclientId = SalesVisitUserclientId;
        this.SalesVisitLatitude = SalesVisitLatitude;
        this.SalesVisitLongitude = SalesVisitLongitude;
        this.SalesVisitIn = SalesVisitIn;
        this.SalesVisitOut = SalesVisitOut;
        this.SalesVisitNotes = SalesVisitNotes;
        this.SalesVisitCreated = SalesVisitCreated;
        this.SalesVisitSignCust = SalesVisitSignCust;
        this.SalesVisitSignSales = SalesVisitSignSales;
        this.SalesVisitGuid = SalesVisitGuid;
        this.SalesVisitPoImg = SalesVisitPoImg;
        this.SalesVisitFlagPo = SalesVisitFlagPo;
        this.SalesVisitBranchId = SalesVisitBranchId;
        this.SalesVisitDesc = SalesVisitDesc;
        this.SalesVisitHiddenImg = SalesVisitHiddenImg;
        this.ActiveFlag = ActiveFlag;
        this.SyncFlag = SyncFlag;
        this.SalesVisitCreatedDate = SalesVisitCreatedDate;
    }


    @Generated(hash = 870281492)
    public SalesVisitTbl() {
    }



    public Long get_id() {
    return this._id;
}


public void set_id(Long _id) {
    this._id = _id;
}


public Long getSalesVisitId() {
    return this.SalesVisitId;
}


public void setSalesVisitId(Long SalesVisitId) {
    this.SalesVisitId = SalesVisitId;
}


public Long getSalesVisitSalesId() {
    return this.SalesVisitSalesId;
}


public void setSalesVisitSalesId(Long SalesVisitSalesId) {
    this.SalesVisitSalesId = SalesVisitSalesId;
}


public Long getSalesVisitCustId() {
    return this.SalesVisitCustId;
}


public void setSalesVisitCustId(Long SalesVisitCustId) {
    this.SalesVisitCustId = SalesVisitCustId;
}


public Long getSalesVisitUserclientId() {
    return this.SalesVisitUserclientId;
}


public void setSalesVisitUserclientId(Long SalesVisitUserclientId) {
    this.SalesVisitUserclientId = SalesVisitUserclientId;
}


public double getSalesVisitLatitude() {
    return this.SalesVisitLatitude;
}


public void setSalesVisitLatitude(double SalesVisitLatitude) {
    this.SalesVisitLatitude = SalesVisitLatitude;
}


public double getSalesVisitLongitude() {
    return this.SalesVisitLongitude;
}


public void setSalesVisitLongitude(double SalesVisitLongitude) {
    this.SalesVisitLongitude = SalesVisitLongitude;
}


public String getSalesVisitIn() {
    return this.SalesVisitIn;
}


public void setSalesVisitIn(String SalesVisitIn) {
    this.SalesVisitIn = SalesVisitIn;
}


public String getSalesVisitOut() {
    return this.SalesVisitOut;
}


public void setSalesVisitOut(String SalesVisitOut) {
    this.SalesVisitOut = SalesVisitOut;
}


public String getSalesVisitNotes() {
    return this.SalesVisitNotes;
}


public void setSalesVisitNotes(String SalesVisitNotes) {
    this.SalesVisitNotes = SalesVisitNotes;
}


public String getSalesVisitCreated() {
    return this.SalesVisitCreated;
}


public void setSalesVisitCreated(String SalesVisitCreated) {
    this.SalesVisitCreated = SalesVisitCreated;
}


public String getSalesVisitSignCust() {
    return this.SalesVisitSignCust;
}


public void setSalesVisitSignCust(String SalesVisitSignCust) {
    this.SalesVisitSignCust = SalesVisitSignCust;
}


public String getSalesVisitSignSales() {
    return this.SalesVisitSignSales;
}


public void setSalesVisitSignSales(String SalesVisitSignSales) {
    this.SalesVisitSignSales = SalesVisitSignSales;
}


public String getSalesVisitGuid() {
    return this.SalesVisitGuid;
}


public void setSalesVisitGuid(String SalesVisitGuid) {
    this.SalesVisitGuid = SalesVisitGuid;
}


public String getSalesVisitPoImg() {
    return this.SalesVisitPoImg;
}


public void setSalesVisitPoImg(String SalesVisitPoImg) {
    this.SalesVisitPoImg = SalesVisitPoImg;
}


public Boolean getSalesVisitFlagPo() {
    return this.SalesVisitFlagPo;
}


public void setSalesVisitFlagPo(Boolean SalesVisitFlagPo) {
    this.SalesVisitFlagPo = SalesVisitFlagPo;
}


public Long getSalesVisitBranchId() {
    return this.SalesVisitBranchId;
}


public void setSalesVisitBranchId(Long SalesVisitBranchId) {
    this.SalesVisitBranchId = SalesVisitBranchId;
}


public String getSalesVisitDesc() {
    return this.SalesVisitDesc;
}


public void setSalesVisitDesc(String SalesVisitDesc) {
    this.SalesVisitDesc = SalesVisitDesc;
}


public String getSalesVisitHiddenImg() {
    return this.SalesVisitHiddenImg;
}


public void setSalesVisitHiddenImg(String SalesVisitHiddenImg) {
    this.SalesVisitHiddenImg = SalesVisitHiddenImg;
}


public int getActiveFlag() {
    return this.ActiveFlag;
}


public void setActiveFlag(int ActiveFlag) {
    this.ActiveFlag = ActiveFlag;
}


public int getSyncFlag() {
    return this.SyncFlag;
}


public void setSyncFlag(int SyncFlag) {
    this.SyncFlag = SyncFlag;
}


    public List<SalesVisitDetTbl> getActivityDetails() {
        return ActivityDetails;
    }

    public void setActivityDetails(List<SalesVisitDetTbl> activityDetails) {
        ActivityDetails = activityDetails;
    }


    public String getSalesVisitCreatedDate() {
        return this.SalesVisitCreatedDate;
    }


    public void setSalesVisitCreatedDate(String SalesVisitCreatedDate) {
        this.SalesVisitCreatedDate = SalesVisitCreatedDate;
    }
}