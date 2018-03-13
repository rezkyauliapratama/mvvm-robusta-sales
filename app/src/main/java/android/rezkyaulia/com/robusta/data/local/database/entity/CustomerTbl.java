package android.rezkyaulia.com.robusta.data.local.database.entity;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "CustomerTbl",indexes = {
        @Index(value = "CustId", unique = true)
})
public class CustomerTbl implements Parcelable {
    @Id
    @Property(nameInDb = "CustId")
    private Long CustId;

    @Property(nameInDb = "CustName")
    private String CustName;

    @Property(nameInDb = "CustContact1")
    private String CustContact1;

    @Property(nameInDb = "CustContact2")
    private String CustContact2;

    @Property(nameInDb = "CustAddress1")
    private String CustAddress1;

    @Property(nameInDb = "CustAddress2")
    private String CustAddress2;


    @Property(nameInDb = "CustPhone")
    private String CustPhone;

    @Property(nameInDb = "CustMobilePhone")
    private String CustMobilePhone;

    @Property(nameInDb = "CustEmail")
    private String CustEmail;

    @Property(nameInDb = "CustPicture")
    private String CustPicture;

    @Property(nameInDb = "CustLatitude")
    private double CustLatitude;

    @Property(nameInDb = "CustLongitude")
    private double CustLongitude;

    @Property(nameInDb = "CustAccountNumber")
    private String CustAccountNumber;

    @Property(nameInDb = "CustContractNumber")
    private String CustContractNumber;

    @Property(nameInDb = "CustCreated")
    private String CustCreated;

    @Property(nameInDb = "CustBarcode")
    private String CustBarcode;

    @Property(nameInDb = "CustProvinceId")
    private Long CustProvinceId;

    @Property(nameInDb = "CustCityId")
    private Long CustCityId;

    @Property(nameInDb = "CustBranchId")
    private Long CustBranchId;

    @Override
    public String toString() {

        return getCustName();
    }

    public Long getCustId() {
    return this.CustId;
}

public void setCustId(Long CustId) {
    this.CustId = CustId;
}

public String getCustName() {
    return this.CustName;
}

public void setCustName(String CustName) {
    this.CustName = CustName;
}

public String getCustContact1() {
    return this.CustContact1;
}

public void setCustContact1(String CustContact1) {
    this.CustContact1 = CustContact1;
}

public String getCustContact2() {
    return this.CustContact2;
}

public void setCustContact2(String CustContact2) {
    this.CustContact2 = CustContact2;
}

public String getCustAddress1() {
    return this.CustAddress1;
}

public void setCustAddress1(String CustAddress1) {
    this.CustAddress1 = CustAddress1;
}

public String getCustAddress2() {
    return this.CustAddress2;
}

public void setCustAddress2(String CustAddress2) {
    this.CustAddress2 = CustAddress2;
}

public String getCustPhone() {
    return this.CustPhone;
}

public void setCustPhone(String CustPhone) {
    this.CustPhone = CustPhone;
}

public String getCustMobilePhone() {
    return this.CustMobilePhone;
}

public void setCustMobilePhone(String CustMobilePhone) {
    this.CustMobilePhone = CustMobilePhone;
}

public String getCustEmail() {
    return this.CustEmail;
}

public void setCustEmail(String CustEmail) {
    this.CustEmail = CustEmail;
}

public String getCustPicture() {
    return this.CustPicture;
}

public void setCustPicture(String CustPicture) {
    this.CustPicture = CustPicture;
}

public double getCustLatitude() {
    return this.CustLatitude;
}

public void setCustLatitude(double CustLatitude) {
    this.CustLatitude = CustLatitude;
}

public double getCustLongitude() {
    return this.CustLongitude;
}

public void setCustLongitude(double CustLongitude) {
    this.CustLongitude = CustLongitude;
}

public String getCustAccountNumber() {
    return this.CustAccountNumber;
}

public void setCustAccountNumber(String CustAccountNumber) {
    this.CustAccountNumber = CustAccountNumber;
}

public String getCustContractNumber() {
    return this.CustContractNumber;
}

public void setCustContractNumber(String CustContractNumber) {
    this.CustContractNumber = CustContractNumber;
}

public String getCustCreated() {
    return this.CustCreated;
}

public void setCustCreated(String CustCreated) {
    this.CustCreated = CustCreated;
}

public String getCustBarcode() {
    return this.CustBarcode;
}

public void setCustBarcode(String CustBarcode) {
    this.CustBarcode = CustBarcode;
}

public Long getCustProvinceId() {
    return this.CustProvinceId;
}

public void setCustProvinceId(Long CustProvinceId) {
    this.CustProvinceId = CustProvinceId;
}

public Long getCustCityId() {
    return this.CustCityId;
}

public void setCustCityId(Long CustCityId) {
    this.CustCityId = CustCityId;
}

public Long getCustBranchId() {
    return this.CustBranchId;
}

public void setCustBranchId(Long CustBranchId) {
    this.CustBranchId = CustBranchId;
}

    public CustomerTbl(String custName) {
        CustName = custName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.CustId);
        dest.writeString(this.CustName);
        dest.writeString(this.CustContact1);
        dest.writeString(this.CustContact2);
        dest.writeString(this.CustAddress1);
        dest.writeString(this.CustAddress2);
        dest.writeString(this.CustPhone);
        dest.writeString(this.CustMobilePhone);
        dest.writeString(this.CustEmail);
        dest.writeString(this.CustPicture);
        dest.writeDouble(this.CustLatitude);
        dest.writeDouble(this.CustLongitude);
        dest.writeString(this.CustAccountNumber);
        dest.writeString(this.CustContractNumber);
        dest.writeString(this.CustCreated);
        dest.writeString(this.CustBarcode);
        dest.writeValue(this.CustProvinceId);
        dest.writeValue(this.CustCityId);
        dest.writeValue(this.CustBranchId);
    }

    protected CustomerTbl(Parcel in) {
        this.CustId = (Long) in.readValue(Long.class.getClassLoader());
        this.CustName = in.readString();
        this.CustContact1 = in.readString();
        this.CustContact2 = in.readString();
        this.CustAddress1 = in.readString();
        this.CustAddress2 = in.readString();
        this.CustPhone = in.readString();
        this.CustMobilePhone = in.readString();
        this.CustEmail = in.readString();
        this.CustPicture = in.readString();
        this.CustLatitude = in.readDouble();
        this.CustLongitude = in.readDouble();
        this.CustAccountNumber = in.readString();
        this.CustContractNumber = in.readString();
        this.CustCreated = in.readString();
        this.CustBarcode = in.readString();
        this.CustProvinceId = (Long) in.readValue(Long.class.getClassLoader());
        this.CustCityId = (Long) in.readValue(Long.class.getClassLoader());
        this.CustBranchId = (Long) in.readValue(Long.class.getClassLoader());
    }

    @Generated(hash = 481801314)
    public CustomerTbl(Long CustId, String CustName, String CustContact1,
            String CustContact2, String CustAddress1, String CustAddress2,
            String CustPhone, String CustMobilePhone, String CustEmail,
            String CustPicture, double CustLatitude, double CustLongitude,
            String CustAccountNumber, String CustContractNumber, String CustCreated,
            String CustBarcode, Long CustProvinceId, Long CustCityId,
            Long CustBranchId) {
        this.CustId = CustId;
        this.CustName = CustName;
        this.CustContact1 = CustContact1;
        this.CustContact2 = CustContact2;
        this.CustAddress1 = CustAddress1;
        this.CustAddress2 = CustAddress2;
        this.CustPhone = CustPhone;
        this.CustMobilePhone = CustMobilePhone;
        this.CustEmail = CustEmail;
        this.CustPicture = CustPicture;
        this.CustLatitude = CustLatitude;
        this.CustLongitude = CustLongitude;
        this.CustAccountNumber = CustAccountNumber;
        this.CustContractNumber = CustContractNumber;
        this.CustCreated = CustCreated;
        this.CustBarcode = CustBarcode;
        this.CustProvinceId = CustProvinceId;
        this.CustCityId = CustCityId;
        this.CustBranchId = CustBranchId;
    }

    @Generated(hash = 1573023571)
    public CustomerTbl() {
    }

    public static final Creator<CustomerTbl> CREATOR = new Creator<CustomerTbl>() {
        @Override
        public CustomerTbl createFromParcel(Parcel source) {
            return new CustomerTbl(source);
        }

        @Override
        public CustomerTbl[] newArray(int size) {
            return new CustomerTbl[size];
        }
    };
}
