package android.rezkyaulia.com.robusta.data.local.database.entity;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by Rezky Aulia Pratama on 12/17/2017.
 */
@Entity(nameInDb = "SalesVisitClientTbl",indexes = {
        @Index(value = "_id", unique = true)
})
public class SalesVisitClientTbl/* implements Parcelable*/{
    @Id
    @Property(nameInDb = "_id")
    @SerializedName("_id")
    private Long _id;


    @Property(nameInDb = "SalesVisitClientId")
    @SerializedName("ActclientId")
    private Long SalesVisitClientId;

    @Property(nameInDb = "SalesVisitDetailId")
    @SerializedName("ActclientActivitydetId")
    private Long SalesVisitDetailId;

    @Property(nameInDb = "UserClientId")
    @SerializedName("ActclientUserclientId")
    private Long UserClientId;

    @Property(nameInDb = "Sign")
    @SerializedName("ActclientSign")
    private String Sign;


    @Property(nameInDb = "_detid")
    @SerializedName("_detid")
    private Long _detid;


@Generated(hash = 1104255799)
public SalesVisitClientTbl(Long _id, Long SalesVisitClientId,
        Long SalesVisitDetailId, Long UserClientId, String Sign, Long _detid) {
    this._id = _id;
    this.SalesVisitClientId = SalesVisitClientId;
    this.SalesVisitDetailId = SalesVisitDetailId;
    this.UserClientId = UserClientId;
    this.Sign = Sign;
    this._detid = _detid;
}

@Generated(hash = 1657209447)
public SalesVisitClientTbl() {
}


    public Long getSalesVisitDetailId() {
    return this.SalesVisitDetailId;
}

public void setSalesVisitDetailId(Long SalesVisitDetailId) {
    this.SalesVisitDetailId = SalesVisitDetailId;
}

public Long getUserClientId() {
    return this.UserClientId;
}

public void setUserClientId(Long UserClientId) {
    this.UserClientId = UserClientId;
}

public String getSign() {
    return this.Sign;
}

public void setSign(String Sign) {
    this.Sign = Sign;
}

public Long get_id() {
    return this._id;
}

public void set_id(Long _id) {
    this._id = _id;
}

public Long getSalesVisitClientId() {
    return this.SalesVisitClientId;
}

public void setSalesVisitClientId(Long SalesVisitClientId) {
    this.SalesVisitClientId = SalesVisitClientId;
}


public Long get_detid() {
    return this._detid;
}


public void set_detid(Long _detid) {
    this._detid = _detid;
}


}
