package android.rezkyaulia.com.robusta.data.local.database.entity;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

@Entity(nameInDb = "UserSalesTbl",indexes = {
        @Index(value = "SalesId", unique = true)
})
public class UserSalesTbl {
    @Id
    @Property(nameInDb = "SalesId")
    private Long SalesId;

    @Property(nameInDb = "SalesBranchId")
    private Long SalesBranchId;

    @Property(nameInDb = "SalesName")
    private String SalesName;

    @Property(nameInDb = "SalesPosition")
    private String SalesPosition;

    @Property(nameInDb = "SalesDept")
    private String SalesDept;

    @Property(nameInDb = "SalesPhone")
    private String SalesPhone;


    @Property(nameInDb = "SalesMobileNumber")
    private String SalesMobileNumber;

    @Property(nameInDb = "SalesEmail")
    private String SalesEmail;

    @Property(nameInDb = "SalesCreated")
    private String SalesCreated;

    @Generated(hash = 153906159)
    public UserSalesTbl(Long SalesId, Long SalesBranchId, String SalesName,
            String SalesPosition, String SalesDept, String SalesPhone,
            String SalesMobileNumber, String SalesEmail, String SalesCreated) {
        this.SalesId = SalesId;
        this.SalesBranchId = SalesBranchId;
        this.SalesName = SalesName;
        this.SalesPosition = SalesPosition;
        this.SalesDept = SalesDept;
        this.SalesPhone = SalesPhone;
        this.SalesMobileNumber = SalesMobileNumber;
        this.SalesEmail = SalesEmail;
        this.SalesCreated = SalesCreated;
    }

    @Generated(hash = 730310576)
    public UserSalesTbl() {
    }

    public Long getSalesId() {
        return this.SalesId;
    }

    public void setSalesId(Long SalesId) {
        this.SalesId = SalesId;
    }

    public String getSalesName() {
        return this.SalesName;
    }

    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    public String getSalesPosition() {
        return this.SalesPosition;
    }

    public void setSalesPosition(String SalesPosition) {
        this.SalesPosition = SalesPosition;
    }

    public String getSalesDept() {
        return this.SalesDept;
    }

    public void setSalesDept(String SalesDept) {
        this.SalesDept = SalesDept;
    }

    public String getSalesPhone() {
        return this.SalesPhone;
    }

    public void setSalesPhone(String SalesPhone) {
        this.SalesPhone = SalesPhone;
    }

    public String getSalesMobileNumber() {
        return this.SalesMobileNumber;
    }

    public void setSalesMobileNumber(String SalesMobileNumber) {
        this.SalesMobileNumber = SalesMobileNumber;
    }

    public String getSalesEmail() {
        return this.SalesEmail;
    }

    public void setSalesEmail(String SalesEmail) {
        this.SalesEmail = SalesEmail;
    }

    public String getSalesCreated() {
        return this.SalesCreated;
    }

    public void setSalesCreated(String SalesCreated) {
        this.SalesCreated = SalesCreated;
    }

    public Long getSalesBranchId() {
        return this.SalesBranchId;
    }

    public void setSalesBranchId(Long SalesBranchId) {
        this.SalesBranchId = SalesBranchId;
    }



}
