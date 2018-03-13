package android.rezkyaulia.com.robusta.data.local.database.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "BranchTbl",indexes = {
        @Index(value = "BranchId", unique = true)
})
public class BranchTbl {
    @Id
    @Property(nameInDb = "BranchId")
    private Long BranchId;

    @Property(nameInDb = "BranchName")
    private String BranchName;

    @Property(nameInDb = "BranchAddress")
    private String BranchAddress;

    @Property(nameInDb = "BranchCityId")
    private Long BranchCityId;

    @Property(nameInDb = "BranchProvinceId")
    private Long BranchProvinceId;

    @Property(nameInDb = "BranchZip")
    private String BranchZip;

    @Property(nameInDb = "BranchCreated")
    private String BranchCreated;

    @Property(nameInDb = "BranchSpvId")
    private Long BranchSpvId;

@Generated(hash = 1564197088)
public BranchTbl(Long BranchId, String BranchName, String BranchAddress,
        Long BranchCityId, Long BranchProvinceId, String BranchZip,
        String BranchCreated, Long BranchSpvId) {
    this.BranchId = BranchId;
    this.BranchName = BranchName;
    this.BranchAddress = BranchAddress;
    this.BranchCityId = BranchCityId;
    this.BranchProvinceId = BranchProvinceId;
    this.BranchZip = BranchZip;
    this.BranchCreated = BranchCreated;
    this.BranchSpvId = BranchSpvId;
}

@Generated(hash = 1218013246)
public BranchTbl() {
}

public Long getBranchId() {
    return this.BranchId;
}

public void setBranchId(Long BranchId) {
    this.BranchId = BranchId;
}

public String getBranchName() {
    return this.BranchName;
}

public void setBranchName(String BranchName) {
    this.BranchName = BranchName;
}

public String getBranchAddress() {
    return this.BranchAddress;
}

public void setBranchAddress(String BranchAddress) {
    this.BranchAddress = BranchAddress;
}

public Long getBranchCityId() {
    return this.BranchCityId;
}

public void setBranchCityId(Long BranchCityId) {
    this.BranchCityId = BranchCityId;
}

public Long getBranchProvinceId() {
    return this.BranchProvinceId;
}

public void setBranchProvinceId(Long BranchProvinceId) {
    this.BranchProvinceId = BranchProvinceId;
}

public String getBranchZip() {
    return this.BranchZip;
}

public void setBranchZip(String BranchZip) {
    this.BranchZip = BranchZip;
}

public String getBranchCreated() {
    return this.BranchCreated;
}

public void setBranchCreated(String BranchCreated) {
    this.BranchCreated = BranchCreated;
}

public Long getBranchSpvId() {
    return this.BranchSpvId;
}

public void setBranchSpvId(Long BranchSpvId) {
    this.BranchSpvId = BranchSpvId;
}



}
