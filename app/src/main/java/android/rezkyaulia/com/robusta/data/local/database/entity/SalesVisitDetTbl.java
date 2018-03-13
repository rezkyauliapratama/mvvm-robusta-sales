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
@Entity(nameInDb = "SalesVisitDetTbl",indexes = {
        @Index(value = "_id", unique = true)
})
public class SalesVisitDetTbl {
    @Id
    @Property(nameInDb = "_id")
    @SerializedName("_id")
    private Long _id;

    @Property(nameInDb = "SalesVisitDetId")
    @SerializedName("ActivitydetId")
    private Long SalesVisitDetId;

    @Property(nameInDb = "SalesVisitId")
    @SerializedName("ActivitydetActivityId")
    private Long SalesVisitId;

    @Property(nameInDb = "TypeId")
    @SerializedName("ActivitydetTypeId")
    private Long TypeId;

    @Property(nameInDb = "RoomId")
    @SerializedName("ActivitydetRoomId")
    private Long RoomId;

    @Property(nameInDb = "Guid")
    @SerializedName("SalesVisitDetGuid")
    private String Guid;

    @Property(nameInDb = "Description")
    @SerializedName("ActivitydetDescription ")
    private String Description;

    @Property(nameInDb = "FlagPo")
    @SerializedName("AcitivitydetFlagPo")
    private int FlagPo;

    @Transient
    @SerializedName("ActivityCompetitors")
    private List<SalesVisitCompetitorTbl> ActivityCompetitors;

    @Transient
    @SerializedName("ActivityClients")
    private List<SalesVisitClientTbl> ActivityClients;

    @Transient
    @SerializedName("ActivityProducts")
    private List<SalesVisitProductTbl> ActivityProducts;


    @Property(nameInDb = "CreatedDate")
    @SerializedName("CreatedDate")
    private String CreatedDate;

    @Property(nameInDb = "PoImg ")
    @SerializedName("ActivitydetPoImg ")
    private String PoImg ;



    @Generated(hash = 1427347834)
    public SalesVisitDetTbl(Long _id, Long SalesVisitDetId, Long SalesVisitId, Long TypeId,
            Long RoomId, String Guid, String Description, int FlagPo, String CreatedDate,
            String PoImg) {
        this._id = _id;
        this.SalesVisitDetId = SalesVisitDetId;
        this.SalesVisitId = SalesVisitId;
        this.TypeId = TypeId;
        this.RoomId = RoomId;
        this.Guid = Guid;
        this.Description = Description;
        this.FlagPo = FlagPo;
        this.CreatedDate = CreatedDate;
        this.PoImg = PoImg;
    }

    @Generated(hash = 1952465776)
    public SalesVisitDetTbl() {
    }



    public Long getSalesVisitId() {
    return this.SalesVisitId;
}

public void setSalesVisitId(Long SalesVisitId) {
    this.SalesVisitId = SalesVisitId;
}

public Long getTypeId() {
    return this.TypeId;
}

public void setTypeId(Long TypeId) {
    this.TypeId = TypeId;
}

public Long getRoomId() {
    return this.RoomId;
}

public void setRoomId(Long RoomId) {
    this.RoomId = RoomId;
}

public String getDescription() {
    return this.Description;
}

public void setDescription(String Description) {
    this.Description = Description;
}

public int getFlagPo() {
    return this.FlagPo;
}

public void setFlagPo(int FlagPo) {
    this.FlagPo = FlagPo;
}

    public List<SalesVisitCompetitorTbl> getActivityCompetitors() {
        return ActivityCompetitors;
    }

    public void setActivityCompetitors(List<SalesVisitCompetitorTbl> activityCompetitors) {
        ActivityCompetitors = activityCompetitors;
    }

    public List<SalesVisitClientTbl> getActivityClients() {
        return ActivityClients;
    }

    public void setActivityClients(List<SalesVisitClientTbl> activityClients) {
        ActivityClients = activityClients;
    }

    public List<SalesVisitProductTbl> getActivityProducts() {
        return ActivityProducts;
    }

    public void setActivityProducts(List<SalesVisitProductTbl> activityProducts) {
        ActivityProducts = activityProducts;
    }

    public Long get_id() {
        return this._id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Long getSalesVisitDetId() {
        return this.SalesVisitDetId;
    }

    public void setSalesVisitDetId(Long SalesVisitDetId) {
        this.SalesVisitDetId = SalesVisitDetId;
    }

    public String getGuid() {
        return this.Guid;
    }

    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    public String getCreatedDate() {
        return this.CreatedDate;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public String getPoImg() {
        return this.PoImg;
    }

    public void setPoImg(String PoImg) {
        this.PoImg = PoImg;
    }

}
